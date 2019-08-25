package pe.edu.upc.entity;

import java.util.Date;

public class Motor {

	private int idMotor;
	private String nombreMotor;
	private Date fechaMotor;
	public Motor(int idMotor,String nombreMotor,Date fechaMotor) {
		this.idMotor=idMotor;
		this.nombreMotor=nombreMotor;
		this.fechaMotor=fechaMotor;
	}
	
	public Motor() {
		super();
	}

	public int getIdMotor() {
		return idMotor;
	}

	public void setIdMotor(int idMotor) {
		this.idMotor = idMotor;
	}

	public String getNombreMotor() {
		return nombreMotor;
	}

	public void setNombreMotor(String nombreMotor) {
		this.nombreMotor = nombreMotor;
	}

	public Date getFechaMotor() {
		return fechaMotor;
	}

	public void setFechaMotor(Date fechaMotor) {
		this.fechaMotor = fechaMotor;
	}
	
	
}
