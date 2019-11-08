package com.experiment.demorest.model;


//Importaciones
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;



@Entity
public class DBBook{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Column(name = "name")
    private String name;

    @Column(name = "publication_date")
    @Temporal(TemporalType.DATE)
    private Date publication_date;

    
    @JoinColumn(name = "dbauthor_id")
    @ManyToOne
    private DBAuthor dbauthor;

    public DBBook(){

    }

    public DBBook(Integer id){
        this.id = id;
    }

    public DBBook(String name, Date publication_date, DBAuthor dbauthor){
        this.name = name;
        this.publication_date = publication_date;
        this.dbauthor = dbauthor;
    }

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

    public DBAuthor getDbauthor() {
        return dbauthor;
    }

    public void setDbauthor(DBAuthor dbauthor) {
        this.dbauthor = dbauthor;
    }
  
}

