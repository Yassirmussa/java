public class MyOwnAutoShop {

    public static void main(String[] args) {
        Sedan yas= new Sedan(50, "red", 200000,20);
        Ford yas2=new Ford(400, "green", 3000000, 6, 10000);
        Ford yas3=new Ford(300, "yellow", 2500000, 4, 120000);
        Car yas4=new Car(120, "white", 2700000);

        System.out.println("Sedan Sales Price: "+yas.getSalePrice());
        System.out.println("Ford sales : "+yas2.getSalePrice());
        System.out.println("Ford 2 sales :"+yas3.getSalePrice());
        System.out.println("Car Sales Price are: "+yas4.getSalePrice());

    }
    
}
