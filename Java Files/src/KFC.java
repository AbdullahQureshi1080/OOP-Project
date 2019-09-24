import java.util.Scanner;

public class KFC extends Restaurant{
     private String [] Burgers = {"ZingerBurger","MightyZinger","KrunchBurger"};


    public KFC(String name, String type, String priceFactor, Time time) {
        super(name,type, priceFactor, time);
        //this.Burgers = burgers;
        String [] m = {"1.Value","2.Promotions","3.MealBox"};
    }

    public String[] getBurgers() {
        return Burgers;
    }

    public void setBurgers(String[] burgers) {
        Burgers = burgers;
    }

    public void display(){
        System.out.println(type);
        System.out.println(PriceFactor);
        System.out.println(time);
    }
    public String [] menu(){
        String [] m = {"1.Value","2.Promotions","3.MealBox"};
            return m;
    }


    public void Submenu(){

    }

    public double amount(String a){
        double price = 0;
        if(a.equalsIgnoreCase("KrunchBurger")){
            price += 170;
        }
        return price ;
    }
}