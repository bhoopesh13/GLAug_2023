package com.bhoopesh.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhoopesh.dao.BookRepository;
import com.bhoopesh.entity.Book;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> findAll() {		
		return bookRepository.findAll();
	}

	@Override
	public void save(Book theBook) {
		bookRepository.save(theBook);
	}

	@Override
	public Book findById(int bookId) {	
		return bookRepository.findById(bookId).get();
	}

	@Override
	public void deleteById(int bookId) {
		bookRepository.deleteById(bookId);
	}

}
