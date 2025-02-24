package org.book_recommend.repository;

import org.book_recommend.model.PublicationModel;

public interface PubRepository 
{
	public boolean isAddNewPublication(PublicationModel model);
}
