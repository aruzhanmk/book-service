//package kz.iitu.end.service;
//
//import kz.iitu.end.entity.Book;
//import kz.iitu.end.repository.BookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//@Component
//public class BookService {
//
//    //AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//
//    Scanner scanner = new Scanner(System.in);
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    List<Book> books = new ArrayList<>();
//
//    public void addNewBook()
//    {
//        String title;
//        int publicationYear;
//        /*List<Genre> genres = new ArrayList<>();
//        List<Author> authors = new ArrayList<>();*/
//
//        System.out.println("Enter book title");
//        title = scanner.nextLine();
//
//        Book book = new Book(title);
//        bookRepository.save(book);
//
//        System.out.println("Book " + book.toString() + "\nsuccessfully added");
//    }
//
//    public void listBooks()
//    {
//        books.clear();
//        for (Book book: bookRepository.findAll())
//        {
//            books.add(book);
//            System.out.println(book.toString());
//        }
//    }
//
//    public List<Book> getBooks()
//    {
//        books.clear();
//        for (Book book: bookRepository.findAll())
//        {
//            books.add(book);
//        }
//        return books;
//    }
//
//    public Book findBookByTitle()
//    {
//        String title;
//        System.out.println("Enter book title");
//        title = scanner.nextLine();
//        Book book = bookRepository.findBookByTitleContaining(title);
//        System.out.println(book.toString());
//        return book;
//    }
//
////    public void findBookByAuthorSurname()
////    {
////        String authorName, authorSurname;
////        System.out.println("Enter author name");
////        authorName = scanner.nextLine();
////        System.out.println("Enter author surname");
////        authorSurname = scanner.nextLine();
////        books.clear();
////        books = bookRepository.findBookByAuthors_Name_AndAuthors_Surname(authorName, authorSurname);
////        for (int i = 0; i < books.size(); i++)
////        {
////            System.out.println(books.get(i).toString());
////        }
////    }
////
////    public void findBookByGenre()
////    {
////        String genre;
////        System.out.println("Enter book genre");
////        genre = scanner.next();
////        books.clear();
////        books = bookRepository.findBookByGenres_Genre(genre);
////        for (int i = 0; i < books.size(); i++)
////        {
////            System.out.println(books.get(i).toString());
////        }
////    }
//    }
