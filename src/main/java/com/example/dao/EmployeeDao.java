package com.example.dao;
import com.example.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

//员工dao(模拟数据库数据)
@Mapper //mybatis的mapper类
@Repository
public interface EmployeeDao {

    //查询员工信息
    public Collection<Employee> getAll();
    //通过id查询员工
    public Employee getEmployeeById(Integer id);
    //增加员工
    public void save(Employee employee);
    //修改员工
    public void update(Employee employee);
    //删除员工
    public void delete(Integer id);

}
