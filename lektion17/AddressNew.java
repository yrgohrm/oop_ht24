public record AddressNew(String name, String street, String zip, String city, String country) {
    public String nameAndStreet() {
        return name + " " + street;
    }

}