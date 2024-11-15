public class Person implements Comparable<Person> {
    private String name;


    @Override
    public String toString() {
        return name;
    }


    /**
     * 
     * 
     * @param o
     * @return
     * @throws
     * @see 
     */
    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
}