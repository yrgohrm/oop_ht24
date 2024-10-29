public class AddressMain {
    public static void main(String[] args) {
        AddressNew school = new AddressNew("Yrgo", "Lärdomsgatan 3", "418xx", "Göteborg", "Sweden");
        System.out.println(school.nameAndStreet());

        school = new AddressNew("Fina Yrgo", school.street(), school.zip(), school.city(), school.country());
    }
}
