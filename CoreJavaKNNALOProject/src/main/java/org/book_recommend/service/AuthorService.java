package org.book_recommend.service;

import org.book_recommend.model.AuthorModel;

public interface AuthorService 
{
  public boolean isAddNewAuthor(AuthorModel model);
  public int getAuthorId(String authorName);
}
