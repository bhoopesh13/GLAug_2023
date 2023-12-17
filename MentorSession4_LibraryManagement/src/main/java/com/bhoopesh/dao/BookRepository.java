package com.bhoopesh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bhoopesh.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
