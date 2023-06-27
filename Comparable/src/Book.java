public class Book implements Comparable<Book>{
    private String name;
    private String author;
    private int countOfPages;

    public Book(String name, String author, int countOfPages) {
        this.name = name;
        this.author = author;
        this.countOfPages = countOfPages;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCountOfPages() {
        return countOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", countOfPages=" + countOfPages +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        int differenceName = this.name.compareTo(book.name);
        int differenceAuthor = this.author.compareTo(book.author);
        int differenceCountOfPages = this.countOfPages - book.countOfPages;

        if (differenceCountOfPages != 0) {
            return differenceCountOfPages;
        }
        if (differenceAuthor != 0) {
            return differenceAuthor;
        }
        return differenceName;
    }
}
