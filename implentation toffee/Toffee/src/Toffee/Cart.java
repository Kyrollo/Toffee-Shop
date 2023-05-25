package Toffee;
import java.util.Date;
import java.util.List;

/**
 * Represents a shopping cart.
 */
public class Cart {
    private int cartID;
    private Date createDate;
    private List<Product> content;


    /**
     * Retrieves the cart ID.
     *
     * @return The cart ID.
     */
    public int getCartID() {
        return cartID;
    }

    /**
     * Sets the cart ID.
     *
     * @param cartID The cart ID to set.
     */
    public void setCartID(int cartID) {
        this.cartID = cartID;
    }
    /**
     * Retrieves the create date of the cart.
     *
     * @return The create date of the cart.
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * Sets the create date of the cart.
     *
     * @param createDate The create date of the cart.
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
    /**
     * Retrieves the content of the cart.
     *
     * @return The content of the cart.
     */
    public List<Product> getContent() {
        return content;
    }

    /**
     * Sets the content of the cart.
     *
     * @param content The content to set.
     */
    public void setContent(List<Product> content) {
        this.content = content;
    }

    /**
     * Adds a product to the cart's content.
     *
     * @param product The product to add.
     */
    void setContent(Product product) {
        content.add(product);
    }
    /**
     * Performs the checkout process.
     */
    public void checkout() {
        // here user check out
    }

}