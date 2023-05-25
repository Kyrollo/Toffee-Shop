package Toffee;


import java.util.Date;

/**
 *  * @author mahmoud sayed abdalaty
 *  * kirolos osama adip 
 *  * kirolos mansour

 */
public class Orders {
    private int orderID;
    private Date orderDate;
    private Date shipDate;
    private Status orderStatus;
    private String orderDestination;
    private Orders[] fullOrderHistory;
    private int ordersCounter;

    /**

     Get the order ID.
     @return The order ID.
     */
    public int getOrderID() {
        return orderID;
    }
    /**

     Set the order ID.
     @param orderID The order ID to set.
     */
    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }
    /**

     Get the order date.
     @return The order date.
     */
    public Date getOrderDate() {
        return orderDate;
    }
    /**

     Set the order date.
     @param orderDate The order date to set.
     */
    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
    /**

     Get the shipping date of the order.
     @return The shipping date of the order.
     */
    public Date getShipDate() {
        return shipDate;
    }
    /**

     Set the shipping date of the order.
     @param shipDate The shipping date of the order to set.
     */
    public void setShipDate(Date shipDate) {
        this.shipDate = shipDate;
    }
    /**

     Get the status of the order.
     @return The status of the order.
     */
    public Status getOrderStatus() {
        return orderStatus;
    }
    /**

     Set the status of the order.
     @param orderStatus The status of the order to set.
     */
    public void setOrderStatus(Status orderStatus) {
        this.orderStatus = orderStatus;
    }
    /**

     Get the destination of the order.
     @return The destination of the order.
     */
    public String getOrderDestination() {
        return orderDestination;
    }
    /**

     Set the destination of the order.
     @param orderDestination The destination of the order to set.
     */
    public void setOrderDestination(String orderDestination) {
        this.orderDestination = orderDestination;
    }
    /**

     Get the full order history.
     @return The full order history.
     */
    public Orders[] getFullOrderHistory() {
        return fullOrderHistory;
    }
    /**

     Set the full order history.
     @param fullOrderHistory The full order history to set.
     */
    public void setFullOrderHistory(Orders[] fullOrderHistory) {
        this.fullOrderHistory = fullOrderHistory;
    }
    /**

     Get the counter for orders.
     @return The counter for orders.
     */
    public int getOrdersCounter() {
        return ordersCounter;
    }
    /**

     Set the counter for orders.
     @param ordersCounter The counter for orders to set.
     */
    public void setOrdersCounter(int ordersCounter) {
        this.ordersCounter = ordersCounter;
    }
    /**

     Constructs an Orders object with the provided order counter.
     @param ordersCounter The counter for orders.
     */
    public Orders(int ordersCounter) {
        this.ordersCounter = ordersCounter;
    }
}
