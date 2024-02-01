package Proyecto.Java.Servicios;

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
        //  encriptar la contraseña
    	
    	try {
    		Encriptacion nc = new Encriptacion();
    		usuarioDTO.setPassword(nc.EncriptarContra(usuarioDTO.getPassword()));
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
        // Convierte el UsuarioDTO a UsuarioDAO
        UsuarioDAO usuarioDAO = usuarioToDao.usuarioToDao(usuarioDTO);

        // Guarda el usuario en la base de datos
        usuarioDAO = usuarioRepositorio.save(usuarioDAO);

        // Devuelve el UsuarioDTO resultante (podrías devolver solo los datos necesarios)
        return usuarioToDto.usuarioToDto(usuarioDAO);
    }
}