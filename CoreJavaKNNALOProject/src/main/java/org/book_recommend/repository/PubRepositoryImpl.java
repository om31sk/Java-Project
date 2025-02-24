package org.book_recommend.repository;

import org.book_recommend.config1.DBConfig;
import org.book_recommend.model.PublicationModel;

public class PubRepositoryImpl extends DBConfig implements PubRepository 
{
	@Override
	public boolean isAddNewPublication(PublicationModel model) {
		// TODO Auto-generated method stub
		try 
		{
			stmt=conn.prepareStatement("insert into publication values('0',?)");
			stmt.setString(1,model.getName());
			int value=stmt.executeUpdate();
			return value>0?true:false;
		}
		catch(Exception ex)
		{ 
			System.out.println("Error is "+ex);
		   return false;
		}
	}

}
