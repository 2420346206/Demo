import java.util.Calendar;

public class User {
    private String userID;
    private String userName;
    private String password;
    private String petName;
    private Calendar date;
    private String signature;

    User(){

    };

    User(String userID, String userName, String password, String petName,Calendar date, String signature) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.petName = petName;
        this.date = date;
        this.signature = signature;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Calendar getDate() {
        return date;
    }

    public String getPassword() {
        return password;
    }

    public String getPetName() {
        return petName;
    }

    public String getSignature() {
        return signature;
    }

    public String getUserName() {
        return userName;
    }
}
