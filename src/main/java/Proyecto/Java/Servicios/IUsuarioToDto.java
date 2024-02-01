package Proyecto.Java.Servicios;

import java.util.List;

import Proyecto.Java.DAO.UsuarioDAO;
import Proyecto.Java.DTO.UsuarioDTO;

/**
 * Interface donde se declaran los metodos que son necesarios para el paso de una entidad
 * usuario (DAO) a usuarioDTO
 */
public interface IUsuarioToDto {
	
	/**
	 * Método que convierte campo a campo un objeto entidad Usuario a usuarioDTO
	 * @param u El usuario a transformar
	 * @return El DTO del usuario
	 */
	public UsuarioDTO usuarioToDto(UsuarioDAO u);
	
	/**
	 * Metodo que convierte todos los objetos entidad usuario DAO a una lista UsuarioDTO 
	 * @param listaUsuario
	 * @return
	 */
	public List<UsuarioDTO> listaUsuarioToDto(List<UsuarioDAO> listaUsuario);
}
