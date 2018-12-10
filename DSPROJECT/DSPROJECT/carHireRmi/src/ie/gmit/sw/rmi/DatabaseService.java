package ie.gmit.sw.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import ie.gmit.sw.DataModel.Carhire;

public interface DatabaseService extends Remote {

	public List<Carhire> read() throws RemoteException, SQLException;
	
	public void delete(int car_id) throws RemoteException, SQLException;
	public void insert(Carhire c) throws RemoteException, SQLException;
	public void update(Carhire c) throws RemoteException, SQLException;

}