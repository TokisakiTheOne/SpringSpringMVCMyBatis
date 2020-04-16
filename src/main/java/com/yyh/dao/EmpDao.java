package com.yyh.dao;

import com.yyh.entity.Emp;

import java.util.List;

/**
 * 员工功能接口
 * @author YanYuHang
 * @create 2020-04-16-14:32
 */
public interface EmpDao {


    /**
     * 查询全部员工信息
     * @return
     */
    List<Emp> selectAll();

    /**
     * 根据id查询员工信息
     * @param emp_id
     * @return
     */
    Emp selectById(int emp_id);



    /*
    * 修改
     */
    int update(Emp emp);


    /*
     * 添加
     */
    int insert(Emp emp);


    /**
     * 删除
     * @param emp_id
     * @return
     */
    int delete(int emp_id);
}



