package com.JerseyApp.JerseyApp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("student")
public class StudentResource {
	
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
	public Student getStudent(@PathParam("student")String student) {
		
		System.out.println("get Student Called ... !");
		Student st = new Student();
		st.setFirst_name("shadrak");
		st.setSecond_name("Kommalapathi");
		st.setId(500);
		st.setStandard(15);
		st.setMedium("English");
		return st;
		
	}
	

}
