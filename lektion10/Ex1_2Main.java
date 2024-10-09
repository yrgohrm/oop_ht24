public class Ex1_2Main {
    public static void main(String[] args) {
        Person p = new Person("Bosse");
        Person s = new Student("Lena", "J E U");

        System.out.println(p.getName());
        System.out.println(s.getName());

        p.sayHello();
        s.sayHello();
    }
}
