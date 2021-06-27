public class Account {
    private String accountNo;

    public Account(String accountNo) {
        this.accountNo = accountNo;
    }

    public String toString() {
        return "口座番号=" + this.accountNo;
    }

    public boolean equals(Object o) {
        if (o == this) { // インスタンスと引数のアドレスが一致 = 自分自身 = 等値
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Account)) {
            return false;
        }
        Account r = (Account) o; // 引数はAccountクラスの親や子クラスかもしれない
        if (!(this.accountNo.trim().equals(r.accountNo.trim()))) {
            return false;
        }
        return true;
    }
}
