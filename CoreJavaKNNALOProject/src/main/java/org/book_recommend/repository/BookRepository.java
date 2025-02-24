package org.book_recommend.repository;

import java.util.*;

import org.book_recommend.model.BookModel;

public interface BookRepository 
{
	 public boolean isAddNewBook(BookModel model);
	 public List<BookModel> getAllBooks();
	 public BookModel getBookByName(String bookName);
	 public boolean isUpdateBook(BookModel model,String bookNameForSearch);
}
