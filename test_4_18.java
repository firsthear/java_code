import java.util.Scanner;

public class test_4_18 {
    public static void main(String[] args) {//��5�Ľ׳�֮��
        int i = 6;
        int sum = 0;
        while(i > 0) {
            int j = 1;
            int s = 1;
            while(j <= i) {
                s = s*j;
                j++;
            }
            sum = sum + s;
            i--;
        }
        System.out.println(sum);
    }


    public static void main9(String[] args) {//����5�Ľ׳�
        int i = 1;
        int s = 1;
        while(i <= 5) {
            s = s * i;
            i++;
        }
        System.out.println("s=" + s);
    }


    public static void main8(String[] args) {//����1��100�ĺ�
        int i = 1;
        int sum = 0;
        while(i <= 100) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum=" + sum);
    }


    public static void main7(String[] args) {//��ӡ1��10
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }


    public static void main6(String[] args) {//�ж��Ƿ�Ϊ����
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()) {//1.ctrl+c(ֱ���жϳ���)   2.ctrl+d(�����˳�)
            int year = scan.nextInt();
            if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
                System.out.println("����");
            }
            else{
                System.out.println("��������");
            }
        }
    }


    public static void main5(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(~a);
        System.out.println(~b);
        int i = 11;
        System.out.println(i >> 1);
        System.out.println(i >> 2);
        System.out.println(i << 1);
        System.out.println(i << 2);
        int s = -1;
        System.out.println(i >>> 1);
    }


    public static void main4(String[] args) {
        int a = 10;
        int b = 20;
        //System.out.println(a == b);
        //System.out.println(a != b);
        //System.out.println(a > b);
        //System.out.println(a < b);
        //System.out.println(a >= b);
        //System.out.println(a <= b);

        //System.out.println(!a < b);//���󣬡����������ֻ��������boolean���͵�������

        System.out.println(!(a < b));
        boolean flag = true;
        System.out.println(!flag);
    }


    public static void main3(String[] args) {
        //int a = 10;
        //int b = ++a;
        //System.out.println(b);
        //System.out.println(a);
        //int c = a++;
        //System.out.println(c);
        //System.out.println(a);
        int i = 10;
        i = i++;
        System.out.println(i);//�漰��java�ķ����
    }


    public static void main2(String[] args) {
        System.out.println(10%3);
        System.out.println(-10%3);
        System.out.println(10%-3);
        System.out.println(-10%-3);
        System.out.println(11.5%2.0);
    }


    public static void main1(String[] args) {
        System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println((float)5/2);
        System.out.println((float)(5/2));
    }
}
