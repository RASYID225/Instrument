// Object Class
public class Instrument {

    // Variabel
    private String type;
    private double price;

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Constructor Default (yang membuat object)
    public Instrument() {
        type = "Kosong";
        price = 0;
    }

    // Constructor Parameter
    public Instrument(String t, double p) {
        type = t;
        price = p;

    }

    // Method

    public void print() {
        System.out.println("Type :" + type);
        System.out.println("Price :" + price);

    }

}
