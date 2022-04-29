//访问修饰限定符
//public : 公有的
//private : 私有的
//protected : 受保护的
//什么都不写 : 默认群限->包访问权限
/*class Person {
    //字段->成员变量  定义在方法外边，类的里边
    //实例成员变量在对象里边
    //实例成员变量没有初始化，默认为对应的0值。引用类型默认为null，简单类型默认为0
    //特殊:char类型默认为'\u0000'(空字符)   boolean类型默认为false
    public String name = "张三";
    public int age = 18;
    *//*public char ch;
    public boolean flag;*//*
    //静态成员变量(不属于对象，属于类)  不初始化默认值为0值
    public static int size;//只有一份
    //方法->行为
    //实例成员方法
    public void eat() {
        int a = 10;//局部变量
        System.out.println("eat");
    }
    public void sleep() {
        System.out.println("sleep");
    }
    public void show() {
        System.out.println("我叫" + name + ",今年" + age + "岁了");
    }
    public static void func1() {
        System.out.println("static::func1()");
        //a = 999;  error  静态方法内部不能够访问非静态的数据成员
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
        person.name = "李四";
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
        //如何调用静态成员方法？   类名.方法
        Person.func1();
    }


    public static void main4(String[] args) {
        //如何调用实例成员方法?  对象的引用.方法
        Person person = new Person();
        person.eat();
        person.sleep();
    }


    public static void main3(String[] args) {
        //如何访问静态的数据成员   类名.静态成员变量
        System.out.println(Person.size);
    }


    public static void main2(String[] args) {
        //通过关键字new 实例化一个对象
        Person person = new Person();
        //如何访问对象当中的实例成员变量?
        //对象的引用 . 成员变量
        System.out.println(person.name);
        System.out.println(person.age);
        System.out.println("==============");
        person.name = "李四";
        person.age = 20;
        System.out.println(person.name);
        System.out.println(person.age);
        *//*System.out.println(person.ch);
        System.out.println(person.flag);*//*
    }


    public static void main1(String[] args) {
        //一个类可以实例化多个对象
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }
}*/

class Person {
    public int age;//实例变量   存放在对象内
    public String name;//实例变量
    public String sex;//实例变量
    public static int count;//类变量也叫静态变量，编译时已经产生，属于类本身，且只有一份。存放在方法区
    public final int SIZE = 10;//被final修饰的叫常量，也属于对象。 被final修饰，后续不可更改
    public static final int  COUNT = 99;//静态的常量，属于类本身，只有一份 被final修饰，后续不可更改
    //实例成员函数
    public void eat() {
        int a = 10;//局部变量
        System.out.println("eat()!");
    }
    //实例成员函数
    public void sleep() {
        System.out.println("sleep()!");
    }
    //静态成员函数
    public static void staticTest(){
        //不能访问非静态成员
        //sex = "man"; error
        System.out.println("StaticTest()");
    }
}
public class test_4_29{
    public static void main(String[] args) {
        //产生对象 实例化对象
        Person person = new Person();//person为对象的引用
        System.out.println(person.age);//默认值为0
        System.out.println(person.name);//默认值为null
        //System.out.println(person.count);//会有警告!
        //正确访问方式：
        System.out.println(Person.count);
        System.out.println(Person.COUNT);
        Person.staticTest();
        //总结：所有被static所修饰的方法或者属性，全部不依赖于对象。
        person.eat();
        person.sleep();
    }
}
