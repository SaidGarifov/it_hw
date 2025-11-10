public class MobilePhone {
    private String brand;
    private String model;
    private int storageGB;
    private int batteryLevel;
    private boolean isPoweredOn;
    public MobilePhone(String brand, String model, int storageGB, int batteryLevel, boolean isPoweredOn) {
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
        this.batteryLevel = batteryLevel;
        this.isPoweredOn = isPoweredOn;
    }
    public MobilePhone(String brand, String model, int storageGB) {
        this.brand = brand;
        this.model = model;
        this.storageGB = storageGB;
    }
    public MobilePhone(){

    }
    public String displayInfo(){
        String x = "Брэнд: " + brand + "\nМодель: " + model + "\nПамять: " + storageGB + "\nЗаряд: " + batteryLevel + "\nАктивен: " + isPoweredOn;
        return x;
    }
    public void powerOn(){
        isPoweredOn = true;
    }
    public void powerOff(){
        isPoweredOn = false;
    }
    public void chargeBattery(int percent){
        int x = batteryLevel;
        int k = 0;
        System.out.println("Заряжен на: ");
        while(x < 100 && k < percent){
            x++;
            k++;
            System.out.println(x + "%");
        }
        batteryLevel = x;
    }
    public void useBattery(int percent){
        int x = batteryLevel;
        int j = 0;
        System.out.println("Заряд батареи:");
        while(0< x && j < percent){
            x--;
            j++;
            System.out.println(x + "%");
        }
        batteryLevel = x;
    }
}
