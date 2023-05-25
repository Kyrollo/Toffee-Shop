package Toffee;

import java.util.function.Supplier;


/**
 * Represents a product.
 *  *  @author mahmoud sayed abdalaty
 *         *  * kirolos osama adip
 *         *  * kirolos mansour
 */
public class Product {
    private String productName;
    private int productID;
    private Supplier productSupplier;
    private int productCounter;
    
    /**
     * Constructs a new Product instance.
     *
     * @param productName    The name of the product.
     * @param productID      The ID of the product.
     * @param productSupplier The supplier of the product.
     * @param productCounter The counter of the product.
     */

    public Product(String productName, int productID, Supplier productSupplier, int productCounter) {
        this.productName = productName;
        this.productID = productID;
        this.productSupplier = productSupplier;
        this.productCounter = productCounter;
    }
    
    /**
     * Retrieves the name of the product.
     *
     * @return The name of the product.
     */

    public String getProductName() {
        return productName;
    }
    
    /**
     * Sets the name of the product.
     *
     * @param productName The name of the product.
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }
    
    /**
     * Retrieves the ID of the product.
     *
     * @return The ID of the product.
     */
    public int getProductID() {
        return productID;
    }
    
    /**
     * Sets the ID of the product.
     *
     * @param productID The ID of the product.
     */

    public void setProductID(int productID) {
        this.productID = productID;
    }
    
    /**
     * Retrieves the supplier of the product.
     *
     * @return The supplier of the product.
     */
    public Supplier getProductSupplier() {
        return productSupplier;
    }
    
    /**
     * Sets the supplier of the product.
     *
     * @param productSupplier The supplier of the product.
     */
    public void setProductSupplier(Supplier productSupplier) {
        this.productSupplier = productSupplier;
    }
    
    /**
     * Retrieves the counter of the product.
     *
     * @return The counter of the product.
     */
    public int getProductCounter() {
        return productCounter;
    }
    
    /**
     * Sets the counter of the product.
     *
     * @param productCounter The counter of the product.
     */

    public void setProductCounter(int productCounter) {
        this.productCounter = productCounter;
    }
}