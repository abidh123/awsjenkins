package com.salman.jenkinspurpose.awsjenkins;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/jenkins")
public class Resource {
	Producttest pt=new Producttest();
	@Path("/getproductdetalis")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product>getproductdetalis(){
		return pt.getproductdetalis();
		
	}
	
	

}
