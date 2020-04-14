package com.yyh.dao;

import com.yyh.entity.Dept;

import java.util.List;

/**
 * 部门功能接口
 * @author YanYuHang
 * @create 2020-04-14-11:25
 */
public interface DeptDao {

    /**
     * 查询全部部门信息
     * @return   部门对象的集合
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
    int insert(Dept dept);

    /**
     * 修改
     * @param dept
     * @return
     */
    int update(Dept dept);


    /**
     * 删除
     * @param dept_id
     * @return
     */
    int delete(int dept_id);








}
