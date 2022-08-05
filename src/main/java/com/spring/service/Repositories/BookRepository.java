package com.spring.service.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.service.Models.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
