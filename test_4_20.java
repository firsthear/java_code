import java.util.Random;
import java.util.Scanner;

public class test_4_20 {
    public static void main(String[] args) {//������
        Scanner scan = new Scanner(System.in);//���ɵ����ֵķ�Χ��0��100
        Random rand = new Random();
        int randNum = rand.nextInt(100);
        while(true) {
            System.out.println("��������Ҫ�µ�����:");
            int num = scan.nextInt();
            if(num < randNum) {
                System.out.println("��С��!");
            }else if(num > randNum) {
                System.out.println("�´���!");
            }else {
                System.out.println("��ϲ��,�¶���!");
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
        System.out.println("�������������:");
        String name = scan.nextLine();
        System.out.println("�������������:");
        int age = scan.nextInt();
        System.out.println("����������Ա�:");
        String sex = scan.next();
        System.out.println("��������Ĺ���:");
        float salary = scan.nextFloat();
        System.out.println("�����Ϣ����:");
        System.out.println("����:" + name);
        System.out.println("����:" + age);
        System.out.println("�Ա�:" + sex);
        System.out.println("����:" + salary);
        scan.close();
    }


    public static void main2(String[] args) {//5�Ľ׳�֮��
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
