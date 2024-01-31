package Proyecto.Java.DTO;
import java.util.List;




public class UsuarioDTO {

	// Atributos
	private Long id_usuario;
	private String name;
	private String dni;
	private String lastName;
	private String email;
	private String password;
	private String tlf;
	private byte[] foto;
	private String tipoUsuario;

	// Constructor
	public UsuarioDTO() {
	}

	public UsuarioDTO(Long id_usuario, String name, String dni, String lastName, String email, String password,
			String tlf, byte[] foto, String tipoUsuario) {
		super();
		this.id_usuario = id_usuario;
		this.name = name;
		this.dni = dni;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.tlf = tlf;
		this.foto = foto;
		this.tipoUsuario = tipoUsuario;
	}


	// Metodos
	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getTlf() {
		return tlf;
	}

	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}