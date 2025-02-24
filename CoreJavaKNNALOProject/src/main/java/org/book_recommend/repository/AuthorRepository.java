package org.book_recommend.repository;

import org.book_recommend.model.AuthorModel;

public interface AuthorRepository
{
	 public boolean isAddNewAuthor(AuthorModel model);
	 public int getAuthorId(String authorName);
}
