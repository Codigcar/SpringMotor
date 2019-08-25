package pe.edu.upc.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import pe.edu.upc.conexion.Conexion;
import pe.edu.upc.dao.IMotorDao;
import pe.edu.upc.entity.Motor;

public class MotorDaoImpl implements IMotorDao{
	
	private Connection oCn;
	public MotorDaoImpl() {
		oCn=Conexion.AbrirConexion();
	}
	
	@Override
	public void insertar(Motor motor) {
		// TODO Auto-generated method stub
		try {
			String sql="insert into motor(nombreMotor,fechaMotor) "+"values(?,?)";
			PreparedStatement ps=oCn.prepareStatement(sql);
			ps.setString(1, motor.getNombreMotor());
			ps.setDate(2, new java.sql.Date(motor.getFechaMotor().getTime()));
			ps.executeUpdate();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
	}

	@Override
	public List<Motor> listar() {
		// TODO Auto-generated method stub
		List<Motor> lista=new ArrayList<Motor>();
		try {
			String sql="select * from motor";
			PreparedStatement ps=oCn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery(sql);
			while(rs.next()) {
				Motor m=new Motor();
				m.setIdMotor(rs.getInt("idMotor"));
				m.setNombreMotor(rs.getString("nombreMotor"));
				m.setFechaMotor(rs.getDate("fechaMotor"));
				lista.add(m);
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		return lista;
	}

}








