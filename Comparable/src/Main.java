import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Book[] bookArray = {new Book("War and Piece volume 4", "Lev Tolstoy", 202),
                new Book("War and Piece volume 1", "Lev Tolstoy", 308),
                new Book("War and Piece volume 3", "Lev Tolstoy", 346),
                new Book("War and Piece volume 2", "Lev Tolstoy", 322),
                new Book("War and Piece epilogue", "Lev Tolstoy", 96),
                new Book("Fahrenheit 451", "Ray Bradbury", 256)};

        Arrays.sort(bookArray);

//        for (Book book:bookArray) {
//            System.out.println(book.toString());
//        }

        Dog[] dogArray = {
                new Dog("Lord", 7, 3.5, DogBread.DOG),
                new Dog("Lexy", 3, 5.9, DogBread.LAIKA),
                new Dog("Lucy", 9, 2.3, DogBread.BULLDOG)
        };

        Arrays.sort(dogArray, new DogComparator());

        for (Dog dog:dogArray) {
            System.out.println(dog.toString());
        }
    }
}
