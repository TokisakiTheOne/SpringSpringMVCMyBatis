import com.yyh.entity.Dept;
import com.yyh.entity.Emp;
import com.yyh.service.EmpService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Spring单元测试
 * @author YanYuHang
 * @create 2020-04-16-14:41
 *
 * @RunWith  测试环境在Spring中运行
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-*.xml"})
public class Test {
    @Autowired
    private EmpService empService;
    /**
     * 测试查询全部员工方法
     */
    @org.junit.Test
    public void testEmpSelectAll(){
        List<Emp> emps = empService.selectAll();
        for (Emp emp : emps) {
            System.out.println("emp = " + emp);
        }
    }
    /**
     * 测试查询
     */
    @org.junit.Test
    public void testEmpSelectById(){
       Emp emp = empService.selectById(1);
       System.out.println("emp = " + emp);
    }

    /**
     * 测试修改
     */
    @org.junit.Test
    public void testEmpUpdate(){
        Emp emp = new Emp(1,"测试",25,new Dept(3,""));
        System.out.println(empService.update(emp));
    }





}
