package task1;

public class eef {

    public static void main(String args[]) {
//        MainTest.main("");
//        GenericTest.main();
//         1.输入异常：输入不符合要求
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
//        // 2.不合法获取异常: 当前位置不可访问一些方法、属性、变量
//		{
//			task1.Person p = new task1.Person();
//			p.name = "qx";
//			p.setHigh(180);
//			p.setWeigh(100);
//			try {
//				System.out.println("身高：" + p.getHigh());
//			}
//			catch(IllegalAccessException e) {
//				System.out.println("无权限访问");
//			}
//		}
        // 3.类型转换异常：不是其子类，强行转换到其类型
//        {
//            task1.Person p = new task1.Student();
//            p.name = "qx";
//            task1.Student s = null;
//            try {
//                s = (task1.Student) p;
//                System.out.println("班级名：" + s.classname);
//            }
//            catch(ClassCastException e) {
//                System.out.println("强制转换异常！");
//            }
//            finally {
//                System.out.println("学生名："+s.name);
//            }
//        }

        // 4.数据访问异常
//        {
//            try{
//                Object obj = new Integer(1);
//            }catch (ClassCastException e) {
//                System.out.println(e.getMessage());
//            }
//
//        }

        // 5.I/O异常
//        {
//            FileWriter fw = null;
//            try{
//                fw = new FileWriter("W:\\1.txt");
//                fw.write("1234567");
//            }catch (IOException e) {
//                System.out.println("路径不存在");
//            }
//            finally {
//                if(fw != null){
//                    try {
//                        fw.close();
//                    } catch (IOException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//        }

        // 6.空指针异常
//		{
//			task1.Person p = null;
//			try {
//				System.out.println(p.name);
//			}
//			catch(NullPointerException e) {
//				System.out.println("没有指定的p");
//			}
//		}
//         7.类未找到异常
//		{
//			Connecter c = new Connecter();
//		}
        // 8.不合法参数
//		{
//			task1.Person p = null;
//            try{
//                task1.Student s = new task1.Student(p);
//            }catch (IllegalArgumentException e) {
//                System.out.println("参数不合法");
//            }
//
//		}
// 9.算术异常
//        {
//            int a = 1, b = 0;
//            try{
//                System.out.println(a/b);
//            }catch (ArithmeticException e) {
//                System.out.println(e.fillInStackTrace());
//            }
//        }
//    10. 数组越界异常
//        {
//            int[] arr = new int[10];
//            try{
//                System.out.println(arr[10]);
//            }catch (ArrayIndexOutOfBoundsException e){
//                System.out.println(e.getMessage());
//            }
//        }

    }
}
