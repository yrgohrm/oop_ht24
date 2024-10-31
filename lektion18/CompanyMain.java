public class CompanyMain {
    public static void main(String[] args) {
        // Company comp = new Company("ACME AB", "556269-1243", "Storgatan 2");
        // Company comp = new Company(null, "556269-1243", "Storgatan 2");
        Company comp = new Company("ACME AB", "      ", "Storgatan 2");

        System.out.printf("Företag: %s (%s)%n", comp.name(), comp.orgNo());
        System.out.printf("Adress: %s%n", comp.streetAddress());
    }
}
