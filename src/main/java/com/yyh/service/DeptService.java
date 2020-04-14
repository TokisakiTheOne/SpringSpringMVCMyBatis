package com.yyh.service;

import com.yyh.entity.Dept;

import java.util.List;

/**
 * 业务逻辑接口
 * @author YanYuHang
 * @create 2020-04-14-11:30
 */
public interface DeptService {
    /**
     * 查询全部部门信息
     * @return
     */
    List<Dept> selectAll();

    /**
     * 根据id查询部门对象
     * @param dept_id
     * @return
     */
    Dept selectById(int dept_id);

    /**
     * 添加
     * @param dept
     * @return
     */
    String insert(Dept dept);

    /**
     * 修改
     * @param dept
     * @return
     */
    String update(Dept dept);


    /**
     * 删除
     * @param dept_id
     * @return
     */
    String delete(int dept_id);



}
