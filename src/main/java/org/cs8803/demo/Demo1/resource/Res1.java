package org.cs8803.demo.Demo1.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.cs8803.demo.Demo1.model.Model1;
import org.cs8803.demo.Demo1.service.Service1;

@Path("/messages")
public class Res1 {
	
	Model1 model=new Model1();
	Service1 service =new Service1();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hw(){
		return "hello world!";
	}
	
	
	@Path("/xml")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Model1> getAllMessagesXML(){
		return service.getAllMessages();
	}	
	
	@Path("/json")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Model1> getAllMessagesJSON(){
		return service.getAllMessages();
	}
	
	@Path("/{messageid}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Model1 getMessage(@PathParam("messageid") long id){
		return service.getMessage(id);
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Model1 addMessage(Model1 message){
		return service.addMessage(message);
	}
	
	
	@Path("/{messageid}")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Model1 updateMessage(@PathParam("messageid") long id,Model1 message){
		message.setId(id);
		return service.updateMessage(message);
	}

	@Path("/{messageid}")
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	public Model1 removeMessage(@PathParam("messageid") long id){
		return service.remMessage(id);
	}
	
}






