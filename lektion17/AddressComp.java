import java.util.*;

public record AddressComp(String name, String street, 
                          String zip, String city, 
                          String country) 
       implements Comparable<AddressComp> {

    public AddressComp {
        Objects.requireNonNull(name, "name must not be null");
        Objects.requireNonNull(street, "street must not be null");
        Objects.requireNonNull(zip, "zip must not be null");
        Objects.requireNonNull(city, "city must not be null");
        Objects.requireNonNull(country, "country must not be null");

        country = country.toUpperCase();
    }

    @Override
    public int compareTo(AddressComp o) {
        return Comparator.comparing(AddressComp::country)
                         .thenComparing(AddressComp::city)
                         .thenComparing(AddressComp::zip)
                         .thenComparing(AddressComp::street)
                         .thenComparing(AddressComp::name)
                         .compare(this, o);
    }
}
