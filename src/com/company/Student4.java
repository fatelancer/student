package com.company;

//前三个顺序不能改
//自定义包
import java.lang.*;
import java.io.*;
import java.util.*;

public class Student4{  //主类一定要有主函数
    private String sid;
    private String sname;
    private int sage;//实例变量
    private  Scanner sc = new Scanner(System.in);

    public Student4(){
        try {
            System.out.print("请输入学号1：");
            sid = sc.next();
            System.out.print("请输入姓名：");
            sname = sc.next();
            System.out.print("请输入年龄：");
            sage = sc.nextInt();
        }
        catch (Exception var) {}
    }

    public void judge(){
        if (sage > 60){
            System.out.println("您年纪太大了！");
        }else{
            System.out.println("您年纪适当！");
        }
    }

    public void output(){
        System.out.println("sid = "+sid);
        System.out.println("sname = "+sname);
        System.out.println("sage = "+sage);
    }

    public static void main(String [] args){
        Student4 s1 = new Student4();
        s1.judge();
        s1.output();
        Student4 s2 = new Student4();
        s2.judge();
        s2.output();
    }
}