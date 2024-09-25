public class Person {
    private String firstName;
    private String lastName;

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setName(String name) {
        if (name.isBlank()) {
            throw new IllegalArgumentException();
        }

        String[] names = name.split(" ");

        this.firstName = names[0];
        this.lastName = names[1];
    }
}
