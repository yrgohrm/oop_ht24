public class PersonMain {
    public static void main(String[] args) {
        Person nisse = new Person();
        nisse.setName("Nisse Persson");

        Person bosse = new Person();
        bosse.setName("Bosse Bredsladd");

        Person leyla = new Person();
        leyla.setName("Leyla Smith");

        System.out.println(nisse.getName());
        System.out.println(bosse.getName());
        System.out.println(leyla.getName());

        System.out.println(nisse.getLastName());
        System.out.println(bosse.getLastName());
        System.out.println(leyla.getLastName());
    }
}
