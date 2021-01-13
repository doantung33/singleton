public class Book {
    private String authur;
    private String title;
    private static Book book;
    private static boolean isLoanedOut;

    private Book(){
        authur= "Gamma, Helm, Johnson and Vlissides";
        title="Design Patterns";
        book=null;
        isLoanedOut=false;
    }
    public static Book getBook(){
        if (!isLoanedOut){
            if (book==null){
                book=new Book();
            }
            isLoanedOut=true;
            return book;
        }return null;
    }
    public void returnBook(Book returnBook){
        isLoanedOut=false;
    }
    public String getAuthur(){
        return authur;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthurAndTitle(){
        return getAuthur()+" by "+getTitle();
    }
}
