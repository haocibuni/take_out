package com.baidu.take_out.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.baidu.take_out.entity.Category;
import com.baidu.take_out.mapper.CategoryMapper;
import com.baidu.take_out.service.CategoryService;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService{



}
