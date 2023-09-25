package com.baidu.take_out.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baidu.take_out.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrdersMapper extends BaseMapper<Orders> {
}
