package com.ceamback.project.goods.mapper;

import com.ceamback.project.goods.domain.Category;

import java.util.List;

public interface CategoryMapper {

    public List<Category> selectCategoryList(Category category);

}
