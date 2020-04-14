package com.yyh.handler;

import com.yyh.entity.Dept;
import com.yyh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 控制器类
 * @author YanYuHang
 * @create 2020-04-14-11:35
 */
@Controller
public class DeptHandler {

    //1.注入业务逻辑实现类
    @Autowired
    private DeptService deptService;

    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        //1.调用查询全部
        List<Dept> depts = deptService.selectAll();
        //2.把数据放入作用域
        model.addAttribute("depts",depts);
        //3.返回到页面
        return "selectAll";
    }

    @RequestMapping("/selectById")
    public String selectById(int dept_id,Model model){
        //1.调用根据id查询
        Dept dept = deptService.selectById(dept_id);
        //2.把数据放入作用域
        model.addAttribute("dept",dept);
        //3.返回到页面
        return "update";
    }

    @RequestMapping("/toInsert")
    public String toInsert(){
        return "insert";
    }

    @RequestMapping("/insert")
    public String insert(Dept dept){
        String insert = deptService.insert(dept);
        System.out.println("insert = " + insert);
        return "redirect:selectAll";
    }
    @RequestMapping("/update")
    public String update(Dept dept){
        String update = deptService.update(dept);
        System.out.println("insert = " + update);
        return "redirect:selectAll";
    }
    @RequestMapping("/delete")
    public String delete(int dept_id){
        String delete = deptService.delete(dept_id);
        System.out.println("insert = " + delete);
        return "redirect:selectAll";
    }



}
