public class Book {
    private String tittle;
    private String author;
    private int year;
    private boolean isAvaliable;
    private int pageCount;
    public Book(String tittle, String author, int year, boolean isAvaliable, int pageCount) {
        this.tittle = tittle;
        this.author = author;
        this.year = year;
        this.isAvaliable = isAvaliable;
        this.pageCount = pageCount;
    }
    public Book(){
    }
    public Book(String tittle, String author, int year){
        this.tittle = tittle;
        this.author = author;
        this.year = year;
    }
    public String displayInfo(){
        String x = "Название:"  + tittle +  "\n Автор: " + author + "\nГод издания:" + year + "\nНаличие: " + isAvaliable + "\nКоличество страниц: "  + pageCount;
        return x;
    }
    public void borrowBook(){
        isAvaliable = false;
    }
    public void returnBook(){
        isAvaliable = true;
    }
    public void setYear(int newYear){
        if (year>1 && year<2026){
            this.year = newYear;
        }
    }
}
