public abstract class Restaurant {
    protected String name;
    protected String type;
    protected String PriceFactor;
    protected Time time;


    public Restaurant() {
    }

    public Restaurant(String name,String type, String priceFactor, Time time){
        this.name = name;
        this.type = type;
        this.PriceFactor = priceFactor;
        this.time = time;


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPriceFactor() {
        return PriceFactor;
    }

    public void setPriceFactor(String priceFactor) {
        PriceFactor = priceFactor;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();
    public abstract String[] menu();
    public abstract double amount(String a);
    public abstract void Submenu();

    public void Customization(){
    }

}
