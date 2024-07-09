package nested.test.ex1;

public class Library {
    private Book[] books;
    private int bookCount;
    Library(int size) {
        books=new Book[size];
        bookCount=0;

    }
    public void addBook(String title,String author){
        if(bookCount<books.length) {
            books[bookCount++] = new Book(title, author);
        }else{
            System.out.println("저장공간이 부족합니다");
        }
    }
    public void showBook(){
        for(int i=0;i<books.length;i++){
            System.out.println("도서제목: "+books[i].title+" 저자: "+books[i].author);
        }

    }

    private static class Book{
        private String title;
        private String author;

        Book(String title,String author){
            this.title=title;
            this.author=author;
        }

    }
}
