import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

//顺序表
class MyArrayLIst {
    public int[] elem;//数组
    public int usedSize;//有效数据个数
    public static final int capacity = 10;//初始容量
    public MyArrayLIst() {
        this.elem = new int[capacity];
        this.usedSize = 0;
    }

    //数组元素是否满了
    private boolean isFull() {
        return this.elem.length == usedSize;
    }
    //判断顺序表是否为空
    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    // 打印顺序表
    public void display() {
        //System.out.println(Arrays.toString(this.elem));
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        //如果数组满了，就把数组扩大为原来的二倍
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
            System.out.println("插入位置不合法!");
        }
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize; i++) {
            if(this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(isEmpty()) {
            //return -1;
            throw new RuntimeException("顺序表为空!");//手动抛出一个异常
        }
        if(pos < 0 && pos >= usedSize) {
            //return -1;
            throw new RuntimeException("pos位置不合法!");
        }
        return this.elem[pos];
    }

    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos >= 0 && pos < usedSize) {
            this.elem[pos] = value;
        }else {
            System.out.println("pos位置不合法!");
        }
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1) {
            System.out.println("没有找到要删除的数字!");
        }else {
            for (int i = index; i < this.usedSize - 1; i++) {
                this.elem[i] =this.elem[i+1];
            }
            this.usedSize--;
        }
    }

    //获取顺序表长度
    public int size() {
        return this.usedSize;
    }

    //清空顺序表
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
        System.out.println("开始时的数组为:");
        myArrayLIst1.display();

        //System.out.println("请输入增加元素的位置以及数值:");
        //myArrayLIst1.add(scan.nextInt(),scan.nextInt());
        //System.out.println("增加数据后的数组为:");
        //myArrayLIst1.display();

        /*System.out.println("请输入你要查找的数据:");
        if(myArrayLIst1.contains(scan.nextInt())) {
            System.out.println("找到了！");
        }else {
            System.out.println("没有找到这个元素!");
        }*/

        /*System.out.println("请输入数据:");
        int tmp = scan.nextInt();
        if(myArrayLIst1.search(tmp) == -1) {
            System.out.println("没有找到这个元素!");
        }else {
            System.out.println("这个元素的下标为:" + tmp);
        }
        System.out.println();*/

        //System.out.println(myArrayLIst1.getPos(3));

        myArrayLIst1.setPos(10,5);
        myArrayLIst1.display();

        //System.out.println("请输入要删除的元素:");
        //myArrayLIst1.remove(scan.nextInt());
        //System.out.println("删除后的数组为:");
        //myArrayLIst1.display();

        /*System.out.println("删除数组中所有的元素");
        myArrayLIst1.clear();
        System.out.println("删除后的数组为:");
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

        System.out.println("交换前:");
        System.out.println(value1.val);
        System.out.println(value2.val);

        swap2(value1,value2);

        System.out.println("交换后:");
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

        System.out.println("交换前:");
        System.out.println(value1.getVal1());
        System.out.println(value2.getVal2());

        swap1(value1,value2);

        System.out.println("交换后:");
        System.out.println(value1.getVal1());
        System.out.println(value2.getVal2());
    }


    public static void main1(String[] args) {
        Calculator calculator = new Calculator();
        calculator.setNum1(10);
        calculator.setNum2(20);
        System.out.println("加法的结果为:");
        System.out.println(calculator.add());

        System.out.println("减法的结果为:");
        System.out.println(calculator.sub());

        System.out.println("乘法的结果为:");
        System.out.println(calculator.mul());

        System.out.println("除法的结果为:");
        System.out.println(calculator.div());
    }
}
