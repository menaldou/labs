package ec.edu.espe.experiment.springlab.dto;

import java.util.Date;

public class Book{

   
    private Integer id;    
    private String name;    
    private Date publicationDate;
    private Integer idAuthor;

    public Book(){

    }

    public Book(Integer id){
        this.id = id;
    }

    public Book(Integer id, String name, Date publicationDat
e, Integer idAuthor){
        this.id = id;
        this.name = name;
        this.publicationDate = publicationDate;
        this.idAuthor = idAuthor;
    } 
   
    //Setters & Getters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Date publication_date) {
        this.publication_date = publication_date;
    }

    public Integer getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(Integer author_id) {
        this.author_id = author_id;
    }
} 