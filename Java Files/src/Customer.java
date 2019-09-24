import java.io.Serializable;
import java.util.ArrayList;

public class Customer extends Person implements Serializable {
    private Cart cart;

    public Customer() {
        super();
    }

    public Customer(String firstname, String lastname, String mobileNo, String email, String password, Address address, Cart cart) {
        super(firstname, lastname, mobileNo, email,password,address);
        Time t1 = new Time ("45 mins");
       ArrayList<Double> finalAChk = null;
        Cart c = new Cart(finalAChk);
    }

   /* public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean verifyEmail(String email){
        if(email.contains("@") && email.contains(".com")){
        return true;
        }
        else{
            //System.out.println("Incorrect email");
            return false;
        }
    }

    public boolean verifyContact(String contact){
        String [] a = {"12","22","23","11","31","35","34","13","14","15","33"};
        for (int i =0; i<11; i++){
        if(contact.contains("03"+a[i]) && contact.startsWith("03")){
            return true;
        }
        else{
            return false;
           }
         }
         return false;
        }

    public boolean verifyAddress(Address a){
        if(a.getCity().equalsIgnoreCase("Islamabad")||a.getCity().equalsIgnoreCase("Rawalpindi")){
            return true;
        }
        else{
        return false;
       }
    }

    public boolean login(String email,String pass){
        if (this.email.equalsIgnoreCase(email) && this.password.equals(pass)){
            return true;
        }
        else{
            return false;
        }
    }

    public void addToCart(double a ){

        ArrayList <Double> cko = null ;
 // for (int i=0; i<cko.size();i++){
        cko.add(a);
        this.cart.setCheckOut(cko);

    }
   // }}

    //public double getcheckout(){
      //  double tck = this.cart.Total();
        //return  tck;
    //}

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}


