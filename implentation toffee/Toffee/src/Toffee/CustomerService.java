package Toffee;

/**
 * Represents a customer service staff member.
 * Inherits from the {@link StaffMember} class.
 *
 @author
 Mahmoud Sayed Abdalaty
 Kirolos Osama Adip
 Kirolos Mansour
 */
public class CustomerService extends StaffMember {
    /**
     * Constructs a new CustomerService instance.
     *
     * @param name       The name of the customer service staff member.
     * @param ID         The ID of the customer service staff member.
     * @param jobTitle   The job title of the customer service staff member.
     * @param department The department of the customer service staff member.
     */
    public CustomerService(String name, int ID, String jobTitle, String department) {
        super(name, ID, jobTitle, department);
    }
    /**
     * Accepts a return.
     *
     * @return {@code true} if the return is accepted, {@code false} otherwise.
     */
    public boolean acceptReturn() {
        // implementation for accepting return
        return true;
    }
    /**
     * Accepts a replacement.
     *
     * @return {@code true} if the replacement is accepted, {@code false} otherwise.
     */
    public boolean acceptReplace() {
        // implementation for accepting replacement
        return true;
    }
    /**
     * Rejects a return.
     *
     * @return {@code true} if the return is rejected, {@code false} otherwise.
     */

    public boolean rejectReturn() {
        // implementation for rejecting return
        return true;
    }

    /**
     * Rejects a replacement.
     *
     * @return {@code true} if the replacement is rejected, {@code false} otherwise.
     */
    public boolean rejectReplace() {
        // implementation for rejecting replacement
        return true;
    }
}
