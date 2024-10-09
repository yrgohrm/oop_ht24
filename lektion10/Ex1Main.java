public class Ex1Main {
    public static void main(String[] args) {
        Student student = new Student("Jennie Jenniesson", "Java Enterprise Utvecklare");
        
        // anropar metoden i Person
        student.getName();

        // anropar metoden i Student
        student.getProgram();

        student.sayHello();

        ExchangeStudent student2 = new ExchangeStudent("Bosse Bredsladd", "Fulkodare", "Obyggdens hemskola");

        student2.getName();
        student2.getProgram();
        student2.getSchool();
    }
}
