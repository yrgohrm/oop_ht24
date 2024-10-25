public class AddressBookEntry 
       implements Comparable<AddressBookEntry> {
    private String name;
    private String email;
    private String phone;

    public AddressBookEntry(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "name=" + name + ", email=" + email + ", phone=" + phone;
    }

    @Override
    public int compareTo(AddressBookEntry o) {
        return name.compareTo(o.name);
    }
}
