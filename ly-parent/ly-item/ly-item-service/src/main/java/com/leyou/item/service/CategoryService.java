package com.leyou.item.service;

import com.leyou.item.mapper.CategoryMapper;
import com.leyou.item.pojo.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述:
 *
 * @author liaox
 * @create 2019-06-11 9:46
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryMapper mapper;

    public List<Category> queryCategoryListByParentId(Long pid){
        Category category = new Category();
        category.setParentId(pid);
        return mapper.select(category);
    }
}
