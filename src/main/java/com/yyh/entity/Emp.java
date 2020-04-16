package com.yyh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 员工实体类
 * @author YanYuHang
 * @create 2020-04-16-14:28
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {
    //员工编号
    private int emp_id;
    //员工姓名
    private String emp_name;
    //员工年龄
    private int emp_age;
    //员工部门
    private Dept dept;

}
