package Proyecto.Java.DTO;

import java.util.Date;

public class TransacionDTO {
	
	private Long id_trasaciones;
	private Double cantidadDinero;
	private Date Fecha_Hora;


	public TransacionDTO() {
	}

	public Long getId_trasaciones() {
		return id_trasaciones;
	}

	public void setId_trasaciones(Long id_trasaciones) {
		this.id_trasaciones = id_trasaciones;
	}

	public Double getCantidadDinero() {
		return cantidadDinero;
	}

	public void setCantidadDinero(Double cantidadDinero) {
		this.cantidadDinero = cantidadDinero;
	}

	public Date getFecha_Hora() {
		return Fecha_Hora;
	}

	public void setFecha_Hora(Date fecha_Hora) {
		Fecha_Hora = fecha_Hora;
	}
	
}

