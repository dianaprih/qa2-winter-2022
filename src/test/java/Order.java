import java.math.BigDecimal;
import java.math.BigInteger;

public class Order {
    //-------//
    Integer a = 15;
    int aa = 15;

    Long b = 15L;
    long bb = 15L;

    Float c = 15.67f;
    float cc = 15.67f;

    Double d = 15.67;
    double dd = 15.67;

    BigDecimal bigDecimal = new BigDecimal(BigInteger.valueOf(5));


    String text = "Text";

    Character e = '&';
    char ee = '&';

    Boolean f = true;
    Boolean g = false;
    boolean fg = false;

    //---ATTRIBUTES---//
    private double totalPrice = 12.00;
    private double weight;
    private double volume;
    private int itemCount;
    private double width;
    private double height;
    private double depth;
    private String address = "name str. 9 LV-1000";

    //-------------SETTERS & GETTERS-------------//
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
