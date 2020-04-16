package com.yyh.handler;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yyh.entity.Dept;
import com.yyh.entity.Emp;
import com.yyh.service.DeptService;
import com.yyh.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 员工控制器
 * @author YanYuHang
 * @create 2020-04-16-14:52
 */
@Controller
@RequestMapping("/emp")
public class EmpHandler {

    //注入员工业务逻辑接口
    @Autowired
    private EmpService empService;
    //注入部门表的接口
    @Autowired
    private DeptService deptService;

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        //调用查询全部方法
        List<Emp> emps = empService.selectAll();
        //放入作用域
        model.addAttribute("emps",emps);
        return "emp/selectAll";
    }



    @RequestMapping("/selectById")
    public String selectById(int emp_id, Model model){
        //根据id查询员工详细数据
       Emp emp= empService.selectById(emp_id);
       //查询所有部门数据
        List<Dept> depts = deptService.selectAll();
        //分别放入作用域
        model.addAttribute("emp",emp);
        model.addAttribute("depts",depts);
       return "emp/update";
    }

    /**
     * 修改
     * @param emp
     * @return
     */
    @RequestMapping("/update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/selectAll";
    }
    /**
     * 添加
     * @param emp
     * @return
     */
    @RequestMapping("/insert")
    public String insert(Emp emp){
        empService.insert(emp);
        return "redirect:/emp/selectAll";
    }
    /**
     * 删除
     * @param emp_id
     * @return
     */
    @RequestMapping("/delete")
    public String delete(int emp_id){
        empService.delete(emp_id);
        return "redirect:/emp/selectAll";
    }

    /**
     * 跳转到添加页面
     */
    @RequestMapping("/toInsert")
    public String toInsert(Model model){
        //查询所有部门数据
        List<Dept> depts = deptService.selectAll();
        //分别放入作用域
        model.addAttribute("depts",depts);
        return "emp/insert";
    }



}
