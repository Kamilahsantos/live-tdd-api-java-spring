package com.kamilacode.api_com_tdd.repository;


import com.kamilacode.api_com_tdd.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository <Book,Long>{

    List<Book>findByNameStartingWith(String name);



}
