package com.yyh.service;

import com.yyh.dao.DeptDao;
import com.yyh.entity.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 业务逻辑接口实现类
 * @author YanYuHang
 * @create 2020-04-14-11:31
 *
 *
 *
 * @Service           把当前的类放入IOC容器
 * @Controller
 * @Repository
 * @Component
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> selectAll() {
        return deptDao.selectAll();
    }

    @Override
    public Dept selectById(int dept_id) {
        return deptDao.selectById(dept_id);
    }

    @Override
    public String insert(Dept dept) {
        return deptDao.insert(dept)>0?"添加成功":"添加失败";
    }

    @Override
    public String update(Dept dept) {
        return deptDao.update(dept)>0?"修改成功":"修改失败";
    }

    @Override
    public String delete(int dept_id) {
        return deptDao.delete(dept_id)>0?"删除成功":"删除失败";

    }
}
