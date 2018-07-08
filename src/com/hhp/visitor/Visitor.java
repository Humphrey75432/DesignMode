package com.hhp.visitor;

/**
 * Created by Hu on 2017/10/29.
 */
public class Visitor implements IVisitor {

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
    }

    public String getBaseInfo(Employee employee) {
        String info = "姓名："+employee.getName()+"\t";
        info = info + "性别："+(employee.getSex() == Employee.FEMALE ? "女" : "男")+"\t";
        info = info + "薪水："+employee.getSalary()+"\t";
        return info;
    }

    private String getManagerInfo(Manager manager) {
        String baseInfo = this.getBaseInfo(manager);
        String otherInfo = "业绩："+manager.getPerformance() + "\t";
        return baseInfo + otherInfo;
    }

    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String baseInfo = this.getBaseInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return baseInfo + otherInfo;
    }
}
