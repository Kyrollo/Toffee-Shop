package Toffee;

/**

 The Main class contains the entry point of the program.
 *  * @author mahmoud sayed abdalaty
 *  * kirolos osama adip
 *  * kirolos mansour
 */

public class Main {
    
    /**

     The main method is the entry point of the program.
     @param args The command-line arguments.
     */
    
    public static void main(String[] args) {
        Voucher v1 = new Voucher();
        v1.voucherID = 5;
        MemberUser m = new MemberUser() ;
        m.buyVoucher(v1);
    }

}
