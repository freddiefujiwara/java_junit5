package tddbc;

import java.util.Arrays;

public class VendingMachine {

    public int total;

    public VendingMachine() {
        this.total = 0;
    }

    public void input(int coin) throws NumberFormatException {
        Integer arr[] = { 10, 50, 100, 500, 1000 };
        if (Arrays.asList(arr).contains(coin)) {
            this.total += coin;
            return;
        }
        throw new NumberFormatException("coin should be 10,50,100,500 or 1000");
    }

    public int refund() {
        int prev_total = this.total;
        this.total = 0;
        return prev_total;
    }

}
