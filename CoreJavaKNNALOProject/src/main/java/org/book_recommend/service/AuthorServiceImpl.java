package org.book_recommend.service;

import org.book_recommend.model.AuthorModel;
import org.book_recommend.repository.AuthorRepository;
import org.book_recommend.repository.AuthorRepositoryImpl;

public class AuthorServiceImpl implements AuthorService 
{
	AuthorRepository authRepo=new AuthorRepositoryImpl();
	@Override
	public boolean isAddNewAuthor(AuthorModel model) 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getAuthorId(String authorName) {
		// TODO Auto-generated method stub
		return authRepo.getAuthorId(authorName);
	}

}
