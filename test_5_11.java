import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

//˳���
class MyArrayLIst {
    public int[] elem;//����
    public int usedSize;//��Ч���ݸ���
    public static final int capacity = 10;//��ʼ����
    public MyArrayLIst() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    //����Ԫ���Ƿ�����
    private boolean isFull() {
        return this.elem.length == usedSize;
    }
    //�ж�˳����Ƿ�Ϊ��
    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    // ��ӡ˳���
    public void display() {
        //System.out.println(Arrays.toString(this.elem));
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // �� pos λ������Ԫ��
    public void add(int pos, int data) {
        //����������ˣ��Ͱ���������Ϊԭ���Ķ���
        if(isFull()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        if(pos >= 0 && pos <= usedSize) {
            System.arraycopy(this.elem, pos, this.elem, pos + 1, usedSize - pos);
            /*for(int i = usedSize - 1; i >= pos; i--) {
                this.elem[i+1] = this.elem[i];
            }*/
            this.elem[pos] = data;
            this.usedSize++;
        }else {
            System.out.println("����λ�ò��Ϸ�!");
        }
    }

    // �ж��Ƿ����ĳ��Ԫ��
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // ����ĳ��Ԫ�ض�Ӧ��λ��
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // ��ȡ pos λ�õ�Ԫ��
    public int getPos(int pos) {
        if(isEmpty()) {
            //return -1;
            throw new RuntimeException("˳���Ϊ��!");//�ֶ��׳�һ���쳣
        }
        if(pos < 0 && pos >= usedSize) {
            //return -1;
            throw new RuntimeException("posλ�ò��Ϸ�!");
        }
        return this.elem[pos];
    }

    // �� pos λ�õ�Ԫ����Ϊ value
    public void setPos(int pos, int value) {
        if(pos >= 0 && pos < usedSize) {
            this.elem[pos] = value;
        }else {
            System.out.println("posλ�ò��Ϸ�!");
        }
    }

    //ɾ����һ�γ��ֵĹؼ���key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("û���ҵ�Ҫɾ��������!");
        }else {
            for (int i = index; i < this.usedSize - 1; i++) {
                this.elem[i] =this.elem[i+1];
            }
            this.usedSize--;
        }
    }

    //��ȡ˳�����
    public int size() {
        return this.usedSize;
    }

    //���˳���
    public void clear() {
        this.usedSize = 0;
    }
}
public class test_5_11 {
    public static void main(String[] args) {
        MyArrayLIst myArrayLIst1 = new MyArrayLIst();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            myArrayLIst1.add(i,i);
        }
        System.out.println("��ʼʱ������Ϊ:");
        myArrayLIst1.display();

        //System.out.println("����������Ԫ�ص�λ���Լ���ֵ:");
        //myArrayLIst1.add(scan.nextInt(),scan.nextInt());
        //System.out.println("�������ݺ������Ϊ:");
        //myArrayLIst1.display();

        /*System.out.println("��������Ҫ���ҵ�����:");
        if(myArrayLIst1.contains(scan.nextInt())) {
            System.out.println("�ҵ��ˣ�");
        }else {
            System.out.println("û���ҵ����Ԫ��!");
        }*/

        /*System.out.println("����������:");
        int tmp = scan.nextInt();
        if(myArrayLIst1.search(tmp) == -1) {
            System.out.println("û���ҵ����Ԫ��!");
        }else {
            System.out.println("���Ԫ�ص��±�Ϊ:" + tmp);
        }
        System.out.println();*/

        //System.out.println(myArrayLIst1.getPos(3));

        myArrayLIst1.setPos(10,5);
        myArrayLIst1.display();

        //System.out.println("������Ҫɾ����Ԫ��:");
        //myArrayLIst1.remove(scan.nextInt());
        //System.out.println("ɾ���������Ϊ:");
        //myArrayLIst1.display();

        /*System.out.println("ɾ�����������е�Ԫ��");
        myArrayLIst1.clear();
        System.out.println("ɾ���������Ϊ:");
        myArrayLIst1.display();*/
    }
}


//---------------------------------------------------------------------------------------
class Calculator {
    private int num1;
    private int num2;
    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - this.num2;
    }

    public int mul() {
        return this.num1 * this.num2;
    }

    public double div() {
        return this.num1 * 1.0 / this.num2;
    }
}


class MyValue1 {
    private int val1;
    private int val2;

    public int getVal1() {
        return val1;
    }

    public void setVal1(int val1) {
        this.val1 = val1;
    }

    public int getVal2() {
        return val2;
    }

    public void setVal2(int val2) {
        this.val2 = val2;
    }
}


class MyValue2 {
    public int val;
}


/*public*/ class test_5_11one {
    public static void swap2(MyValue2 val1,MyValue2 val2) {
        int tmp = val1.val;
        val1.val = val2.val;
        val2.val = tmp;
    }
    public static void main(String[] args) {
        MyValue2 value1 = new MyValue2();
        value1.val = 10;
        MyValue2 value2 = new MyValue2();
        value2.val = 20;

        System.out.println("����ǰ:");
        System.out.println(value1.val);
        System.out.println(value2.val);

        swap2(value1,value2);

        System.out.println("������:");
        System.out.println(value1.val);
        System.out.println(value2.val);
    }


    public static void swap1(MyValue1 val1,MyValue1 val2) {
        int tmp = val1.getVal1();
        val1.setVal1(val2.getVal2());
        val2.setVal2(tmp);
    }
    public static void main2(String[] args) {
        MyValue1 value1 = new MyValue1();
        value1.setVal1(10);
        MyValue1 value2 = new MyValue1();
        value2.setVal2(20);

        System.out.println("����ǰ:");
        System.out.println(value1.getVal1());
        System.out.println(value2.getVal2());

        swap1(value1,value2);

        System.out.println("������:");
        System.out.println(value1.getVal1());
        System.out.println(value2.getVal2());
    }


    public static void main1(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println("�ӷ��Ľ��Ϊ:");
        System.out.println(calculator.add());

        System.out.println("�����Ľ��Ϊ:");
        System.out.println(calculator.sub());

        System.out.println("�˷��Ľ��Ϊ:");
        System.out.println(calculator.mul());

        System.out.println("�����Ľ��Ϊ:");
        System.out.println(calculator.div());
    }
}
