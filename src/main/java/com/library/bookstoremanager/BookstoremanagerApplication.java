package com.library.bookstoremanager;

import entity.Author;
import entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookstoremanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoremanagerApplication.class, args);
	}
		Author autor = new Author(1L,"Benjamin Grahan", 100);
		Book livro = new Book(1L,"Investidor Inteligênte",200,20,"0-596-52068-9","Benamin", autor);

}
