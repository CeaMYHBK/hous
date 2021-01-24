package com.ceamback.project.goods.controller;

import com.ceamback.framework.web.controller.BaseController;
import com.ceamback.framework.web.domain.AjaxResult;
import com.ceamback.framework.web.page.TableDataInfo;
import com.ceamback.project.goods.domain.Category;
import com.ceamback.project.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/goods/category")
public class CategoryController extends BaseController {

    @Autowired
    private CategoryService categoryService;

   // @GetMapping("/list")
    //public TableDataInfo list(Category category){
      //  startPage();
       // List<Category> list=categoryService.selectCategoryList(category);
       // return getDataTable(list);
    //}
    /**
     * 获取菜单列表
     */
    @GetMapping("/list")
    public AjaxResult list(Category category)
    {
        List<Category> categories = categoryService.selectCategoryList(category);
        return AjaxResult.success(categoryService.buildMenuTree(categories));
    }

}
