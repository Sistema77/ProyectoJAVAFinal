package Proyecto.Java.DTO;

import java.util.Date;

public class CuentaDTO {
	
    private Long id_cuenta;
    private String numeroCuenta;
    private Double saldo;
    private Date fch_apertura;
    private Boolean conNomina;

    
    // Constructor
    
    public CuentaDTO() {
    	
    }

    // Getter / Setter
    
	public Long getId_cuenta() {
		return id_cuenta;
	}

	public void setId_cuenta(Long id_cuenta) {
		this.id_cuenta = id_cuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Date getFch_apertura() {
		return fch_apertura;
	}

	public void setFch_apertura(Date fch_apertura) {
		this.fch_apertura = fch_apertura;
	}

	public Boolean getConNomina() {
		return conNomina;
	}

	public void setConNomina(Boolean conNomina) {
		this.conNomina = conNomina;
	}

}
