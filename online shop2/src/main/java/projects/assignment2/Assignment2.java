package projects.assignment2;

/**
 *
 * @author MOHAMED HASSAN
 */
abstract class Product{
    double price;
    String productName;

    public Product() {
    }

    public Product(double price, String Name) {
        this.price = price;
        this.productName = Name;
    }

    public abstract double getPrice(); 
       
}
class Book extends Product{
    public Book() {}

    public Book(double price, String Name) {
        super(price, Name);
    }

    @Override
    public double getPrice() {
        
        return super.price=price*.3;
    }
}
class ChildrenBook extends Book{

    public ChildrenBook(double price, String Name) {
        super(price, Name);
    }

    @Override
    public double getPrice() {
        
        return super.price=price*.3;
    }
    }
public class Assignment2 {

    public static void main(String[] args) {
       Product arr[] = new Product[3];
        arr[0]= new Book(250,"ddd");
        arr[1]=new ChildrenBook(332, "lll");
        arr[2]=new ChildrenBook(400, "kid");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("The price of Book"+(i+1)+" : "+arr[i].getPrice());
            
        }
    }
}
