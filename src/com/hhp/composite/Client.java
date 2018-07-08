package com.hhp.composite;

import java.util.ArrayList;

/**
 * Created by Hu on 2017/10/28.
 */
public class Client {

    public static void main(String[] args) {
        Branch ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }

    public static Branch compositeCorpTree() {
        Branch root = new Branch("王大麻子", "总经理", 1000000);
        Branch developDep = new Branch("刘大瘸子", "研发部经理", 10000);
        Branch saleDep = new Branch("马二拐子", "销售部经理", 20000);
        Branch financeDep = new Branch("赵三驼子", "财务部经理", 30000);

        Branch firstDevGroup = new Branch("杨三", "开发组一组长", 5000);
        Branch secondGroup = new Branch("吴大棒槌", "开发二组长", 5000);

        ILeaf a = new Leaf("a", "第一组开发人员", 2000);
        ILeaf b = new Leaf("b", "第一组开发人员", 2000);
        ILeaf c = new Leaf("c", "第一组开发人员", 2000);
        ILeaf d = new Leaf("d", "第二组开发人员", 2000);
        ILeaf e = new Leaf("e", "第二组开发人员", 2000);
        ILeaf f = new Leaf("f", "第二组开发人员", 2000);
        ILeaf g = new Leaf("g", "开发人员", 2000);
        ILeaf h = new Leaf("h", "销售部人员", 2000);
        ILeaf i = new Leaf("i", "销售部人员", 2000);
        ILeaf j = new Leaf("j", "财务部人员", 2000);
        ILeaf k = new Leaf("k", "CEO秘书", 2000);
        ILeaf zhengLaoLiu = new Leaf("郑老六", "研发部经理", 20000);

        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(saleDep);
        root.addSubordinate(financeDep);

        developDep.addSubordinate(zhengLaoLiu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondGroup);

        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);

        secondGroup.addSubordinate(d);
        secondGroup.addSubordinate(e);
        secondGroup.addSubordinate(f);
        secondGroup.addSubordinate(g);

        saleDep.addSubordinate(h);
        saleDep.addSubordinate(i);

        financeDep.addSubordinate(j);

        return root;
    }

    public static String getTreeInfo(Branch root) {
        ArrayList<ICorp> subordinateList = root.getSubordinateInfo();
        String info = "";
        for (ICorp s : subordinateList) {
            if (s instanceof Leaf) {
                info = info + s.getInfo() + "\n";
            } else {
                info = info + s.getInfo() + "\n" + getTreeInfo((Branch) s);
            }
        }
        return info;
    }

}
