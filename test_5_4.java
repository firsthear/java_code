//��װ:��private���� ���� ���� ����
//this : ��ǰ����� ����
class Student {
    private String MyName;//private������ֻ�����൱�з���
    private int age;
    //�ṩһ�������Ľӿ�
    public String getMyName() {
        return this.MyName;
    }
    public void setMyName(String MyName) {
        //MyName = MyName  ��ʵ�����Լ����Լ���ֵ  ��û�и�ֵ����  ��Ϊ�ֲ���������
        this.MyName = MyName;
    }
    public void show() {
        age = 18;
        System.out.println("�ҽ�" + this.MyName + ",����" + age + "���ˡ�");
    }

    /*//��ݼ���alt + ins
    public String getMyName() {
        return MyName;
    }

    public void setMyName(String myName) {
        MyName = myName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }*/


    //��ݼ���alt + ins
    /*@Override//ע��: ��ʾ�����������д��
    public String toString() {
        return "Student{" +
                "MyName='" + MyName + '\'' +
                ", age=" + age +
                '}';
    }*/
}


//���췽��
class Person1 {
    private String name;
    private int age;
    public Person1() {
        System.out.println("Person1<init>");
    }
    public Person1(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("name=" + this.name + ",age=" + this.age);
    }
    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


//this���÷�
class Person2 {
    private String name;
    private int age;
    public String getMyName() {
        return this.name;
    }
    public void eat() {
        System.out.println(this.getMyName());//this.func() : ���õ�ǰ����ķ���
        System.out.println(this.age);//this.data : ���õ�ǰ���������
    }
    public Person2() {
        this("�ܲ�",45);//this() : �����Լ��Ĺ��췽��  ���ñ����ǹ��캯�������еĵ�һ�����
        System.out.println("Person2<init>");
    }
    public Person2(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("name=" + this.name + ",age=" + this.age);
    }
}
public class test_5_4 {
    public static void main(String[] args) {
        Person2 person1 = new Person2();
        person1.eat();
    }


    public static void main2(String[] args) {
        Person1 person1 = new Person1();
        System.out.println(person1);
        Person1 person2 = new Person1("����",18);
        System.out.println(person2);
    }


    public static void main1(String[] args) {
        Student student = new Student();
        student.setMyName("����");
        String str = student.getMyName();
        System.out.println(str);
        //student.show();
        System.out.println(student);//���ע�͵�38��45�У�����ӡPerson1@16b98e56(����@��ַ�Ĺ�ϣֵ)
    }
}
