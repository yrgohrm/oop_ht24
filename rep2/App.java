public class App {
    public static void main(String[] args) {
        Book aBook = new Book("9781577314806",
                "The Power of Now",
                "Eckhart Tolle",
                235);

        Book anotherBook = new Book("9780141036137",
                "Animal Farm",
                "George Orwell",
                112);


        aBook.vote(5);
        aBook.vote(2);

        anotherBook.vote(4);
        anotherBook.vote(4);
        anotherBook.vote(5);

        System.out.println(aBook);
        System.out.println(anotherBook);
    }
}