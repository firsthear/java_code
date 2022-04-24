import java.util.Arrays;
import java.util.Scanner;

public class test_4_24 {
    //����
    public static String toMyString(int[] array) {
        String ret = "[";
        for (int i = 0; i < array.length; i++) {
            ret += array[i];
            if(i != array.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }
    public static void main(String[] args) {//Arrays�ǲ�������Ĺ�����
        int[] array = {12,34,6,7,10,66,15};
        System.out.println(toMyString(array));
        //Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
    }


    public static int[] func3(int[] array) {//������Ϊ����ֵ
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i] * 2;
        }
        return tmp;
    }
    public static void main8(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = func3(array);
        for (int val:ret) {
            System.out.print(val + " ");
        }
    }


    public static void main7(String[] args) {
        int a = 0;
        System.out.println(a);
        int[] array = null;//array���õ���һ���ն���
        System.out.println(array);
    }


    public static void func1(int[] array) {
        array[0] = 10;
        System.out.println("array[0]=" + array[0]);
    }
    public static void main6(String[] args) {
        int[] arr = {1,2,3};
        func1(arr);
        System.out.println("arr[0]=" + arr[0]);
    }


    public static void func(int x) {
        x = 10;
        System.out.println("x=" + x);
    }
    public static void main5(String[] args) {
        int num = 0;
        func(num);
        System.out.println("num=" + num);
    }


    public static void printArray(int[] array) {
        for (int val:array) {
            System.out.print(val + " ");
        }
    }
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        //printArray(array);
        System.out.println(Arrays.toString(array));//���������ַ�������ʽ���
    }


    public static void main3(String[] args) {
        int[] array = {1,2,3,4};
        int len = array.length;
        for(int i = 0; i < len; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int val:array) {
            System.out.print(val + " ");
        }
        System.out.println();
        System.out.println(len);
        //int[] array2 = new int[]{1,2,3,4};
        //int[] array3 = new int[4];//��ʱ����Ԫ�ص�ֵΪ0
        //array3[0] = 1;
        //array3[1] = 2;
        //array3[2] = 3;
        //array3[3] = 4;
        //System.out.println(array);
    }


//------------------------------------------------------------------------------------------------
    //������̨
    public static int JumpFloor(int n) {
        if(n == 1) {
            return 1;
        }else if(n == 2) {
            return 2;
        }else {
            return JumpFloor(n-1) + JumpFloor(n-2);
        }
    }
    public static void main2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ret = JumpFloor(n);
        System.out.println("һֻ������" + n + "��̨�׹���" + ret + "������");
    }


//----------------------------------------------------------------------------------------------
    //��ŵ��
    public static void move(char pos1,char pos2) {//��pos1�ƶ���pos2��λ��
        System.out.print(pos1 + "->" + pos2 + " ");
    }
    //n�������Ӹ�����pos1������ʼλ�ã�pos2������;λ�ã�pos3����Ŀ��λ��
    public static void hanoi(int n,char pos1,char pos2,char pos3) {
        if(n == 1) {
            move(pos1,pos3);
        }else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main1(String[] args) {
        //1������  A->C
        //2������  A->B  A->C  B->C
        //3������  A->C  A->B  C->B  A->C  B->A  B->C  A->C
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
        System.out.println();
    }
}
