import java.util.ArrayList;

public class Cart implements Payment{
    private ArrayList<Double>checkOut;
    //private Time timeForUser;

    public Cart(ArrayList<Double> cko) {
        this.checkOut = cko;
        //this.timeForUser = timeForUser;
    }

    /*public Time getTimeForUser() {
        return timeForUser;
    }

    public void setTimeForUser(Time timeForUser) {
        this.timeForUser = timeForUser;
    }
*/
    public ArrayList<Double> getCheckOut() {
        return checkOut;
    }

    public ArrayList<Double> setCheckOut(ArrayList<Double> checkOut) {
        this.checkOut = checkOut;
        return checkOut;
    }

    public void display(){
    }

    @Override
    public double Total() {
        double ta = 0;
        for(int i=0; i<checkOut.size(); i++){
            ta += checkOut.get(i);
        }
        return ta;
    }
}
