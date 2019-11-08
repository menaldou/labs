/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.school.services;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import ec.edu.espe.school.model.Student;
import javax.ws.rs.PathParam;

/**
 * REST Web Service
 *
 * @author DenniseSandoval
 */
@Path("Student")
public class StudentResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of StudentResource
     */
    public StudentResource() {
    }

    /**
     * Retrieves representation of an instance of ec.edu.espe.school.services.StudentResource
     * @return an instance of university.Student
     */
    @GET
    //@Path("{id}")
    @Produces("application/json")
    public Student getJsonAnyStudent() {
        Student student =new Student(1,"Dennise","Sandoval",8.0f,21);
        return student;
    }
    @GET
    @Path("{id}/{name}")
    @Produces("application/json")
    public Student getJsonStudentById(@PathParam("id") int id, @PathParam("name") String name) {
        Student student =new Student(id,name,"Sandoval",8.0f,21);
        return student;
    }

    /**
     * PUT method for updating or creating an instance of StudentResource
     * @param content representation for the resource
     */
    @PUT
   
    @Consumes(MediaType.APPLICATION_JSON)
    public void putText(Student content) {
    }
}
