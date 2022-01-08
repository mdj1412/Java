public class Ex4 {
    public static void main(String[] args) {
        Book[] b = { new Book("Java", 20000, 200), 
                    new Book("cpp", 15000, 150),
                    new Book("Cpgm", 10000, 100), 
                    new Book("DB", 25000, 250), 
                    new Book("Python", 16000, 160) 
                };
        int f = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i].getTitle().compareToIgnoreCase(b[f].getTitle()) < 0) 
                f = i;
        }
        System.out.println("First : "+ b[f].show()); 
    }
}

class Book {
    private String title;
    private int money;
    private int page;

    public Book(String name, int money, int page) {
        this.title = name;
        this.money = money;
        this.page = page;
    }
    public String getTitle() { return title; }
    public int getMoney() { return money; }
    public int getPage() { return page; } 
    public String show() { 
        return title + " " + money + "원 " + page + "페이지"; 
    }
}