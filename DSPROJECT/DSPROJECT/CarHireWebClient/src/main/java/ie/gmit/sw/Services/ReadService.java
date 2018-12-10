package ie.gmit.sw.Services;

import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;

import ie.gmit.sw.DataModel.Carhire;

@Service
public class ReadService {

	public List<Carhire> getData() {
		Client client = Client.create();

		WebResource web = client.resource("http://localhost:8080/CarHireJersey/webapi/myresource");

		return web.get(new GenericType<List<Carhire>>() {
		});

	}

}
