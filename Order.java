
package company;

import java.util.ArrayList;

public class Order  {
    private int ID ;
    private String name ; 
    private String title;
    private String model ;
    private double weight;
    private  double price ;
    static ArrayList <Order> OrderList =new ArrayList ();
 
    
    public Order(String title, String model, double weight, double price) {
        this.title = title;
        this.model = model;
        this.weight = weight;
        this.price = price;
        OrderList.add(Order.this); 
    } 
    


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getModel() {
        return model ;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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
    
    @Override
    public String toString() {

        return "Order"+"{" +"Name="+name+ ", ID="+ID+ ", title=" + title + ", model=" + model + ", weight=" + weight + ", price=" + price +  '}';
    }

   
    
}
