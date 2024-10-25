import java.util.*;

public class AddressMain {
    public static void main(String[] args) {
        List<AddressBookEntry> entries = new ArrayList<>(List.of(
            new AddressBookEntry("Lena Lamm", "lena@lammindustries.com", "0799123320"),
            new AddressBookEntry("Bosse Bredsladd", "bosse@lammindustries.com", "0799123322"),
            new AddressBookEntry("Leyla Iskandar", "leyla@lammindustries.com", "0799123324"),
            new AddressBookEntry("Nils Hult", "nisse@lammindustries.com", "0799123326"),
            new AddressBookEntry("John Smith", "nisse@lammindustries.com", "0799123328")
        ));

        Collections.sort(entries);

        for (AddressBookEntry entry : entries) {
            System.out.println(entry);
        }
    }
}
