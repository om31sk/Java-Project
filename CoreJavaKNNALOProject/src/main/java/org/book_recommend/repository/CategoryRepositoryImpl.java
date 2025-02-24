package org.book_recommend.repository;

import java.util.ArrayList;
import java.util.List;

import org.book_recommend.config1.DBConfig;
import org.book_recommend.model.CategoryModel;

public class CategoryRepositoryImpl extends DBConfig implements CategoryRepository 
{
	List<CategoryModel> list;
	@Override
	public boolean isAddNewCategory(CategoryModel model) 
	{
		// TODO Auto-generated method stub
		try {
		   stmt=conn.prepareStatement("insert into category values('0',?)");
		   stmt.setString(1,model.getName());
		   int value=stmt.executeUpdate();
		   return value>0?true:false;
		}
		catch(Exception ex)
		{
		  System.out.println("Error is"+ex);
		  return false;
		}
	}

	@Override
	public List<CategoryModel> getAllCategories()
	{
		// TODO Auto-generated method stub
		try 
		{
			list=new ArrayList<CategoryModel>();
			stmt=conn.prepareStatement("select *from category");
			rs=stmt.executeQuery();
			while(rs.next())
			{
				CategoryModel model=new CategoryModel(rs.getInt(1),rs.getString(2));
				list.add(model);
			}
			return list.size()>0?list:null;
		}
		catch(Exception ex)
		{
			System.out.println("Error is"+ex);
			return null;	
		}
		
		
	}

}
