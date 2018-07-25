import java.util.Scanner;

public class ProductApp {

    public static void main(String[] args) {

        // Object declaration
        Product p = new Product();
        // Object initialization
        //p = new Product();

        //Before I set values - gives me default
        System.out.println(p);
        System.out.println(p.toString());

        p.setCode("CODE-001");
        p.setDescription("This is the description for product 001");
        p.setPrice(123.456789);

        // After I set values
        System.out.println(p);

        // Just to see the code for Product p
        System.out.println("This is the value for code: " + p.getCode());

        // Just to see the description for Product p
        System.out.println("This is the value for description: " + p.getDescription());

        // Just to see the price for Product p
        System.out.println("This is the value for price: " + p.getPrice());

        System.out.println("===============================================");

        // Create object instances for Book
        Book b = new Book();
        b.setAuthor("JK Rowlins");
        b.setPages(450);
        System.out.println("Author is: " + b.getAuthor());
        System.out.println("Pages: " + b.getPages());

        Book c = new Book();
        c.setAuthor("Another Author");
        c.setPages(500);
        System.out.println("Author is: " + c.getAuthor());
        System.out.println("Pages: " + c.getPages());

        System.out.println("===============================================");

        // Create object instances of the Software class
        Software s = new Software();
        s.setProgrammer("Bob the Programmer");
        s.setOs("Windows 10");
        s.setPlatform("Linux");

        System.out.println("Programmer: " + s.getProgrammer());
        System.out.println("Platform: " + s.getPlatform());
        System.out.println("Operating System: " + s.getOs());

        System.out.println("===============================================");


    }

}
