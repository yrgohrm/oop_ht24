public class AddressTest {
    public static void main(String[] args) {

        AddressOld addrOld1 =
                new AddressOld("Bosse Bredsladd", "Paradgatan 1", "417 45", "Obygden", "Sweden");
                
        AddressOld addrOld2 =
                new AddressOld("Lena Lamm", "Lilla Landet 2", "417 13", "Storstaden", "Sweden");

        System.out.println(addrOld1 + " == " + addrOld2 + "? " + addrOld1.equals(addrOld2));
        System.out.println(addrOld1 + " == " + addrOld1 + "? " + addrOld1.equals(addrOld1));


        AddressNew addrNew1 =
                new AddressNew("Bosse Bredsladd", "Paradgatan 1", "417 45", "Obygden", "Sweden");
                
        AddressNew addrNew2 =
                new AddressNew("Lena Lamm", "Lilla Landet 2", "417 13", "Storstaden", "Sweden");

        System.out.println(addrNew1 + " == " + addrNew2 + "? " + addrNew1.equals(addrNew2));
        System.out.println(addrNew1 + " == " + addrNew1 + "? " + addrNew1.equals(addrNew1));
    }
}
