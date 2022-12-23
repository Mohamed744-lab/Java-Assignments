package com.mycompany.assignment;


    
interface Product {
    public abstract double getPrice();
}
class Book extends Products{

    public Book(double price, String Name) {
        super(price, Name);
    }

 @Override
    public double getPrice() {
        
        return price*.3;
    }
    
}

class Cartoon extends Book{
    public Cartoon(double price, String Name) {
        super(price, Name);
    }
    @Override
    public double getPrice() {
        
        return price*.7;
    }
    
}

class ChildrenBook extends Book{
   public ChildrenBook(double price, String Name) {
        super(price, Name);
    }

    @Override
    public double getPrice() {
        
        return price*.3;
    }
    
}


class Products implements Product{
    double price;
    String productName;

    public Products() {
    }

    public Products(double price, String Name) {
        this.price = price;
        this.productName = Name;
    }

    @Override
    public double getPrice() {
        return 0;
    } 
}
public class Assignment {

    public static void main(String[] args) {
       Product arr[] = new Product[3];
        arr[0]= new Book(250,"ddd");
        arr[1]=new ChildrenBook(400, "kid");
        arr[2]=new Cartoon(450, "zoro");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The price of Book"+(i+1)+" : "+arr[i].getPrice());
    }
    }}
