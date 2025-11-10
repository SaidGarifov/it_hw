public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;
    private double price;
    private boolean isRunning;
    private int mileage;
    public Car(String brand, String model, int year, String color, double price, boolean isRunning, int mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.isRunning = isRunning;
        this.mileage = mileage;
    }
    public Car(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public Car(){

    }

    public void setYear(int newYear){
        year = newYear;
    }

    public String displayInfo(){
        String x = "Марка: " + brand + "\nМодель: " + model + "\nГод выпуска: " + year + "\nЦвет: " + color + "\nЦена: " + price + "\nЗаведена: " + isRunning + "\nПробег: " + mileage;
        return x;
    }
    public void startEngine(){
        isRunning = true;
    }
    public void stopEngine(){
        isRunning = false;
    }
    public void drive(int x){
        mileage += x;
    }
    public void repaint(String color){
        this.color = color;
    }
    public void updatePrice(int price){
        this.price = price;
    }
}
