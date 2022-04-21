import java.util.Scanner;

public class test_4_21 {
    //�ݹ�
    public static int fibon2(int n) {//�Ż�:�õ�����쳲�������
        int a = 1;
        int b = 1;
        int c = 0;
        for (int i = 3; i <= n ; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
    public static void main(String[] args) {
        int n = 6;
        int ret = fibon2(n);
        System.out.println("쳲�������Ϊ" + ret);
    }


    public static int fibon1(int n) {//��һ������쳲����������õݹ�����ջ�����
        if(n == 1 || n == 2) {
            return 1;
        }
        return fibon1(n - 1) + fibon1(n - 2);
    }
    public static void main13(String[] args) {
        int n = 5;
        int ret = fibon1(n);
        System.out.println("쳲�������Ϊ" + ret);
    }


    public static int fac2(int n) {//����1729����ӡ1+7+2+9�ĺ�
        if(n < 9) {
            return n;
        }
        return n % 10 + fac2(n / 10);
    }
    public static void main12(String[] args) {
        int n = 1729;
        int ret = fac2(n);
        System.out.println("ret=" + ret);
    }


    public static void print(int n) {//��1234  ��ӡ1 2 3 4
        if(n > 9) {
            print(n / 10);
        }
        System.out.println(n % 10);
    }
    public static void main11(String[] args) {
        int n = 1234;
        print(n);
    }


    public static int fac(int n) {
        if(n == 1) {
            return 1;
        }
        return n * fac(n-1);
    }
    public static void main10(String[] args) {//����5�Ľ׳�
        int n = 5;
        int ret = fac(n);
        System.out.println(n + "�Ľ׳���" + ret);
    }


    //����������
    //��ʹ������
    public static int addInt(int a,int b) {
        return a + b;
    }
    public static double addDouble(double a,double b) {
        return a + b;
    }
    public static void main8(String[] args) {
        int a = 10;
        int b = 20;
        int ret = addInt(a,b);
        System.out.println("ret=" + ret);
        double a1 = 10.5;
        double a2 = 20.5;
        double ret2 = addDouble(a1,a2);
        System.out.println("ret2=" + ret2);
    }


    //ʹ������
    public static int add(int a,int b) {
        return a + b;
    }
    public static double add(double a,double b) {
        return a + b;
    }
    public static double add(double a,double b,double c) {
        return a + b + c;
    }
    public static void main9(String[] args) {
        int a = 10;
        int b = 20;
        int ret = add(a,b);
        System.out.println("ret=" + ret);
        double a1 = 10.5;
        double a2 = 20.5;
        double ret2 = add(a1,a2);
        System.out.println("ret2=" + ret2);
        double a3 = 10.5;
        double b3 = 20.5;
        double c3 = 30;
        double ret3 = add(a3,b3,c3);
        System.out.println("ret3=" + ret3);
    }



    //-----------------------------------------------------------------------------------------
    //����
    public static void swap(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[1];
        arr[1] = tmp;
    }
    public static void main7(String[] args) {//������������ֵ
        int[] arr = { 10, 20 };
        swap(arr);
        System.out.println("a=" + arr[0] + ",b=" + arr[1]);
    }


    public static int factor(int n) {//�׳�֮��
        int i ;
        int j;
        int sum = 0;
        for(i = 1; i <= n; i++) {
            int ret = 1;
            for(j = 1; j <= i ;j++) {
                ret *= j;
            }
            sum += ret;
        }
        return sum;
    }
    public static void main6(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int sum = factor(i);
        System.out.println(i + "�Ľ׳�֮����:" + sum);
    }


    public static int maxThreeNum(int a, int b, int c) {//�������������ֵ
        return maxTwoNum(a,b)>c?maxTwoNum(a,b):c;
    }
    public static int maxTwoNum(int a, int b) {//�������������ֵ
        return a>b?a:b;
    }
    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int ret1 = maxTwoNum(a,b);
        int ret2 = maxThreeNum(a,b,c);
        System.out.println(ret1);
        System.out.println(ret2);
    }


    //------------------------------------------------------------------------------------------
    public static void main4(String[] args) {//��ӡһ���������Ƶ���ż����
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("����������:");
        for (int i = 31; i >= 1 ; i-=2) {
            System.out.print(((n>>i) & 1) + " ");//��������
        }
        System.out.println();
        System.out.println("ż��������:");
        for (int i = 30; i >= 0 ; i-=2) {
            System.out.print(((n>>i) & 1) + " ");//ż������
        }
    }


    public static void main3(String[] args) {//main2�������Ż�
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n != 0) {
            n = n & (n - 1);
            count++;
        }
        System.out.println("count=" + count);
    }


    public static void main2(String[] args) {//����һ������������1�ĸ���
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        for(int i = 0; i < 32; i++) {
            if(((n>>i) & 1) == 1) {
                count++;
            }
        }
        System.out.println("count=" + count);
    }


    public static void main1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 3;
        while(count != 0) {
            System.out.println("�������������:");
            String password = scan.nextLine();
            if(password.equals("123456")) {
                System.out.println("������ȷ,��¼�ɹ�!");
                break;
            }else {
                count--;
                System.out.println("�������,�㻹��" + count + "�λ���!");
            }
        }
    }
}
