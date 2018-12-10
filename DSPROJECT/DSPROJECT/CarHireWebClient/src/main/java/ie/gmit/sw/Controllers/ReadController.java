package ie.gmit.sw.Controllers;

import java.io.IOException;
import java.util.List;

import javax.xml.bind.JAXBException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ie.gmit.sw.DataModel.Carhire;
import ie.gmit.sw.Services.ReadService;

@Controller
public class ReadController {

//	readOrder

	@Autowired
	private ReadService readService;

	@RequestMapping(value = "/readOrder", method = RequestMethod.GET)
	public String getdata(Model m) throws IOException, JAXBException {

		List<Carhire> carhire = readService.getData();

		m.addAttribute("carhire", carhire);
	
		return "readOrders";
	}
		
		@RequestMapping(value = "/createOrder", method = RequestMethod.POST)
		public String getdata1(Model m) throws IOException, JAXBException {

			List<Carhire> carhire = readService.getData();

			m.addAttribute("carhire", carhire);

			return "createOrders";
	}
		
		@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
		public String getdata2(Model m) throws IOException, JAXBException {

			List<Carhire> carhire = readService.getData();

			m.addAttribute("carhire", carhire);

			return "delete";
		}
		
		@RequestMapping(value = "/update", method = RequestMethod.PUT)
		public String getdata3(Model m) throws IOException, JAXBException {

			List<Carhire> carhire = readService.getData();

			m.addAttribute("carhire", carhire);

			return "update";
		}

}
