public class Truck extends Car{
    private int weight;


    public Truck(int Speed, String color, double regularPrice,int weight) {
        super(Speed, color, regularPrice);
        this.weight=weight;
    }

    public double getSalePrice(){
        if(weight>2000)return regularPrice*0.1;
        else return regularPrice*0.2; 
    }

    
}
