public class run {
    public static void main(String[] args) {
        // test Mike = new test(50);
        // System.out.println(test.a);
        // System.out.println("Hello");
        // System.out.println(Mike.a);
        // System.out.println("World");
        Person.age = 25; // 修改静态变量age的值为25
        Person p1 = new Person();
        p1.age = 35; // 修改对象p1的非静态变量age的值为35
        Person p2 = new Person();
        System.out.println(Person.age); // 输出25，静态变量age被修改为25
        System.out.println(p1.age); // 输出35，对象p1的非静态变量age被修改为35
        System.out.println(p2.age); // 输出30，对象p2的非静态变量age保持为初始值30

    }
}