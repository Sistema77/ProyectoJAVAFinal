package Proyecto.Java.DTO;

import java.util.Date;

public class CreditoDTO {
	// Atributos
	private Long id_Credito;
	private String tipoPrestamo;
	private Double CantidadPrestamo;
	private Double tasaInteres;
	private String EstadoPrestamo;
	private Double CuotaMensual;
	private Date fch_inicio;
	private Date fch_final;

	// Constructores
	public CreditoDTO() {}

	
	public CreditoDTO(Long id_Credito, String tipoPrestamo, Double cantidadPrestamo, Double tasaInteres,
			String estadoPrestamo, Double cuotaMensual, Date fch_inicio, Date fch_final) {
		super();
		this.id_Credito = id_Credito;
		this.tipoPrestamo = tipoPrestamo;
		CantidadPrestamo = cantidadPrestamo;
		this.tasaInteres = tasaInteres;
		EstadoPrestamo = estadoPrestamo;
		CuotaMensual = cuotaMensual;
		this.fch_inicio = fch_inicio;
		this.fch_final = fch_final;
	}


	// Getter / Setter
	public Long getId_Credito() {
		return id_Credito;
	}

	public void setId_Credito(Long id_Credito) {
		this.id_Credito = id_Credito;
	}

	public String getTipoPrestamo() {
		return tipoPrestamo;
	}

	public void setTipoPrestamo(String tipoPrestamo) {
		this.tipoPrestamo = tipoPrestamo;
	}

	public Double getCantidadPrestamo() {
		return CantidadPrestamo;
	}

	public void setCantidadPrestamo(Double cantidadPrestamo) {
		CantidadPrestamo = cantidadPrestamo;
	}

	public Double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(Double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public String getEstadoPrestamo() {
		return EstadoPrestamo;
	}

	public void setEstadoPrestamo(String estadoPrestamo) {
		EstadoPrestamo = estadoPrestamo;
	}

	public Double getCuotaMensual() {
		return CuotaMensual;
	}

	public void setCuotaMensual(Double cuotaMensual) {
		CuotaMensual = cuotaMensual;
	}

	public Date getFch_inicio() {
		return fch_inicio;
	}

	public void setFch_inicio(Date fch_inicio) {
		this.fch_inicio = fch_inicio;
	}

	public Date getFch_final() {
		return fch_final;
	}

	public void setFch_final(Date fch_final) {
		this.fch_final = fch_final;
	}
}
