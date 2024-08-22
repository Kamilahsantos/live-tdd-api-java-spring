package com.kamilacode.api_com_tdd;

import com.kamilacode.api_com_tdd.domain.Book;
import com.kamilacode.api_com_tdd.domain.Category;
import com.kamilacode.api_com_tdd.domain.Status;

public class BookFactory {

    public static Book createBook (){
        Book book = new Book();
        book.setId(1L);
        book.setName("cracking the code interview");
        book.setStatus(Status.NOT_STARTED);
        book.setCategory(Category.PROGRAMMING);
        return book;
    }
}
