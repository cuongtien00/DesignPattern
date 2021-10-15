package bookSingleton;

public class BookSingleton {
    private String author;
    private String tittle;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    private  BookSingleton(){
        author = "Gamma, Helm, Johnson, and Vlissides";
        tittle = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }
    public static BookSingleton borrowBook(){
        if(!isLoanedOut){
            if(book == null){
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }
    public void returnBook(BookSingleton bookReturned){
        isLoanedOut = false;
    }
    public String getAuthor(){
        return author;
    }
    public String getTittle(){
        return tittle;
    }
    public String getAuthorAndTittle(){
        return getTittle() + " by " + getAuthor();
    }

}
