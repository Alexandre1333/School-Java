public class BankCharges {
    private int checksWritten;
    private double balance;
    private final double BASE_FEE = 10.0;
    private final double LOW_BALANCE = 400.0;
    private final double LOW_BALANCE_FEE = 15.0;

    public BankCharges(double b, int c) {
        balance = b;
        checksWritten = c;
    }

    public void setChecksWritten(int c) {
        checksWritten = c;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public int getChecksWritten() {
        return checksWritten;
    }

    public double getBalance() {
        return balance;
    }

    public double getFees() {
        double checkFee = 0.0;
        if (checksWritten <= 20) {
            checkFee = 0.1;
        } else if (checksWritten <= 40) {
            checkFee = 0.08;
        } else if (checksWritten <= 59) {
            checkFee = 0.06;
        } else if (checksWritten >= 60) {
            checkFee = 0.04;
        }
        if (balance < LOW_BALANCE) {
            return BASE_FEE + LOW_BALANCE_FEE + (checksWritten * checkFee);
        } else {
            return BASE_FEE + (checksWritten * checkFee);
        }
    }
}
