package com.physical.controller;


import com.physical.mapper.CategoryMapper;
import com.physical.pojo.Category;
import com.physical.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author astupidcoder
 * @since 2023-02-22
 */

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService iCategoryService;
    @GetMapping("/getcategory")
    @ResponseBody
    public List<Category> getcategory(){
        return iCategoryService.list();
    }

    /**
     * 根据id删除
     * @param id
     * @return sum
     */
    @RequestMapping("deleteById")
    @ResponseBody
    public boolean deleteById(long id){
      if( iCategoryService.removeById(id))
      {
          return true;
      }
      else {
          return false;
      }
    }

    @RequestMapping("update")
    @ResponseBody
    public void update(Category category) {
        iCategoryService.updateById(category);
    }

}

