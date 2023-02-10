package company;

import java.util.ArrayList;

public class customer {
    private int ID ;
    private String name ;
    private String address ;
    private String BirthDate ;
    private String phoneNumber ;
    private String email ;
    private ArrayList <Order> orders=new ArrayList <> (); 
    static ArrayList <customer> ListCustomer = new ArrayList (); 
 
    
    public customer (int ID ,String name ,String address ,String BirthDate,String phoneNumber,String email) { 
        this.BirthDate = BirthDate ;
        this.ID = ID ;
        this.address = address ;
        this.email = email;
        this.name=name ;
        this.phoneNumber=phoneNumber ;
        ListCustomer.add(customer.this); 
    } 
       

   public void setOrder(String title, String model, double weight, double price) { 
      
      Order order1 = new Order(title, model, weight, price); 
   
      order1.setID(this.ID);
      order1.setName(this.name);
      orders.add(order1);
      
    }
   
    @Override
    public String toString() {
       
        return "customer"+"{" + "ID=" + ID + ", name=" + name + ", address=" + address + ", BirthDate=" + BirthDate + ", phoneNumber=" + phoneNumber + ", email=" + email + '}';
    }
    
    public  void toString2  () {
        
        for (int i=0 ;i<orders.size();i++) {
            System.out.println("Order"+"{" + "title=" + orders.get(i).getTitle() + ", model=" +orders.get(i).getModel()  + ", weight=" + orders.get(i).getWeight() + ", price=" + orders.get(i).getPrice() +  '}');
        }
    } 


    public customer() {
    }
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    


    public ArrayList<Order> getOrders() {
        return orders;
    }

}
