package task1;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class eef {

    public static void main(String args[]) {
//        MainTest.main("");
//        GenericTest.main();
//         1.输入异常：输入不符合要求  InputMissMatchException
//		{
//			int a = 0;
//			Scanner in = new Scanner(System.in);
//			try {
//				a = in.nextInt();
//			} catch(InputMismatchException e) {
//				System.out.println("请输入整数！");
//			} catch(Exception e) {
//				System.out.print(e.getMessage());
//			} finally{
//				in.close();
//				System.out.print("程序结束");
//			}
//			System.out.println(a);
//		}
//        // 2.不合法获取异常: 当前位置不可访问一些方法、属性、变量  IllegalAccessException
		{
			try {
				Class mankind = Class.forName("task1.Student");
				try {
					Object ob = mankind.newInstance();
				} catch (InstantiationException e) {
					throw new RuntimeException(e);
				} catch (IllegalAccessException e) {
					System.out.println("抛出IllegalAccessException");
				}
			} catch (ClassNotFoundException e) {
				System.out.println("ClassNotFoundException");
			}
		}
        // 3.类型转换异常：不是其子类，强行转换到其类型 ClassCastException
//        {
//            try{
//                Teacher teacher = new Teacher();
//                Person person = (Person) teacher;
//                Student student = (Student) person;
//            }catch (ClassCastException e) {
//                System.out.println("强转类型异常");
//            }
//        }

        // 4.数据库异常：提供关于数据库访问错误和其他错误信息的异常
//        {
//            try {
//                Connection con = DriverManager.getConnection("1111");
//            } catch (SQLException e) {
//                System.out.println("连接失败" + e.getMessage());
//            }
//        }

        // 5.I/O异常  IOException
//        {
//            FileWriter fw = null;
//            try{
//                fw = new FileWriter("W:\\1.txt");
//                fw.write("1234567");
//            }catch (IOException e) {
//                System.out.println("IO异常："+e.getMessage());
//            } finally {
//                if(fw != null){
//                    try {
//                        fw.close();
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }

        // 6.空指针异常 NullPointerException
//		{
//			task1.Person p = null;
//			try {
//				System.out.println(p.name);
//			}
//			catch(NullPointerException e) {
//				System.out.println("没有指定的p");
//			}
//		}
//         7.类未找到异常 ClassNotFoundException
//		{
//            try {
//                Class f = Class.forName("abcd");
//            } catch (ClassNotFoundException e) {
//                System.out.println("没有找到类" + "abcd");
//            }
//        }
        // 8.不合法参数 IllegalArgumentException
//		{
//            try{
//                task1.Student s = new task1.Student(null);
//            }catch (IllegalArgumentException e) {
//                System.out.println("参数不合法");
//            }
//		}

    }
}
