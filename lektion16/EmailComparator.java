import java.util.Comparator;

public class EmailComparator 
       implements Comparator<AddressBookEntry> {

    public int compare(AddressBookEntry ab1, 
                       AddressBookEntry ab2) {
        String email1 = ab1.getEmail();
        String email2 = ab2.getEmail();

        // System.out.println("jämför " + email1 + " med " + email2);

        return email1.compareTo(email2);
    }

}
