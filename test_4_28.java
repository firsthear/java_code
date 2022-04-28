public class test_4_28 {
    //找出这个数组当中只出现一次的数字（这个方法只适用于元素只出现一次的情况）
    public static void main(String[] args) {
        int[] array = {1,4,3,1,2,4,3};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];//a^b^a=b
        }
        System.out.println(ret);
    }


    //二维数组
    public static void main2(String[] args) {
        int[][] array = new int[2][];
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{4,5};
        for (int[] tmp:array) {
            for (int x:tmp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }


    public static void main1(String[] args) {
        //规则的数组
        int[][] array1 = {{1,2,3},{2,3,4}};
        //int[][] array2 = new int[][]{{1,2,3},{1,2,3}};
        //int[][] array3 = new int[2][2];
        for (int[] tmp:array1) {
            for (int x:tmp) {
                System.out.print(x + " ");
            }
            System.out.println();
        }

        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.deepToString(array1));*/

        /*for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}
