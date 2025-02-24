package org.book_recommend.service;

import java.util.List;

import org.book_recommend.model.BookModel;
import org.book_recommend.repository.BookRepository;
import org.book_recommend.repository.BookRepositoryImpl;

public class BookServiceImpl implements BookService
{
   private BookRepository bookRepo=new BookRepositoryImpl();
	public boolean isAddNewBook(BookModel model)
	{
		// TODO Auto-generated method stub
		return bookRepo.isAddNewBook(model);
	}
	public List<BookModel> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepo.getAllBooks();
	}
	@Override
	public BookModel getBookByName(String bookName) 
	{
		// TODO Auto-generated method stub
		return bookRepo.getBookByName(bookName);
	}
	@Override
	public boolean isUpdateBook(BookModel model,String bookNameForSearch) 
	{
		// TODO Auto-generated method stub
		return bookRepo.isUpdateBook(model,bookNameForSearch);
	}

}
