package com.example.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

//员工表
@Data               //提供类的get、set、equals、hashCode、canEqual、toString方法
@AllArgsConstructor //提供类的全参构造
@NoArgsConstructor  //提供类的无参构造
public class Employee extends Department{
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;
    private Integer d_id;
}
