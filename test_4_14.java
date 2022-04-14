/*
public class test_4_14 {//打印1到100之间的素数，并每输出8个换行
    public static void main(String[] args) {
        int i;
        int count=0;
        for(i=2;i<=100;i++)
        {
            int j;
            boolean a=true;
            for(j=2;j<Math.sqrt(i);j++)
            {
                if(i%j==0)
                {
                    a=false;
                    break;
                }
            }
            if(a)
            {
                System.out.print(i + " ");
                count++;
                if(count == 8)
                {
                    System.out.println();
                    count = 0;
                }
*/
/*

                if(count%8==0)
                {
                    System.out.println();
                }
*//*


            }
        }
    }
}
*/


public class test_4_14{
    public static void main(String[] args) {
        test_4_14.sum(10,20);
        test_4_14.sum(444,555);
        test_4_14.sum(333,667);
    }
    public static void sum(int a,int b){
        int c = a + b;
        System.out.println(a + " + " + b + " = " + c);
    }
}
