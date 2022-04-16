public class test_4_16 {
    public static void main(String[] args) {
        //认识byte型
        byte a = 12;
        byte b = 21;
        System.out.println(a + " " + b);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE + 1);//println默认是以整型进行打印的
    }


    public static void main5(String[] args) {
        //认识char型
        //Unicode字符集
        char ch = 'a';
        System.out.println(ch);
        char ch2 = '张';//一个汉字占两个字节
        System.out.println(ch2);
        char ch3 = 97;
        System.out.println(ch3);
    }


    public static void main4(String[] args) {
        //认识float型
        float f = 1.0F;
        System.out.println(f);
        System.out.println(Float.MAX_VALUE);
    }


    public static void main3(String[] args) {
        //认识double型
        /*double a = 10.0;
        System.out.println(a);
        System.out.println(Double.MAX_VALUE);*/

        int a = 1;
        int b = 2;
        System.out.println(a / b);
        double q = 1.0;
        double w = 2.0;
        System.out.println(q / w);

        double num = 1.1;
        System.out.println(num * num);
    }


    public static void main1(String[] args) {
        //认识int型
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println();

        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MIN_VALUE + 1;
        System.out.println(max1);
        System.out.println(max2);
        System.out.println();

        int min1 = Integer.MIN_VALUE;
        int min2 = Integer.MIN_VALUE - 1;
        System.out.println(min1);
        System.out.println(min2);
    }


    public static void main2(String[] args) {
        //认识long型
        long a = 10L;
        System.out.println(a);
        System.out.println(Long.MAX_VALUE);//Long是long都包装类


        int b = 10;
        int c = 20;
        System.out.println(b + c);
        System.out.println("abc" + b + c);//任何类型的数据和字符串拼接，结果就是字符串


    }
}
