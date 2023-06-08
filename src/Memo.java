public class Memo {
    private String name;
    private String password;
    private String memo;
    private String date;

    Memo() {

    }

    //메모 입력에 필요한 생성자입니다.
    public Memo(String name, String password, String memo) {
        this.name = name;
        this.password = password;
        this.memo = memo;
    }

    Memo(String name, String pwd, String memo, String date) {
        this.name = name;
        this.password = pwd;
        this.memo = memo;
        this.date = date;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getMemo() {
        return memo;
    }

    public String getDate() {
        return date;
    }
}
// comment for commit