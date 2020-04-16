package com.yyh.service;

import com.yyh.dao.EmpDao;
import com.yyh.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 员工业务逻辑接口实现类
 * @author YanYuHang
 * @create 2020-04-16-14:38
 */
@Service
public class EmpServiceImpl implements EmpService {

    //注入Dao接口
    @Autowired
    private EmpDao empDao;
    @Override
    public List<Emp> selectAll() {
        return empDao.selectAll();
    }

    @Override
    public Emp selectById(int emp_id) {
        return empDao.selectById(emp_id);
    }

    @Override
    public String update(Emp emp) {
        return empDao.update(emp)>0?"修改成功":"修改失败";
    }

    @Override
    public String insert(Emp emp) {
        return empDao.insert(emp)>0?"添加成功":"添加失败";
    }

    @Override
    public String delete(int emp_id) {
        return empDao.delete(emp_id)>0?"删除成功":"删除失败";
    }
}
