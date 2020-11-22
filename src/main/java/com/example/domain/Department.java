package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//部门表
@Data               //提供类的get、set、equals、hashCode、canEqual、toString方法
@AllArgsConstructor //提供类的全参构造
@NoArgsConstructor  //提供类的无参构造
public class Department {
    private Integer id;
    private String departmentName;
}
