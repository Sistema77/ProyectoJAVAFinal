package Proyecto.Java.Repositorios;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import Proyecto.Java.DAO.TransacionDAO;


public interface TransacionRepositorio extends JpaRepository<TransacionDAO, Long> {
	/**
	 * Método que busca un usuario por Dni en la base de datos y lo devuelve
	 * @param dni
	 * @return Usuario o null
	 */
	Optional<TransacionDAO> findByCantidadDinero(String cantidadDinero);
	
	/**
	 * Método que busca un usuario por Email en la base de datos y lo devuelve
	 * @param email
	 * @return Usuario o null
	 */
	Optional<TransacionDAO> findByFecha_Hora(String Fecha_Hora);
	
	
	/*Optional<TransacionDAO> findByLastName(String lastName);
	Optional<TransacionDAO> findByPassword(String password);
	Optional<TransacionDAO> findByTlf(String tlf);
	Optional<TransacionDAO> findByFoto(String foto);
	Optional<TransacionDAO> findByTipoUsuario(String tipoUsuario);*/
	
}
