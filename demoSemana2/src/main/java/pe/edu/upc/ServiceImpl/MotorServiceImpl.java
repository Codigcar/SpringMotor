package pe.edu.upc.ServiceImpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.Service.IMotorService;
import pe.edu.upc.dao.IMotorDao;
import pe.edu.upc.entity.Motor;

@Named
@RequestScoped
public class MotorServiceImpl implements IMotorService{

	@Inject
	private IMotorDao mD;

	@Override
	public void insertar(Motor motor) {
		// TODO Auto-generated method stub
		mD.insertar(motor);
	}

	@Override
	public List<Motor> listar() {
		// TODO Auto-generated method stub
		return mD.listar();
	}

	
	

}
