package company;

import java.util.Scanner;

public class Company {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //we made a loop for the obreations and to exit the user must enter 8
        int e = 1;
        while (e == 1) {
            Company.PrintList();
            int x = input.nextInt();
            if (x == 8) {
                break;
            }
            //we add a switch to x (the obreation Number) and calling every method we created in the company class
            switch (x) {
                case 1: {
                    int xw;
                    do {
                        Company.addCustomer();
                        System.out.println("Do you want to add another customer? [1.Yes|2.NO]");
                        xw = input.nextInt();
                    } while (xw == 1);
                    System.out.println("*************************");
                    break;
                }
                case 2: {
                    int xw;
                    do {
                        Company.setOrderforCustomer();
                        System.out.println("Do you want to add another order? [1.Yes|2.NO]");
                        xw = input.nextInt();
                    } while (xw == 1);
                    System.out.println("*************************");
                    break;
                }
                case 3: {
                    Company.getCustomers();
                    System.out.println("*************************");
                    break;
                }

                case 4: {
                    Company.getOrders();
                    System.out.println("*************************");
                    break;
                }

                case 5: {
                    int xw;
                    do {
                        Company.printCustomersDataAndOrders();
                        System.out.println("Do you want to print another customer? [1.Yes|2.NO]");
                        xw = input.nextInt();
                    } while (xw == 1);
                    System.out.println("*************************");
                    break;
                }

                case 6: {
                    int xw;
                    do {
                        Company.getOrder();
                        System.out.println("Do you want to print another customer orders? [1.Yes|2.NO]");
                        xw = input.nextInt();
                    } while (xw == 1);
                    System.out.println("*************************");
                    break;
                }

                case 7: {
                    int xw;
                    do {
                        Company.printBill();
                        System.out.println("Do you want to print another customer Bill? [1.Yes|2.NO]");
                        xw = input.nextInt();
                    } while (xw == 1);
                    System.out.println("*************************");
                    break;
                }
                //to print error message if the user enter a wrong number
                default: {
                    System.out.println("You enter a wrong choise number please try again");
                }
            }
        }
    }

    //we created this method to print all the list obreation and the student name and id 
    public static void PrintList() {
        System.out.println("\t1 : Add Customer  ");
        System.out.println("\t2 : Add order to certain existing customer  ");
        System.out.println("\t3 : print all customers  ");
        System.out.println("\t4 : print all ordersrs  ");
        System.out.println("\t5 : Print a customer data and orders ");
        System.out.println("\t6 : print all orders for existing customers  ");
        System.out.println("\t7 : print a customer bill  ");
        System.out.println("\t8 : Exit");
        System.out.print("Enter a choise number : ");
    }
    // this method for created a new customer so we print a messags for the user to enter the customers data and stored in variables that has suitable data types to enter them in the customer constructor 

    public static void addCustomer() {

        System.out.println("Adding customer :");
        System.out.print("Enter the customer ID :");
        int ID = input.nextInt();
        System.out.print("Enter the customer name : ");
        String name = input.next();
        System.out.print("Enter the customer address : ");
        String address = input.next();
        System.out.print("Enter the customer birth date : ");
        String BirthDate = input.next();
        System.out.print("Enter the customer phone number : ");
        String phoneNumber = input.next();
        System.out.print("Enter the customer email :");
        String email = input.next();
        customer cus = new customer(ID, name, address, BirthDate, phoneNumber, email);
    }
    //when we want to add order we must know the customer id that we want to add the order to

    public static void setOrderforCustomer() {
        System.out.println("Enter the customer ID to set thier order : ");
        int x = input.nextInt();

        int r = 0;

        for (int i = 0; i < customer.ListCustomer.size(); i++) {

            if (x == customer.ListCustomer.get(i).getID()) {

                System.out.println("Enter the order information for the customer : " + customer.ListCustomer.get(i).getName() + " ID : " + customer.ListCustomer.get(i).getID());
                System.out.print("Enter the order title : ");
                String title = input.next();
                System.out.print("Enter the order model :  ");
                String model = input.next();
                System.out.print("Enter the order weight : ");
                double weight = input.nextInt();
                System.out.print("Enter the order price : ");
                double price = input.nextInt();

                customer.ListCustomer.get(i).setOrder(title, model, weight, price);

                r++;
            } else if (i == (customer.ListCustomer.size() - 1) && r == 0) {
                System.out.println("There is no customer who has the id that you enter.");
            }
        }

    }
    // this method for print all the cusomers data that we created

    public static void getCustomers() {
        for (int y = 0; y < customer.ListCustomer.size(); y++) {

            System.out.println(customer.ListCustomer.get(y));
        }
    }
    // this method for print all the orders from all customers that we created

    public static void getOrders() {
        for (int y = 0; y < Order.OrderList.size(); y++) {
            System.out.println(Order.OrderList.get(y));
        }
    }
    //in this method we will print the all the customer data and orders

    public static void printCustomersDataAndOrders() {
        System.out.println("Enter the id for the customer to print his/her data and orders :");
        int x = input.nextInt();
        int r = 0;
        for (int i = 0; i < customer.ListCustomer.size(); i++) {
            if (x == customer.ListCustomer.get(i).getID()) {
                r++;
                System.out.println(customer.ListCustomer.get(i));

                System.out.println("The orders:");
                customer.ListCustomer.get(i).toString2();
            } else if (i == (customer.ListCustomer.size() - 1) && r == 0) {
                System.out.println("There is no customer who has the id that you enter.");
            }
        }
    }
    //we created this method to print orders for a specific customer from the customer id  , if the Bill=1 we will print the orders and the bill and if Bill=0 we will print only orders

    public static void getOrder() {

        System.out.println("Enter the customer id that you want to print his/her orders");

        int orderID = input.nextInt();
        int m = 0;
        for (int i = 0; i < customer.ListCustomer.size(); i++) {
            if (orderID == customer.ListCustomer.get(i).getID()) {

                m++;
                for (int q = 0; q < customer.ListCustomer.get(i).getOrders().size(); q++) {
                    System.out.println(customer.ListCustomer.get(i).getOrders().get(q));
                }

            } else if (i == (customer.ListCustomer.size() - 1) && m == 0) {
                System.out.println("There is no customer who has the id that you enter.");
            }
        }
    }
    //in this method will print Bill to Customer

    public static void printBill() {

        System.out.println("Enter the customer id that you want to print his/her Bill");
        int orderID = input.nextInt();
        int m = 0;
        for (int i = 0; i < customer.ListCustomer.size(); i++) {
            if (orderID == customer.ListCustomer.get(i).getID()) {
                System.out.println("----------------------------");
                System.out.println("The Bill : ");
                m++;
                double s = 0;
                for (int q = 0; q < customer.ListCustomer.get(i).getOrders().size(); q++) {
                    System.out.println(customer.ListCustomer.get(i).getOrders().get(q));
                }
                for (int p = 0; p < customer.ListCustomer.get(i).getOrders().size(); p++) {
                    s = s + customer.ListCustomer.get(i).getOrders().get(p).getPrice();

                }
                System.out.println("The total : " + s + " $");
            } else if (i == (customer.ListCustomer.size() - 1) && m == 0) {
                System.out.println("There is no customer who has the id that you enter.");
            }
        }
    }

}
