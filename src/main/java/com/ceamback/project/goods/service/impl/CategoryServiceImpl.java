package com.ceamback.project.goods.service.impl;

import com.ceamback.framework.web.domain.TreeSelect;
import com.ceamback.project.goods.domain.Category;
import com.ceamback.project.goods.mapper.CategoryMapper;
import com.ceamback.project.goods.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> selectCategoryList(Category category) {
        return categoryMapper.selectCategoryList(category);
    }

    /**
     * 构建前端所需要树结构
     *
     * @param menus 菜单列表
     * @return 树结构列表
     */
    @Override
    public List<Category> buildMenuTree(List<Category> categories)
    {
        List<Category> returnList = new ArrayList<Category>();
        for (Iterator<Category> iterator = categories.iterator(); iterator.hasNext();)
        {
            Category t = (Category) iterator.next();
            // 根据传入的某个父节点ID,遍历该父节点的所有子节点
            if (t.getParentId() == 0)
            {
                recursionFn(categories, t);
                returnList.add(t);
            }
        }
        if (returnList.isEmpty())
        {
            returnList = categories;
        }
        return returnList;
    }

    @Override
    public List<TreeSelect> buildMenuTreeSelect(List<Category> categories)
    {
        List<Category> menuTrees = buildMenuTree(categories);
        return menuTrees.stream().map(TreeSelect::new).collect(Collectors.toList());
    }

    public List<Category> getChildPerms(List<Category> list, int parentId)
    {
        List<Category> returnList = new ArrayList<Category>();
        for (Iterator<Category> iterator = list.iterator(); iterator.hasNext();)
        {
            Category t = (Category) iterator.next();
            // 一、根据传入的某个父节点ID,遍历该父节点的所有子节点
            if (t.getParentId() == parentId)
            {
                recursionFn(list, t);
                returnList.add(t);
            }
        }
        return returnList;
    }

    private void recursionFn(List<Category> list, Category t)
    {
        // 得到子节点列表
        List<Category> childList = getChildList(list, t);
        t.setChildren(childList);
        for (Category tChild : childList)
        {
            if (hasChild(list, tChild))
            {
                // 判断是否有子节点
                Iterator<Category> it = childList.iterator();
                while (it.hasNext())
                {
                    Category n = (Category) it.next();
                    recursionFn(list, n);
                }
            }
        }
    }

    private List<Category> getChildList(List<Category> list, Category t)
    {
        List<Category> tlist = new ArrayList<Category>();
        Iterator<Category> it = list.iterator();
        while (it.hasNext())
        {
            Category n = (Category) it.next();
            if (n.getParentId().longValue() == t.getCategoryId().longValue())
            {
                tlist.add(n);
            }
        }
        return tlist;
    }

    /**
     * 判断是否有子节点
     */
    private boolean hasChild(List<Category> list, Category t)
    {
        return getChildList(list, t).size() > 0 ? true : false;
    }
}
