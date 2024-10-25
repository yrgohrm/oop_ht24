import java.util.*;

public class AddressBookEntryComparators {
    public static final Comparator<AddressBookEntry> PHONE_COMPARATOR 
        = Comparator.comparing(AddressBookEntry::getPhone);
    public static final Comparator<AddressBookEntry> NAME_COMPARATOR
        =  Comparator.comparing(AddressBookEntry::getName);
    public static final Comparator<AddressBookEntry> EMAIL_COMPARATOR
        =  new EmailComparator();
}
