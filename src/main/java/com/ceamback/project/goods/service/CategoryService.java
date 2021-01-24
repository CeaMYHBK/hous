package com.ceamback.project.goods.service;

import com.ceamback.framework.web.domain.TreeSelect;
import com.ceamback.project.goods.domain.Category;

import java.util.List;

public interface CategoryService {

    public List<Category> selectCategoryList(Category category);

    public List<Category> buildMenuTree(List<Category> categories);

    public List<TreeSelect> buildMenuTreeSelect(List<Category> categories);
}
