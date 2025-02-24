package org.book_recommend.service;

import java.util.List;

import org.book_recommend.model.CategoryModel;
import org.book_recommend.repository.CategoryRepository;
import org.book_recommend.repository.CategoryRepositoryImpl;

public class CategoryServiceImpl  implements CategoryService
{
	CategoryRepository catRepo=new CategoryRepositoryImpl();

	@Override
	public boolean isAddNewCategory(CategoryModel model)
	{
		// TODO Auto-generated method stub
		return catRepo.isAddNewCategory(model);
	}

	@Override
	public List<CategoryModel> getAllCategories() {
		// TODO Auto-generated method stub
		return null;
	}

}
