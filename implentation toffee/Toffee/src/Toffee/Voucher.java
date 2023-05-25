package Toffee;

/**
 * Represents a voucher used in the shop.
 */
public class Voucher {
    public boolean bol;
    public int voucherID;
    public float voucherValue;
    public int[] voucherList = {1,2,3,4,6,};
    /**
     * Checks if a voucher ID is valid.
     *
     * @param id The voucher ID to check.
     * @return {@code true} if the voucher ID is valid, {@code false} otherwise.
     */
    public boolean isValidVoucher(int id){
        for (int i = 0 ; i < voucherList.length ; i++){
            if (id == voucherList[i]){
                bol= false;
                break;
            }
            else {
                bol = true;
            }
        }
        return bol;
    }
}