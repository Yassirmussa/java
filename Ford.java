public class Ford extends Car {
    private int Year;
    private int ManufacturerDiscount;

    public Ford(int Speed, String color, double regularPrice,int Year,int ManufacturerDiscount) {
        super(Speed, color, regularPrice);
        this.Year=Year;
        this.ManufacturerDiscount=ManufacturerDiscount;
    }

    public double getSalePrice(){
        return regularPrice-ManufacturerDiscount;
    }
    
    
}
