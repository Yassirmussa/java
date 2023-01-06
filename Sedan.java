public class Sedan extends Car {

    private int Length;

    public Sedan(int Speed, String color, double regularPrice,int Length) {
        super(Speed, color, regularPrice);
        this.Length=Length;
    }

    public double getSalePrice(){
        if(Length>20)return regularPrice*0.05;
        else return regularPrice*0.1;
    }
    
}
