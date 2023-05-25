package Toffee;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner ;

/**

 The MemberUser class represents a member user in the system.
 *  * @author mahmoud sayed abdalaty
 *  * kirolos osama adip
 *  * kirolos mansour

 */
public class MemberUser {
    Scanner in = new Scanner(System.in);
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private int userID;
    private String userPassword;
    private String confirm;
    private String userPhone;
    private int points;
    public static ArrayList <MemberUser> registeredUsers = new ArrayList<MemberUser>();

    private List<Orders> orderHistory;
    private List<Cart> carts;
    private static int usersCounter = 0;
    /**

     Gets the first name of the user.
     @return The user's first name.
     */
    public String getUserFirstName() {
        return userFirstName;
    }


    /**

     Sets the first name of the user.
     @param userFirstName The user's first name.
     */
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }
    /**

     Gets the last name of the user.
     @return The user's last name.
     */
    public String getUserLastName() {
        return userLastName;
    }
    /**

     Sets the last name of the user.
     @param userLastName The user's last name.
     */

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }
    /**

     Gets the email of the user.
     @return The user's email.
     */
    public String getUserEmail() {
        return userEmail;
    }
    /**

     Sets the email of the user.
     @param userEmail The user's email.
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    /**

     Gets the ID of the user.
     @return The user's ID.
     */
    public int getUserID() {
        return userID;
    }
    /**

     Sets the ID of the user.
     @param userID The user's ID.
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }
    /**

     Gets the confirmation string.
     @return The confirmation string.
     */
    public String getConfirm() {
        return confirm;
    }
    /**

     Sets the confirmation string.
     @param confirm The confirmation string.
     */

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    /**

     Gets the password of the user.
     @return The user's password.
     */
    public String getUserPassword() {
        return userPassword;
    }
    /**

     Sets the password of the user.
     @param userPassword The user's password.
     */

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    /**

     Gets the phone number of the user.
     @return The user's phone number.
     */
    public String getUserPhone() {
        return userPhone;
    }
    /**

     Sets the phone number of the user.
     @param userPhone The user's phone number.
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
    /**

     Gets the points of the user.
     @return The user's points.
     */
    public int getPoints() {
        return points;
    }

    /**
     * Sets the points of the user.
     *
     * @param points The user's points.
     */
    public void setPoints(int points) {
        this.points = points;
    }
    /**
     * Gets the order history of the user.
     *
     * @return The user's order history.
     */
    public List<Orders> getOrderHistory() {
        return orderHistory;
    }
    /**
     * Sets the order history of the user.
     *
     * @param orderHistory The user's order history.
     */
    public void setOrderHistory(List<Orders> orderHistory) {
        this.orderHistory = orderHistory;
    }
    /**
     * Gets the counter for the number of users.
     *
     * @return The number of users.
     */
    public static int getUsersCounter() {
        return usersCounter;
    }
    /**
     * Sets the counter for the number of users.
     *
     * @param usersCounter The number of users.
     */
    public static void setUsersCounter(int usersCounter) {
        MemberUser.usersCounter = usersCounter;
    }
    /**
     * Gets the carts of the user.
     *
     * @return The user's carts.
     */
    public List<Cart> getCarts() {
        return carts;
    }
    /**
     * Sets the carts of the user.
     *
     * @param carts The user's carts.
     */
    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }


    /**
     * Buys a voucher for the user.
     *
     * @param v The voucher to be bought.
     */
    public void buyVoucher(Voucher v) {
        if (v.isValidVoucher(v.voucherID)) {
            System.out.println("Voucher have been bought successfully");
        } else {
            System.out.println("Unable to buy this");
        }
    }

    /**
     * Adds a product to the user's cart.
     *
     * @param product The product to be added.
     */
    public void addToCart(Product product) {
        // here user add items to cart
        // Create a new cart if the user doesn't have any
        if (carts == null) {
            carts = new ArrayList<>();
        }

        // Add the product to a new cart
        Cart cart = new Cart();
        cart.setContent(product);
        carts.add(cart);
    }
    /**
     * Registers a new user.
     */
    public  void register() {
        System.out.println("Please enter your first name: ");
        setUserFirstName(in.next());
        System.out.println("Please enter your last name: ");
        setUserLastName(in.next());
        // Validate phone number
        while (true) {
            System.out.println("Please enter your phone number :");
            String phone = in.next();
            if (phone.matches("(01)[0125]\\d{8}")) {
                setUserPhone(phone);
                break;
            } else {
                System.out.println("Invalid phone number format, please try again.");
            }
        }

        while (true) {
            System.out.println("Please enter your email address:");
            String email = in.next();
            if (email.matches("\\w+@(\\w+\\.)+[a-z]{2,}")) {
                setUserEmail(email);
                break;
            } else {
                System.out.println("Invalid email address format, please try again.");
            }
        }

        while (true) {
            System.out.println("Please enter a password:");
            String password = in.next();
            if (password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$*%^&+=]).{8,}$")) {
                setUserPassword(password);
                break;
            } else {
                System.out.println("Invalid password format, please try again.");
            }
        }


        System.out.println("Please confirm your password:");
        String confirm = in.next();
        while (!confirm.equals(userPassword)) {
            System.out.println("Passwords do not match, please try again.");
            System.out.println("Please enter a password:");
            userPassword = in.next();
            System.out.println("Please confirm your password:");
            confirm = in.next();
        }
        while (true){
            if(Objects.equals(confirm, userPassword)){
                System.out.println("Registered successfully");
                usersCounter++;
                for(int i =0 ;i < usersCounter;i++){
                    registeredUsers.add(this);
                    this.userID = i+1;
                }
                break;
            }else {
                System.out.println("Password doesn't matches");
                System.out.println("Please enter Password:");
                userPassword = in.next();
                System.out.println("Please confirm your password:");
                confirm = in.next();
            }
        }
        
    }
    /**
     * Views the user's data.
     */
    public void viewData(){
        System.out.println("Enter your ID");
        int i = in.nextInt();
        System.out.println("First name: " + registeredUsers.get(i-1).userFirstName);
        System.out.println("Last name: " + registeredUsers.get(i-1).userLastName);
        System.out.println("E-mail: " + registeredUsers.get(i-1).userEmail);
        System.out.println("Your ID: " + registeredUsers.get(i-1).userID);
        System.out.println("Your Phone: " + registeredUsers.get(i-1).userPhone);
    }
    /**
     * Views the user's order history.
     */
    public void viewOrderHistory() {
        // here user view his order history
    }
    /**
     * Logs in the user.
     */
    public void logIn() {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their email and password
        System.out.println("Please enter your email address:");
        String email = scanner.next();

        System.out.println("Please enter your password:");
        String password = scanner.next();

        // Check if the email and password match a registered user
        boolean foundUser = false;
        for (MemberUser user : registeredUsers) {
            if (user.getUserEmail().equals(email) && user.getUserPassword().equals(password)) {
                foundUser = true;
                System.out.println("Logged in successfully!");
                break;
            }
        }

        if (!foundUser) {
            System.out.println("Invalid email or password. Please try again.");
        }
    }

    /**
     * Constructs a new MemberUser instance.
     */
    MemberUser(){
        register();
        viewData();
    }
}
