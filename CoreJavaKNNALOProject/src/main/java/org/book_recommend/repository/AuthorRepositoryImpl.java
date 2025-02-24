package org.book_recommend.repository;

import org.book_recommend.config1.DBConfig;
import org.book_recommend.model.AuthorModel;

public class AuthorRepositoryImpl extends DBConfig implements AuthorRepository
{
	public int getAuthorId(String authorName)
	{
		try 
		{
			stmt=conn.prepareStatement("select aid from author where name=?");
			stmt.setString(1, authorName);
			rs=stmt.executeQuery();
			if(rs.next())
			{
				return rs.getInt(1);
			}
			else
			{
		      return-1;	
			}
		}
		catch(Exception ex)
		{
		  System.out.println("Error is"+ex);
		  return -1;
	    }
	}

	@Override
	public boolean isAddNewAuthor(AuthorModel model) 
	{
		// TODO Auto-generated method stub
		return false;
	}

}
