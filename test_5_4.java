//封装:用private修饰 属性 或者 方法
//this : 当前对象的 引用
class Student {
    private String MyName;//private限制你只能在类当中访问
    private int age;
    //提供一个公开的接口
    public String getMyName() {
        return this.MyName;
    }
    public void setMyName(String MyName) {
        //MyName = MyName  其实就是自己给自己赋值  并没有赋值属性  因为局部变量优先
        this.MyName = MyName;
    }
    public void show() {
        age = 18;
        System.out.println("我叫" + this.MyName + ",今年" + age + "岁了。");
    }

    /*//快捷键：alt + ins
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


    //快捷键：alt + ins
    /*@Override//注解: 表示这个方法是重写的
    public String toString() {
        return "Student{" +
                "MyName='" + MyName + '\'' +
                ", age=" + age +
                '}';
    }*/
}


//构造方法
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


//this的用法
class Person2 {
    private String name;
    private int age;
    public String getMyName() {
        return this.name;
    }
    public void eat() {
        System.out.println(this.getMyName());//this.func() : 调用当前对象的方法
        System.out.println(this.age);//this.data : 调用当前对象的属性
    }
    public Person2() {
        this("曹操",45);//this() : 调用自己的构造方法  调用必须是构造函数主体中的第一条语句
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
        Person1 person2 = new Person1("张三",18);
        System.out.println(person2);
    }


    public static void main1(String[] args) {
        Student student = new Student();
        student.setMyName("张三");
        String str = student.getMyName();
        System.out.println(str);
        //student.show();
        System.out.println(student);//如果注释掉38到45行，则会打印Person1@16b98e56(类型@地址的哈希值)
    }
}
