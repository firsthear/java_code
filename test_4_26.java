import java.util.Arrays;

public class test_4_26 {
    //��������ż������ǰ�棬�������ں��棩
    public static void swap(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            while(left < right && array[left] % 2 == 0) {
                //ż��
                left++;
            }
            //left���������˻���left��right������
            while(left < right && array[right] % 2 != 0) {
                //����
                right--;
            }
            //right����ż���˻���left��right������
            if(left < right) {
                int tmp = 0;
                tmp = array[left];
                array[left] = array[right];
                array[right] = tmp;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {2,3,1,6,7};
        swap(array);
        System.out.println(Arrays.toString(array));
    }


    //-------------------------------------------------------------------------------------------------
    //��������
    public static void reverse(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            int tmp = 0;
            tmp = array[left];
            array[left] = array[right];
            array[right] = tmp;
            left++;
            right--;
        }
    }
    public static void main11(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }


    //--------------------------------------------------------------------------------------------------
    //ð������
    public static void bubbleSort(int[] array) {
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flag = false;
                }
            }
            if(flag) {
                break;
            }
        }
    }
    public static void main10(String[] args) {
        //int[] array = {12,2,18,68,35,27,19,11};
        int[] array = {1,2,3,4,5};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }


    //-------------------------------------------------------------------------------------------------
    //�ж�һ�������Ƿ�������
    public static boolean isUp(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(min < array[i]) {
                min = array[i];
            }else {
                return false;
            }
        }
        return true;
    }
    public static void main9(String[] args) {
        int[] array = {1,2,3,4,6,10,25};
        boolean ret = isUp(array);
        if(ret == true) {
            System.out.println("����������!");
        }else {
            System.out.println("���鲻������!");
        }
    }


    //-------------------------------------------------------------------------------------------------
    //�������鵱�е�һ��Ԫ��
    //���ֲ���
    public static int binarySearch(int[] array,int key) {
        int left = 0;
        int right = array.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            //int mid = (left + right) >>> 1;//�൱��/2
            if(array[mid] < key) {
                left = mid + 1;
            }else if(array[mid] > key) {
                right = mid - 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main8(String[] args) {
        int[] array = {12,2,18,68,35,27,19,11};
        Arrays.sort(array);
        int key = 35;
        int ret = binarySearch(array,key);
        if(ret != -1) {
            System.out.println("�±�Ϊ:" + ret);
        }else {
            System.out.println("δ�ҵ�" + key + "���Ԫ��!");
        }
    }


    //˳�����
    public static int find(int[] array,int key) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key) {
                return i;
            }
        }
        return -1;//��ʾû�����Ԫ�أ���Ϊ����û���±�Ϊ-1��Ԫ��
    }
    public static void main7(String[] args) {
        int[] array = {12,2,18,68,35,27,19};
        int key = 10;
        int ret = find(array,key);
        if(ret != -1) {
            System.out.println("�±�Ϊ:" + ret);
        }else {
            System.out.println("δ�ҵ�" +key + "���Ԫ��!");
        }
    }


    //-------------------------------------------------------------------------------------------------
    //������Ԫ�ص�ƽ��ֵ
    public static double avg(int[] array) {
        double sum = 0.0;
        for (int val:array) {
            sum += val;
        }
        return sum/array.length;
    }
    public static void main6(String[] args) {
        int[] array = {12,2,18,68,35,27,19};
        double avg = avg(array);
        System.out.println("avg=" + avg);
    }


    //-------------------------------------------------------------------------------------------------
    //�ҳ�����Ԫ�ص����ֵ
    public static int maxArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
    public static void main5(String[] args) {
       int[] array = {12,2,18,68,35,27,19};
       int max = maxArray(array);
        System.out.println("���ֵΪ:" + max);
    }


    //-------------------------------------------------------------------------------------------------
    //���鿽��
    //����4�ַ�ʽ�ӱ�����˵����ǳ����
    public static void main4(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }


    public static void main3(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = new int[array.length];
        System.arraycopy(array,0,ret,0,array.length);
        System.out.println(Arrays.toString(ret));
    }


    public static void main2(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = Arrays.copyOf(array,array.length);
        System.out.println(Arrays.toString(array));
    }


    public static int[] copyArray(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        return tmp;
    }
    public static void main1(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = copyArray(array);
        System.out.println(Arrays.toString(ret));
    }
}
