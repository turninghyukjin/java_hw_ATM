/**
 * AtmAccountDTO : accountID(로그인 아이디 이면서 계좌번호), accountName(계좌주 이름), accountPW(로그인 비밀번호)
 */

public class AtmAccountDTO {
// accountID
    private String accountID;
    private String accountName;
    private String accountPW;

    public AtmAccountDTO() {
    }

    public AtmAccountDTO(String accountID, String accountName, String accountPW) {
        this.accountID = accountID;
        this.accountName = accountName;
        this.accountPW = accountPW;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountPW() {
        return accountPW;
    }

    public void setAccountPW(String accountPW) {
        this.accountPW = accountPW;
    }

    @Override
    public String toString() {
        return "AtmAccountDTO{" +
                "accountID='" + accountID + '\'' +
                ", accountName='" + accountName + '\'' +
                ", accountPW='" + accountPW + '\'' +
                '}';
    }
}
