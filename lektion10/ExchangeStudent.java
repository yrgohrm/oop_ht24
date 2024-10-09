public class ExchangeStudent extends Student {
    private String school;

    public ExchangeStudent(String name, String program, String school) {
        super(name, program);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    @Override
    public void sayHello() {
        System.out.println("Good day to you, " + name);
    }

    
}
