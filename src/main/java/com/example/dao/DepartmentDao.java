package com.example.dao;
import com.example.domain.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
//部门dao
@Mapper //mybatis的mapper类
@Repository
public interface DepartmentDao {

    //获取所有部门信息
    public Collection<Department> getDepartments();
    //通过id得到部门
    public Department getDepartmentById(Integer id);
}
