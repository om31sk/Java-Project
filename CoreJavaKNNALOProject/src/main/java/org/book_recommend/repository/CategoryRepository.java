package org.book_recommend.repository;

import java.util.List;

import org.book_recommend.model.CategoryModel;

public interface CategoryRepository 
{
  public boolean isAddNewCategory(CategoryModel model);
  public List<CategoryModel> getAllCategories();
}
