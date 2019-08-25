package pe.edu.upc.Service;

import java.util.List;

import pe.edu.upc.entity.Motor;

public interface IMotorService {

	public void insertar(Motor motor);
	public List<Motor>listar();
}
