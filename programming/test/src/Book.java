public class Book extends TangibleAsset {
    String isbn;
    public Book(String name, int price, String color, String isbn) {
        super(name, price, color); //間違い
        this.isbn = isbn;
    }
    public String getIsbn() {return this.isbn;}
}
