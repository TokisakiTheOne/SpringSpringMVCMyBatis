package com.yyh.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 部門实体类
 * @author YanYuHang
 * @create 2020-04-14-11:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    //部门编号
    private int dept_id;
    //部门名称
    private String dept_name;

    public Dept(String dept_name) {
        this.dept_name = dept_name;
    }

}
