import java.util.Scanner;

public class test_4_19 {
    public static void main(String[] args) {//�ҵ�100��200֮���һ��3�ı���
        int num;
        for(num = 100; num <= 200; num++) {
            if(num % 3 == 0) {
                System.out.println(num);
                break;
            }
        }
    }


    public static void main9(String[] args) {//��ˮ�ɻ���
        int a;
        int b;
        int c;
        int i;
        for(i = 100; i <= 999; i++) {
            a = i % 10;
            b = i / 10 % 10;
            c = i / 100;
            int s = a * a * a + b * b * b + c * c * c;
            if(i == s) {
                System.out.println(i);
            }
        }
    }


    public static void main8(String[] args) {//����1��100֮��9���ֵĸ���
        int i;
        int count = 0;
        for(i = 1; i <= 100; i++) {
            if(i % 10 == 9) {
                System.out.print(i + " ");
                count++;
            }
            if(i / 10 == 9) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("count=" + count);
    }


    public static void main7(String[] args) {//����1/1-1/2+1/3......+1/99-1/100��ֵ
        int i;
        double s = 0.0;
        int flag = 1;
        for(i = 1; i <= 100; i++) {
            s += flag * (1.0 / i);
            flag = -flag;
        }
        System.out.println(s);
    }


    public static void main6(String[] args) {//�������������Լ��
        Scanner scan = new Scanner(System.in);
        System.out.print("������������:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a > b) {
            int c = a % b;
            while(c != 0) {
                a = b;
                b = c;
                c = a % b;
            }
            System.out.println("���Լ��Ϊ:" + a);
        }else {
            int d = b % a;
            while(d != 0) {
                b = a;
                a = d;
                d = b % a;
            }
            System.out.println("���Լ��Ϊ:" + a);
        }
    }


    public static void main5(String[] args) {//��ӡ�˷��ھ���
        int i;
        int j;
        for(i = 1; i <= 9; i++) {
            for(j = 1; j <= i; j++) {
                System.out.printf("%2d*%d=%-2d",i,j,i*j);
            }
            System.out.println();
        }
    }


    public static void main4(String[] args) {//��ӡ1000��2000֮�������
        int year;
        int count = 0;
        for(year = 1000; year <=2000; year++) {
            if(((year % 4 == 0) && (year %100 != 0)) || (year % 400 == 0)) {
                System.out.print(year + " ");
                count++;
                if(count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }


    public static void main3(String[] args) {//��ӡ1��100֮�����е�����
        int i;
        int j;
        for(i = 2; i <= 100; i++) {
            boolean flag = true;
            if(i == 2) {
                System.out.print(i + " ");
                continue;
            }
            for(j = 2; j <= i/2; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.print(i + " ");
            }
        }
    }


    public static void main2(String[] args) {//�ж�һ�����Ƿ�λ����
        Scanner scan = new Scanner(System.in);
        System.out.print("������һ������:");
        int num = scan.nextInt();
        int j;
        boolean flag = true;
        if(num == 1) {
            System.out.println(1 + "�Ȳ�������Ҳ��������!");
            flag = false;
        }
        if(num == 2) {
            System.out.println(2 + "������!");
            flag = false;
        }
        for(j = 2;j <= Math.sqrt(num);j++) {
            if(num % j == 0) {
                System.out.println(num + "��������!");
                flag = false;
                break;
            }
        }
        if(flag) {
            System.out.println(num + "������!");
        }
    }

    public static void main1(String[] args) {//��������������ж����ĸ������
        Scanner scan = new Scanner(System.in);
        System.out.print("�������������:");
        int age = scan.nextInt();
        if(age <= 18) {
            System.out.println("����!");
        }else if(age >= 19 && age <=28) {
            System.out.println("����!");
        }else if(age >= 29 && age <= 55) {
            System.out.println("����!");
        }else {
            System.out.println("����!");
        }
    }
}
