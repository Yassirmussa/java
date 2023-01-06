public class Car{
    public int Speed;
    public String color;
    public double regularPrice;

    public Car(int Speed,String color,double regularPrice){
        this.Speed=Speed;
        this.color=color;
        this.regularPrice=regularPrice;
    }

    public double getSalePrice(){
        return regularPrice;
    }

}