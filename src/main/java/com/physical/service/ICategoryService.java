package com.physical.service;

import com.physical.pojo.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.transaction.Transactional;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author astupidcoder
 * @since 2023-02-22
 */
@Transactional
public interface ICategoryService extends IService<Category> {

}
