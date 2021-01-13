public class Main {
    public static void main(String[] args) {
        System.out.println("KIỂM TRA MẪU SINGLETON");
        BookBorrower bookBorrower = new BookBorrower();
        BookBorrower bookBorrower1 = new BookBorrower();

        bookBorrower.borowerBook();
        System.out.println("BookBorrower hỏi mượn sách");
        System.out.println("BookBorrower Tác giả và tiêu đề");
        System.out.println(bookBorrower.getAuthorAndTitle());

        bookBorrower1.borowerBook();
        System.out.println("BookBorrower1 hỏi mượn sách");
        System.out.println("BookBorrower1 Tác giả và tiêu đề");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        bookBorrower.returnBook();
        System.out.println("BookBorrower1 trả sách");

        bookBorrower1.borowerBook();
        System.out.println("BookBorrower2 Tác giả và tiêu đề");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("KẾT THÚC KIỂM THỬ SINGLETON");
    }
}
