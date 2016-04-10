package com.company;

//前三个顺序不能改
//自定义包
import java.lang.*;
import java.io.*;
import javax.swing.*;

public class Student5{  //主类一定要有主函数
    private String sid;
    private String sname;
    private int sage;//实例变量


    public Student5(){
        sid=JOptionPane.showInputDialog(null,
                                        "请输入学号",
                                        "输入学号",
                                        JOptionPane.QUESTION_MESSAGE);
        sname=JOptionPane.showInputDialog(null,
                "请输入姓名",
                "输入姓名",
                JOptionPane.QUESTION_MESSAGE);
        sage=Integer.parseInt(JOptionPane.showInputDialog(null,
                "请输入年龄",
                "输入年龄",
                JOptionPane.QUESTION_MESSAGE));
    }

    public String judge(){
        if (sage > 60){
            return "您年纪太大了！";
        }else{
            return "您年纪适当！";
        }
    }

    public void output(){
        JOptionPane.showMessageDialog(null,
                judge()+"\n"+"sid = "+sid+"\nsname = "+sname+"\nsage = "+sage,
                "输出学生基本信息",
                JOptionPane.INFORMATION_MESSAGE
                );
    }

    public static void main(String [] args){
       try {
           Student5 s1 = new Student5();
           s1.judge();
           s1.output();
           Student5 s2 = new Student5();
           s2.judge();
           s2.output();
       }
        catch (Exception var){}
    }
}