package ie.gmit.sw.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import ie.gmit.sw.DataModel.Carhire;

public class DatabaseServiceImpl extends UnicastRemoteObject implements DatabaseService {

	private static final long serialVersionUID = 1L;
	private Connection conn;
	private Statement stmt;

	protected DatabaseServiceImpl() throws RemoteException, SQLException {
		super();
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/carhirebooking?useSSL=false", "root", "");
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Carhire> read() throws RemoteException, SQLException {
		System.out.println("In read");

		stmt = conn.createStatement();

		List<Carhire> List = new ArrayList<Carhire>();
		String strSelect = "select * from carhire";

		ResultSet rset = stmt.executeQuery(strSelect);

		while (rset.next()) {
			int car_id = rset.getInt("car_id");
			int customer_id = rset.getInt("customer_id");
			int booking_id = rset.getInt("booking_id");
			String TypeOfCar = rset.getString("TypeOfCar");
			String RegNo = rset.getString("RegNo");
			float price = rset.getFloat("price");
			int NoOfDays = rset.getInt("NoOfDays");

			Carhire carhire = new Carhire(car_id, customer_id, booking_id, TypeOfCar, RegNo, price, NoOfDays);
			List.add(carhire);
		}
		return List;
	}

	@Override
	public void delete(int car_id) throws RemoteException, SQLException {
		// TODO Auto-generated method stub
		String sql = "DELETE FROM Carhire WHERE Car_id=?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, car_id);

		int rowsDeleted = statement.executeUpdate();
		if (rowsDeleted > 0) {
			System.out.println("A user was deleted successfully!");

		}

	}

	@Override
	public void insert(Carhire c) throws RemoteException, SQLException {

		System.out.println("In insert");

		String sql = "INSERT INTO CarHire (Customer_id, Booking_id,TypeOfCar, RegNo, Price,NoOfDays) VALUES (?,?,?,?,?,?)";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, c.getCustomerId());
		statement.setInt(2, c.getBookingId());
		statement.setString(3, c.getTypeOfCar());
		statement.setString(4,c.getRegNo());
		statement.setFloat(5, c.getPrice());
		statement.setInt(6, c.getNoOfDays() );
		statement.execute();

	}
	
	@Override
	public void update(Carhire c) throws RemoteException, SQLException {
		System.out.println("row Udated");
		
		String sql = "UPDATE Carhire SET Customer_id=?, Booking_id=?,TypeOfCar=?, RegNo=?, Price=?,NoOfDays=?";

		PreparedStatement statement = conn.prepareStatement(sql);
		statement.setInt(1, c.getCustomerId());
		statement.setInt(2, c.getBookingId());
		statement.setString(3, c.getTypeOfCar());
		statement.setString(4, c.getRegNo());
		statement.setFloat(5, c.getPrice());
		statement.setInt(6, c.getNoOfDays());
		statement.execute();
		
	
	}

}