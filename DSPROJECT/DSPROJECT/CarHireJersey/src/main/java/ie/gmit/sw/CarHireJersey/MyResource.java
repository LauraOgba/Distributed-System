package ie.gmit.sw.CarHireJersey;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import ie.gmit.sw.DataModel.Carhire;
import ie.gmit.sw.rmi.DatabaseService;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     * @throws SQLException 
     * @throws RemoteException 
     * @throws NotBoundException 
     * @throws MalformedURLException 
     */
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Carhire> getIt() throws RemoteException, SQLException, MalformedURLException, NotBoundException {
    	
    	DatabaseService ds  = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");

        return ds.read();
    }

    
    @DELETE
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    @Path("delete")
    public Carhire delete(Carhire c) throws RemoteException, SQLException, MalformedURLException, NotBoundException {
    	
    	DatabaseService ds  = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
    	System.out.println(c.getCarId());
    	ds.delete(c.getCarId());

        return c;
    }
    
    
    @POST
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    @Path("insert")
    public Carhire insert(Carhire c) throws RemoteException, SQLException, MalformedURLException, NotBoundException {
    	
    	DatabaseService ds  = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
    	System.out.println(c.getTypeOfCar());
    	ds.insert(c);

        return c;
    }
    
    @PUT
    @Produces(MediaType.APPLICATION_XML)
    @Consumes(MediaType.APPLICATION_XML)
    @Path("update")
    public Carhire update(Carhire c) throws RemoteException, SQLException, MalformedURLException, NotBoundException {
    	
    	DatabaseService ds  = (DatabaseService) Naming.lookup("rmi://127.0.0.1:1099/database");
    	System.out.println(c.getRegNo());
    	ds.update(c);

        return c;
    }
    
    
}
