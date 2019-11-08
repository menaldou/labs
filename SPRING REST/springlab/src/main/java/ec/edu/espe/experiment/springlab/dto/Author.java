package ec.edu.espe.experiment.springlab.dto; 
 
import java.util.Date;
import java.util.List;

public class Author{
    
    private Integer id;    
    private String name;    
    private String dni;    
    private Date birthDate;     
    private List<Book> books;

    public Author(){

    }

    public Author(Integer id){
        this.id = id;
    }

    public Author(Integer id, String name, String dni, Date birth_date, List<Book> books){
        this.id = id;
        this.name = name;
        this.dni = dni;
        this.birth_date = birth_date;
        this.books = books;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}