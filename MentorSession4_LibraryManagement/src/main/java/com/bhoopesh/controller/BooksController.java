package com.bhoopesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bhoopesh.entity.Book;
import com.bhoopesh.service.BookService;

//RestController
@Controller
@RequestMapping("/books")
public class BooksController {

	@Autowired
	private BookService bookService;
	
	@GetMapping("/list")
	public String listBooks(Model model) {
		
		//get all books from database
		List<Book> books = bookService.findAll();
		model.addAttribute("books",books);
		return "books/list-books";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model model) {
		
		Book book = new Book();
		model.addAttribute("book", book);
		return "books/book-form";
	}
	
	
	@PostMapping("/showFormForUpdate")
	public String showFromForUpdate(@RequestParam("bookId") int bookId, Model model) {
		
		//get the book from the database
		Book theBook  = bookService.findById(bookId);
		// 1. theBook, ABC, JAVA
		
		// 1. JAVA, JAVA, JAVA
		
		model.addAttribute("book", theBook);
		return "books/book-form";

	}
	
	@PostMapping("/save")
	// 	public String saveBook(@RequetBody("book") Book theBook, Model model) {

	public String saveBook(@ModelAttribute("book") Book theBook) {
		
		//save the book object
		bookService.save(theBook);
		
		// 		
		return "redirect:/books/list";
		
	}
	
	@PostMapping("/delete")
	public String delete(@RequestParam("bookId") int bookId) {
		//delete the book
		bookService.deleteById(bookId);
		return "redirect:/books/list";

	}
	
}
