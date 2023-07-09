package com.baidu.take_out.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baidu.take_out.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long ids);
}
