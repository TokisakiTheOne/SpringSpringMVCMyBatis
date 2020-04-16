package com.yyh.service;

import com.yyh.entity.Emp;

import java.util.List;

/**
 * 员工业务逻辑接口
 * @author YanYuHang
 * @create 2020-04-16-14:37
 */
public interface EmpService {
    /**
     * 查询全部员工信息
     * @return
     */
    List<Emp> selectAll();

    /**
     * 根据id查询信息
     * @param emp_id
     * @return
     */
    Emp selectById(int emp_id);

    /*
     * 修改
     */
    String update(Emp emp);

    /*
     * 添加
     */
    String insert(Emp emp);


    /**
     * 删除
     * @param emp_id
     * @return
     */
    String delete(int emp_id);
}
