package record;
class Product { 
    String pname;
    String pcode;
    int price;

    
    public Product() {
    }

    
    public Product(String pname, String pcode, int price) {
        this.pname = pname;
        this.pcode = pcode;
        this.price = price;
    }

    
    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPname() { 
        return pname;
    }

    public void setPcode(String pcode) {
        this.pcode = pcode;
    }

    public String getPcode() { 
        return pcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Method to display product details
    public void display() {
        System.out.println("Pcode: " + this.pcode);
        System.out.println("Pname: " + this.pname);
        System.out.println("Price: " + this.price + "\n");
    }
}
public class Cars{ 
    public static void main(String[] args) {
        
        Product p1 = new Product();
        p1.pcode = "carsss";
        p1.pname = "Benz";
        p1.price = 1000000;

        
        System.out.println("Displaying p1:");
        p1.display();

        Product p2 = new Product("Jaguar", "car456", 250000);

        
        System.out.println("Displaying p2:");
        p2.display();

        Product p3 = new Product("Maruthi", "car800", 500000);

       
        System.out.println("Displaying p3:");
        p3.display();


        Product p = (p3.price < (p1.price < p2.price ? p1.price : p2.price)) ? p3 : ((p1.price < p2.price) ? p1 : p2);

     
        System.out.println("\nDisplaying the lowest price product:");
        p.display();
    }
}


