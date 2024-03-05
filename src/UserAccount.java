import java.util.Objects;

public class UserAccount {
    private Integer accountNumber;
    private String agency;
    private String userName;
    private Double balance;

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return Objects.equals(accountNumber, that.accountNumber) && Objects.equals(agency, that.agency) && Objects.equals(userName, that.userName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, agency, userName);
    }

    @Override
    public String toString() {
        return ("accountNumber= " + accountNumber + "\n")
                .concat("agency = " + agency + "\n")
                .concat("userName = " + userName + "\n")
                .concat("balance = " + balance);
    }
}
