public class test_4_13 {
    public static void main(String[] args) {
        int i;
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
                System.out.println(i+" ");
        }
    }
}
