import java.util.Random;
import java.util.Scanner;

public class test_4_20 {
    public static void main(String[] args) {//猜数字
        Scanner scan = new Scanner(System.in);//生成的数字的范围是0到100
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        while(true) {
            System.out.println("请输入你要猜的数字:");
            int num = scan.nextInt();
            if(num < randNum) {
                System.out.println("猜小了!");
            }else if(num > randNum) {
                System.out.println("猜大了!");
            }else {
                System.out.println("恭喜你,猜对了!");
                break;
            }
        }
    }


    public static void main4(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sum = 0.0;
        int num = 0;
        while(scan.hasNextDouble()) {
            double tmp = scan.nextDouble();
            sum += tmp;
            num++;
        }
        System.out.println("sum=" + sum);
        System.out.println("avg=" + sum / num);
    }


    public static void main3(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的姓名:");
        String name = scan.nextLine();
        System.out.println("请输入你的年龄:");
        int age = scan.nextInt();
        System.out.println("请输入你的性别:");
        String sex = scan.next();
        System.out.println("请输入你的工资:");
        float salary = scan.nextFloat();
        System.out.println("你的信息如下:");
        System.out.println("姓名:" + name);
        System.out.println("年龄:" + age);
        System.out.println("性别:" + sex);
        System.out.println("工资:" + salary);
        scan.close();
    }


    public static void main2(String[] args) {//5的阶乘之和
        int i;
        int j;
        int sum = 0;
        for(i = 1; i <= 5; i++) {
            int ret = 1;
            for(j = 1; j <= i; j++) {
                ret *= j;
            }
            sum += ret;
        }
        System.out.println("sum=" + sum);
    }


    public static void main1(String[] args) {
        int i;
        int sum = 0;
        for(i = 1;i <= 10; i++) {
            System.out.print(i + " ");
        }
        for(i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("sum=" + sum);
    }
}
