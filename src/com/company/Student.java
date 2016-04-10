package com.company;

//前三个顺序不能改
//自定义包
import java.lang.*;
import java.io.*;

public class Student{  //主类一定要有主函数
    private String sid;
    private String sname;
    private int sage;//实例变量
    private InputStreamReader isr = new InputStreamReader(System.in);
    private  BufferedReader br = new BufferedReader(isr);

    public Student(){
        try {
            System.out.print("请输入学号：");
            sid = br.readLine();
            System.out.print("请输入姓名：");//
            sname = br.readLine();
            System.out.print("请输入年龄：");
            sage = Integer.parseInt(br.readLine());//
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
        Student s1 = new Student();
        s1.judge();
        s1.output();
        Student s2 = new Student();
        s2.judge();
        s2.output();
    }
}