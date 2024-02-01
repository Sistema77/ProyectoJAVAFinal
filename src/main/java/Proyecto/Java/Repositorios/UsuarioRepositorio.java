package Proyecto.Java.Repositorios;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import Proyecto.Java.DAO.UsuarioDAO;


public interface UsuarioRepositorio extends JpaRepository<UsuarioDAO, Long> {
	/**
	 * Método que busca un usuario por Dni en la base de datos y lo devuelve
	 * @param dni
	 * @return Usuario o null
	 */
	public UsuarioDAO findByDni(String email);
	
	/**
	 * Método que busca un usuario por Email en la base de datos y lo devuelve
	 * @param email
	 * @return Usuario o null
	 */
	Optional<UsuarioDAO> findByEmail(String email);
	
	
	Optional<UsuarioDAO> findByName(String name);
	
	@Query("SELECT u FROM usuario u WHERE u.id = :id")
    Optional<UsuarioDAO> findByIdCustom(@Param("id") Long id);
	
}
