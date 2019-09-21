package main;

class Book {
    private String authorName;
    private String bookName;
    private String ISBN;

    public String getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    Book(String bookName, String authorName, String ISBN) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "-----------------------------\n" +
                "Book Name:\t" + getBookName() + "\n" +
                "Author Name:\t" + getAuthorName() + "\n" +
                "ISBN:\t" + getISBN() +
                "\n-----------------------------";
    }
}