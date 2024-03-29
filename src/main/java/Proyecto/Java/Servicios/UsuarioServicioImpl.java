package Proyecto.Java.Servicios;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Proyecto.Java.DAO.UsuarioDAO;
import Proyecto.Java.DTO.UsuarioDTO;
import Proyecto.Java.Repositorios.UsuarioRepositorio;
import Proyecto.Java.Util.Encriptacion;

@Service
public class UsuarioServicioImpl implements IUsuarioServicio {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private IUsuarioToDao usuarioToDao;

    @Override
    public UsuarioDTO registrar(UsuarioDTO usuarioDTO) {
    	try {
			// Comprueba si ya existe un usuario por el DNI
			UsuarioDAO usuarioDNI = usuarioRepositorio.findByDni(usuarioDTO.getDni());

			if (usuarioDNI != null) {
				return null;
			}
			
		//  encriptar la contraseña
	    	try {
	    		Encriptacion nc = new Encriptacion();
	    		usuarioDTO.setPassword(nc.EncriptarContra(usuarioDTO.getPassword()));
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}

			UsuarioDAO usuarioDao = usuarioToDao.usuarioToDao(usuarioDTO);
			usuarioDao.setTipoUsuario("ROLE_USER");
			usuarioDao.setFch_alta(Calendar.getInstance());
			usuarioRepositorio.save(usuarioDao);

			return usuarioDTO;
		} catch (IllegalArgumentException iae) {
			System.out.println("[Error UsuarioServicioImpl - registrar() ]" + iae.getMessage());
		} catch (Exception e) {
			System.out.println("[Error UsuarioServicioImpl - registrar() ]" + e.getMessage());
		}
		return null;
    }
}