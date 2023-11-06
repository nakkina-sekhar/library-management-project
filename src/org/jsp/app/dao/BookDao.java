package org.jsp.app.dao;

import java.sql.SQLException;
import java.util.ArrayList;

import org.jsp.app.dto.BookDto;

public interface BookDao 
{
	void addBook(BookDto dto) throws Exception;
	ArrayList<BookDto> searchBookTitle(String title) throws Exception;
	ArrayList<BookDto> searchBookAuthor(String authorName) throws Exception;
	void updateBookPrice(int id, double price) throws Exception;
	boolean removeBook(int id) throws Exception;
	ArrayList<Integer> getIds() throws Exception;
	ArrayList<BookDto> getAllBooks() throws Exception;
	ArrayList<BookDto> sortBooks(int ch) throws Exception;
}
