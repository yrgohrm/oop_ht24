import java.util.*;

public record City(String name, double lon, double lat) {
   
    public static List<City> rank(List<City> cities) {
        record CityWithDistance(City city, double dist) {}

        final City gothenburg = new City("Göteborg", 57.705552, 11.936153);

        return cities.stream()
                 .map(c -> new CityWithDistance(c, distance(c, gothenburg)))
                 .sorted((c1, c2) -> Double.compare(c1.dist(), c2.dist()))
                 .map(CityWithDistance::city)
                 .toList();
    }

    public static double distance(City c1, City c2) {
        double lonVal = Math.pow(c1.lon() - c2.lon(), 2);
        double latVal = Math.pow(c1.lat() - c2.lat(), 2);
        return Math.sqrt(lonVal + latVal);
    }

    public static void main(String[] args) {
        List<City> cities = new ArrayList<>(List.of(
            new City("Borlänge", 60.482991, 15.428659),
            new City("Kungälv", 57.872902, 11.972781),
            new City("Ystad", 55.428647, 13.815068)
        ));

        List<City> bestCities = City.rank(cities);
        bestCities.forEach(System.out::println);
    }
}
