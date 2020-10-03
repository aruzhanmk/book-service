package kz.iitu.end.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import kz.iitu.end.entity.Book;
import kz.iitu.end.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @ApiOperation(value	= "List all books", response = Book.class, responseContainer = "List")
    @GetMapping("")
    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    @ApiOperation(value	= "Get book by ID", response = Book.class)
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id)
    {
        return bookRepository.findById(id).get();
    }

    @ApiOperation(value	= "Find book by title", response = Book.class)
    @GetMapping("/find/")
    public Book findBookByTitle(@RequestParam("title") String title)
    {
        return bookRepository.findBookByTitleContaining(title);
    }

//    @ApiOperation(value	= "Find book by author", response = Book.class, responseContainer = "List")
//    @GetMapping("/findByAuthor/")
//    public List<Book> findBooksByAuthor(@RequestParam("name") String name,
//                                        @RequestParam("surname") String surname)
//    {
//        return bookRepository.findBookByAuthors_Name_AndAuthors_Surname(name, surname);
//    }
//
//    @ApiOperation(value	= "Find book by genre", response = Book.class, responseContainer = "List")
//    @GetMapping("/findByGenre/")
//    public List<Book> findBooksByGenre(@RequestParam("genre") String genre)
//    {
//        return bookRepository.findBookByGenres_Genre(genre);
//    }

    @ApiOperation(value	= "Add new book", response = Book.class)
    @PostMapping("/add/")
    public Book addBook(@RequestBody Book book)
    {
        return bookRepository.save(book);
    }

    @ApiOperation(value	= "Update book", response = Book.class)
    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable("id") Long id,
                           @RequestBody Book book)
    {
        book.setId(id);
        return bookRepository.save(book);
    }

    @ApiOperation(value	= "Delete book")
    @GetMapping("/delete/{id}")
    public void deleteBookById(@PathVariable("id") Long id) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid book Id" + id));
        bookRepository.delete(book);
    }

}
