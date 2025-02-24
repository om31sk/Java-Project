package org.book_recommend.service;

import org.book_recommend.model.PublicationModel;
import org.book_recommend.repository.PubRepository;
import org.book_recommend.repository.PubRepositoryImpl;

public class PubServiceImpl implements PubService
{
	PubRepository pubRepo=new PubRepositoryImpl();
	@Override
	public boolean isAddNewPublication(PublicationModel model) 
	{
		// TODO Auto-generated method stub
		return pubRepo.isAddNewPublication(model);
	}

}
