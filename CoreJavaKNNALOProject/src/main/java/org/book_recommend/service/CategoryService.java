package org.book_recommend.service;

import java.util.List;

import org.book_recommend.model.CategoryModel;

public interface CategoryService
{
  public boolean isAddNewCategory(CategoryModel model);
  public List<CategoryModel> getAllCategories();

}
