public class AddressOld {
    private String name;
    private String street;
    private String zipCode;
    private String city;
    private String country;

    public AddressOld(String name, String street, String zipCode, String city, String country) {
        this.name = name;
        this.street = street;
        this.zipCode = zipCode;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((street == null) ? 0 : street.hashCode());
        result = prime * result + ((zipCode == null) ? 0 : zipCode.hashCode());
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + ((country == null) ? 0 : country.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AddressOld other = (AddressOld) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        if (street == null) {
            if (other.street != null)
                return false;
        }
        else if (!street.equals(other.street))
            return false;
        if (zipCode == null) {
            if (other.zipCode != null)
                return false;
        }
        else if (!zipCode.equals(other.zipCode))
            return false;
        if (city == null) {
            if (other.city != null)
                return false;
        }
        else if (!city.equals(other.city))
            return false;
        if (country == null) {
            if (other.country != null)
                return false;
        }
        else if (!country.equals(other.country))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Address [name=" + name + ", street=" + street + ", zipCode=" + zipCode + ", city="
                + city + ", country=" + country + "]";
    }
}
