public class test_4_17 {
    public static void main(String[] args) {
        // intת����String
        int num = 10;
        String str1 = num + "";
        String str2 = String.valueOf(num);
        System.out.println(str1);
        System.out.println(str2);
        //stringת����int
        String str = "100";
        int num1 = Integer.parseInt(str);
        System.out.println(num1);
    }


    public static void main5(String[] args) {
        //ǿ������ת��
        long a = 10L;
        int b = 20;
        b = (int)a;
        System.out.println(b);
    }


    public static void main4(String[] args) {
        //��������
        byte a = 10;
        byte b = 20;
        byte c = (byte)(a + b);
        //byte c = a + b;//����д�ᱨ��,��Ϊ����ʱ��������������
        System.out.println(c);
    }


    public static void main3(String[] args) {
        //��ʶString��
        //String str = "Hello World!";
        //String str2 = "\"Hello World\"";
        //String str3 = "\\Hello World\\";
        //String str4 = "\\\\Hello World\\\\";
        //System.out.println(str);
        //System.out.println(str2);
        //System.out.println(str3);
        //System.out.println(str4);

        //String a = "Hello ";
        //String b = "World";
        //String c = a + b;
        //System.out.println(a + b);
        //System.out.println(c);

        String str = "result = ";
        int a = 10;
        int b = 20;
        String result = str + a + b;
        System.out.println(result);

        int a1 = 100;
        int b1 = 200;
        System.out.println("a1=" + a1 + ",b1=" + b1);
    }


    public static void main2(String[] args) {
        //��ʶboolean��
        boolean flag = true;
        System.out.println(flag);
        flag = false;
        System.out.println(flag);
    }


    public static void main1(String[] args) {
        //��ʶshort��
        short s = 12;
        System.out.println(s);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
    }
}
