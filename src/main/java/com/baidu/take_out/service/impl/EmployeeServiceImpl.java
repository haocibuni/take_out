package com.baidu.take_out.service.impl;

import com.baidu.take_out.entity.Employee;
import com.baidu.take_out.mapper.EmployeeMapper;
import com.baidu.take_out.service.EmployeeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
