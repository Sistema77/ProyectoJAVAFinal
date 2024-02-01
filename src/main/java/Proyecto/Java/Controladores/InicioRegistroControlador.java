package Proyecto.Java.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import Proyecto.Java.DAO.UsuarioDAO;
import Proyecto.Java.DTO.UsuarioDTO;
import Proyecto.Java.Servicios.IUsuarioServicio;

@Controller
public class InicioRegistroControlador {
	
	@Autowired
	private IUsuarioServicio usuarioServicio;
	
	@GetMapping("/auth/registrar")
	public String registrarGet(Model model) {
		model.addAttribute("usuarioDTO", new UsuarioDTO());
		return "registro";
	}

	/**
	 * Procesa la solicitud HTTP POST para registro de un nuevo usuario.
	 * @param  usuarioDTO El objeto UsuarioDTO que recibe en el modelo y contiene los
	 *         datos del nuevo usuario.
	 * @return La vista de inicio de sesión (login.html) si fue exitoso el registro; 
	 * 		   de lo contrario, la vista de registro de usuario (registro.html).
	 */
	@PostMapping("/api/registrar")
	public String registrarPost(@ModelAttribute UsuarioDTO usuarioDTO, Model model) {

		UsuarioDTO nuevoUsuario = usuarioServicio.registrar(usuarioDTO);
		
		if (nuevoUsuario != null && nuevoUsuario.getDni() != null) {
			// Si el usuario y el DNI no son null es que el registro se completo correctamente
			model.addAttribute("mensajeRegistroExitoso", "Registro del nuevo usuario OK");
			return "login";
		} else {
			// Se verifica si el DNI ya existe para mostrar error personalizado en la vista
			if (usuarioDTO.getDni() == null) {
				model.addAttribute("mensajeErrorDni", "Ya existe un usuario con ese DNI");
				return "registro";
			} else {
				model.addAttribute("mensajeErrorMail", "Ya existe un usuario con ese email");
				return "registro";
			}
		}
	}
}
