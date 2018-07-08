package com.hhp.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hu on 2017/10/29.
 */
public class Client {

    public static void main(String[] args) {
        for (Employee emp : mockEmployee()) {
            emp.accept(new Visitor());
        }
    }

    public static List<Employee> mockEmployee() {
        List<Employee> empList = new ArrayList<>();

        CommonEmployee zhangSan = new CommonEmployee();
        zhangSan.setJob("编写Java程序员，绝对的蓝领、苦工加搬运工");
        zhangSan.setName("张三");
        zhangSan.setSalary(18000);
        zhangSan.setSex(Employee.MALE);
        empList.add(zhangSan);

        CommonEmployee liSi = new CommonEmployee();
        liSi.setJob("页面美工，审美素质太不流行了");
        liSi.setName("李四");
        liSi.setSalary(12000);
        liSi.setSex(Employee.FEMALE);
        empList.add(liSi);

        Manager wangWu = new Manager();
        wangWu.setPerformance("基本是负值，但是我会拍马屁啊");
        wangWu.setName("王五");
        wangWu.setSalary(187500);
        empList.add(wangWu);

        return empList;
    }
}
