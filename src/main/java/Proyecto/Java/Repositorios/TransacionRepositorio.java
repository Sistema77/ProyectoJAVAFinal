package Proyecto.Java.Repositorios;

import java.util.Calendar;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import Proyecto.Java.DAO.TransacionDAO;


public interface TransacionRepositorio extends JpaRepository<TransacionDAO, Long> {
	/**
	 * Método que busca un usuario por Dni en la base de datos y lo devuelve
	 * @param dni
	 * @return Usuario o null
	 */
	Optional<TransacionDAO> findByCantidadDinero(Double cantidadDinero);

	/**
	 * Método que busca un usuario por Email en la base de datos y lo devuelve
	 * @param email
	 * @return Usuario o null
	 */
	Optional<TransacionDAO> findByFecha_Hora(Calendar fecha_Hora);
	
}
