package com.kamilacode.api_com_tdd.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND,
reason = "Book not found in database")
public class BookNotFoundException extends Exception {

    public BookNotFoundException(Long id){
        super("Book with id " +  id + "not found");
    }


}
