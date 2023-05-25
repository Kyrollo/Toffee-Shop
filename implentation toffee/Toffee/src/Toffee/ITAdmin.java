package Toffee;
import java.util.ArrayList;
import java.util.function.Supplier;

/**

 The ITAdmin class represents an IT administrator who manages products and performs administrative tasks.

 It extends the StaffMember class.

 @author
 Mahmoud Sayed Abdalaty
 Kirolos Osama Adip
 Kirolos Mansour
 */


public class ITAdmin extends StaffMember {
    private String email;
    private String password;
    private ArrayList<Product> products;

    /**

     Constructs an ITAdmin object with the specified name, ID, job title, department, email, and password.
     @param name The name of the IT administrator.
     @param ID The ID of the IT administrator.
     @param jobTitle The job title of the IT administrator.
     @param department The department of the IT administrator.
     @param email The email of the IT administrator.
     @param password The password of the IT administrator.
     */
    public ITAdmin(String name, int ID, String jobTitle, String department, String email, String password) {
        super(name, ID, jobTitle, department);
        this.email = email;
        this.password = password;
        this.products = new ArrayList<>();
    }
    /**

     Logs in the IT administrator.
     */
    public void login() {
        // implementation for login
        System.out.println("IT Admin logged in");
    }

    /**

     Gives points to a user.
     */
    public void givePoints() {
        // implementation for giving points
        System.out.println("Points given");
    }
    /**

     Adds a product to the list of managed products.
     @param product The product to add.
     */
    public void addProducts(Product product) {
        // implementation for adding products
        products.add(product);
        System.out.println("Product added");
    }

    /**

     Edits the details of a product.
     @param product The product to edit.
     @param newName The new name of the product.
     @param newID The new ID of the product.
     @param newSupplier The new supplier of the product.
     @param newCounter The new counter for the product.
     */
    public void editProducts(Product product, String newName, int newID, Supplier newSupplier, int newCounter) {
        // implementation for editing products
        product.setProductName(newName);
        product.setProductID(newID);
        product.setProductSupplier(newSupplier);
        product.setProductCounter(newCounter);
        System.out.println("Product edited");
    }

    /**

     Deletes a product from the list of managed products.
     @param product The product to delete.
     */
    public void deleteProducts(Product product) {
        // implementation for deleting products
        products.remove(product);
        System.out.println("Product deleted");
    }
    /**

     Views the statistics.
     */
    public void viewStatistics() {
        // implementation for viewing statistics
        System.out.println("Statistics viewed");
    }
}
