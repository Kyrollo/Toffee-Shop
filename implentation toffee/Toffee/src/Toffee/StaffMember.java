package Toffee;

/**
 * Represents a staff member.
 *  *  *  @author mahmoud sayed abdalaty
 *  *         *  * kirolos osama adip
 *  *         *  * kirolos mansour
 */
public class StaffMember {
    private String name;
    private int ID;
    private String jobTitle;
    private String department;

    /**
     * Constructs a new StaffMember instance.
     *
     * @param name       The name of the staff member.
     * @param ID         The ID of the staff member.
     * @param jobTitle   The job title of the staff member.
     * @param department The department of the staff member.
     */
    public StaffMember(String name, int ID, String jobTitle, String department) {
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.department = department;
    }

    /**
     * Retrieves the name of the staff member.
     *
     * @return The name of the staff member.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the staff member.
     *
     * @param name The name of the staff member.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the ID of the staff member.
     *
     * @return The ID of the staff member.
     */
    public int getID() {
        return ID;
    }

    /**
     * Sets the ID of the staff member.
     *
     * @param ID The ID of the staff member.
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     * Retrieves the job title of the staff member.
     *
     * @return The job title of the staff member.
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the job title of the staff member.
     *
     * @param jobTitle The job title of the staff member.
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    /**
     * Retrieves the department of the staff member.
     *
     * @return The department of the staff member.
     */
    public String getDepartment() {
        return department;
    }
    /**
     * Sets the department of the staff member.
     *
     * @param department The department of the staff member.
     */
    public void setDepartment(String department) {
        this.department = department;
    }
}