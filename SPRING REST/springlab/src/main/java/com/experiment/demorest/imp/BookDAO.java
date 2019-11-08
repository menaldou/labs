package com.experiment.demorest.imp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.experiment.demorest.dao.IBookDAO;
import com.experiment.demorest.dto.Book;
import com.experiment.demorest.model.DBAuthor;
import com.experiment.demorest.model.DBBook;
import com.experiment.demorest.repo.IAuthorRepo;
import com.experiment.demorest.repo.IBookRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
public class BookDAO implements IBookDAO{

    @Autowired
    private IBookRepo repo;

    @Autowired
    private IAuthorRepo repoAuthor;
    @Override
    public List<Book> getAll(){
        List<Book> list = new ArrayList<>();
        try {
            List<DBBook> list_dbBook = repo.findAll();
            if (list_dbBook != null) {
                for (DBBook dbBook : list_dbBook) {
                    list.add(toBook(dbBook));
                }
            }
        } catch (Exception e) {
            list = new ArrayList<>();
        }
        return list;
    } 
 

    @Override
    public Book toBook(DBBook dbBook){
        return new Book(dbBook.getId(), 
            dbBook.getName(), 
            dbBook.getPublicationDate(), 
            dbBook.getAuthor().getId());
    } 





    @Override
    public Book get(Integer id){
        Book book = null;
        try {
            Optional<DBBook> dbBook = repo.findById(id);
            if(dbBook != null){
                book = toBook(dbBook.get());
            }
        } catch (Exception e) {
            book = null;
        }
        return book;
    }
    
    @Override
    public Book post(Book book){       
        Book response;
        try{
            Optional<DBAuthor> dbAuthor = repoAuthor.findById(book.getIdAuthor());
            DBBook dbBook = new DBBook(book.getName(), 

            catch(Exception e){
                response = null;
            }
            return response;
        }    
    
    
} 

