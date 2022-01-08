public class Ex1 {
    public static void main(String[] args) {
        Book[] b = { new Book("Java", 20000, 200), 
            new Book("cpp", 15000, 150),
            new Book("Cpgm", 10000, 100),
            new Book("DB", 25000, 250),
            new Book("python", 16000, 160) };
            firstBook(b);
    }

    public static void firstBook(Book[] a) {
        Book book = a[0];
        for (Book e : a) {
            if (e.getName().compareToIgnoreCase(book.getName())<0) {
                book = e;
            }
        }
        System.out.println(book.getName() + " " + book.getMoney() + "원 " + book.getPage() + "페이지");
    }
            
}

class Book {
    private String name;
    private int money;
    private int page;

    public Book(String name, int money, int page) {
        this.name = name;
        this.money = money;
        this.page = page;
    }
    public String getName() { return name; }
    public int getMoney() { return money; }
    public int getPage() { return page; } 
}