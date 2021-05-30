package Exam14.Account;

public class Account {
    private String accountNumber;
    private int balance;

    public int getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "￥" + this.balance + "(口座番号:" + this.accountNumber + ")";
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o instanceof Account) {
            Account oToAccount = (Account)o;
            String accountNumberOfThis = this.accountNumber.trim();
            String accountNumberOfO = oToAccount.accountNumber.trim();
            if (accountNumberOfThis.equals(accountNumberOfO)) {
                return true;
            }
        }

        return false;
    }
}
