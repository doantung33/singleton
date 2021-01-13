public class BookBorrower {
    private Book borowerBook;
    private boolean haveBook= false;

    public void borowerBook(){
        borowerBook=Book.getBook();
        if (borowerBook==null){
            haveBook=false;
        }else
            haveBook=true;
    }
    public String getAuthorAndTitle(){
        if (haveBook){
            return borowerBook.getAuthurAndTitle();
        }
        return "Tôi không có cuốn sách";
    }
    public void returnBook(){
        borowerBook.returnBook(borowerBook);
    }
}
