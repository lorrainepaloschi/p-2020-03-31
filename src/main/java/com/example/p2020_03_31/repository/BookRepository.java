package com.example.p2020_03_31.repository;

import java.util.ArrayList;

import com.example.p2020_03_31.model.Book;

import org.springframework.stereotype.Repository;

/**
 * BookRepository
 */
@Repository
public class BookRepository {

    public ArrayList <Book> al = ArrayList<Book>();

    public BookRepository(){
       
    }

    public ArrayList setBook (Book book){
        al.add(book);
    }
    
    public ArrayList<Book> getBook(){
        return  al;
    }
}