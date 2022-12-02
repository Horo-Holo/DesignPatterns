
public class Main1 {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("三国演义"));
        bookShelf.appendBook(new Book("红楼梦"));
        bookShelf.appendBook(new Book("水浒传"));
        bookShelf.appendBook(new Book("西游记"));
        bookShelf.appendBook(new Book("老人与海"));
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("图解Http"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }
    }
}
