//���������޶���
//public : ���е�
//private : ˽�е�
//protected : �ܱ�����
//ʲô����д : Ĭ��Ⱥ��->������Ȩ��
/*class Person {
    //�ֶ�->��Ա����  �����ڷ�����ߣ�������
    //ʵ����Ա�����ڶ������
    //ʵ����Ա����û�г�ʼ����Ĭ��Ϊ��Ӧ��0ֵ����������Ĭ��Ϊnull��������Ĭ��Ϊ0
    //����:char����Ĭ��Ϊ'\u0000'(���ַ�)   boolean����Ĭ��Ϊfalse
    public String name = "����";
    public int age = 18;
    *//*public char ch;
    public boolean flag;*//*
    //��̬��Ա����(�����ڶ���������)  ����ʼ��Ĭ��ֵΪ0ֵ
    public static int size;//ֻ��һ��
    //����->��Ϊ
    //ʵ����Ա����
    public void eat() {
        int a = 10;//�ֲ�����
        System.out.println("eat");
    }
    public void sleep() {
        System.out.println("sleep");
    }
    public void show() {
        System.out.println("�ҽ�" + name + ",����" + age + "����");
    }
    public static void func1() {
        System.out.println("static::func1()");
        //a = 999;  error  ��̬�����ڲ����ܹ����ʷǾ�̬�����ݳ�Ա
        size = 999;
    }
}
class Test {
    public int a;
    public static int count;
}
public class test_4_29 {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        person.name = "����";
        person.age = 18;
        person.show();
    }


    public static void main6(String[] args) {
        Test t1 = new Test();
        t1.a++;
        Test.count++;
        System.out.println(t1.a);
        System.out.println(Test.count);
        System.out.println("===================");
        Test t2 = new Test();
        t2.a++;
        Test.count++;
        System.out.println(t2.a);
        System.out.println(Test.count);
    }
    public static void main5(String[] args) {
        //��ε��þ�̬��Ա������   ����.����
        Person.func1();
    }


    public static void main4(String[] args) {
        //��ε���ʵ����Ա����?  ���������.����
        Person person = new Person();
        person.eat();
        person.sleep();
    }


    public static void main3(String[] args) {
        //��η��ʾ�̬�����ݳ�Ա   ����.��̬��Ա����
        System.out.println(Person.size);
    }


    public static void main2(String[] args) {
        //ͨ���ؼ���new ʵ����һ������
        Person person = new Person();
        //��η��ʶ����е�ʵ����Ա����?
        //��������� . ��Ա����
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println("==============");
        person.name = "����";
        person.age = 20;
        System.out.println(person.name);
        System.out.println(person.age);
        *//*System.out.println(person.ch);
        System.out.println(person.flag);*//*
    }


    public static void main1(String[] args) {
        //һ�������ʵ�����������
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }
}*/

class Person {
    public int age;//ʵ������   ����ڶ�����
    public String name;//ʵ������
    public String sex;//ʵ������
    public static int count;//�����Ҳ�о�̬����������ʱ�Ѿ������������౾����ֻ��һ�ݡ�����ڷ�����
    public final int SIZE = 10;//��final���εĽг�����Ҳ���ڶ��� ��final���Σ��������ɸ���
    public static final int  COUNT = 99;//��̬�ĳ����������౾��ֻ��һ�� ��final���Σ��������ɸ���
    //ʵ����Ա����
    public void eat() {
        int a = 10;//�ֲ�����
        System.out.println("eat()!");
    }
    //ʵ����Ա����
    public void sleep() {
        System.out.println("sleep()!");
    }
    //��̬��Ա����
    public static void staticTest(){
        //���ܷ��ʷǾ�̬��Ա
        //sex = "man"; error
        System.out.println("StaticTest()");
    }
}
public class test_4_29{
    public static void main(String[] args) {
        //�������� ʵ��������
        Person person = new Person();//personΪ���������
        System.out.println(person.age);//Ĭ��ֵΪ0
        System.out.println(person.name);//Ĭ��ֵΪnull
        //System.out.println(person.count);//���о���!
        //��ȷ���ʷ�ʽ��
        System.out.println(Person.count);
        System.out.println(Person.COUNT);
        Person.staticTest();
        //�ܽ᣺���б�static�����εķ����������ԣ�ȫ���������ڶ���
        person.eat();
        person.sleep();
    }
}
