public class Product {
    private String name;
    private double price;
    private String category;
    private boolean inStock;
    private int quantity;
    public Product(String name, double price, String category, boolean inStock, int quantity) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.inStock = inStock;
        this.quantity = quantity;
    }
    public Product(String name, double price, String category) {
        this.name =name;
        this.price = price;
        this.category = category;
    }
    public Product(){

    }
    public String displayInfo(){
        String x = "Название: " + name + "\nЦена: " +  price + "\nКатегория: " + category + "\nВ наличии: " + quantity;
        return x;
    }
    public void applyDiscount1(double percent){
        double newPrice = price * (1 - percent);
        this.price = newPrice;
    }
    public void restock(int amount){
        this.quantity += amount;
    }
    public void sell(int amount){
        if(quantity >= amount){
            quantity -= amount;
        }else{
            System.out.println("Нема столько");
        }
    }
}
