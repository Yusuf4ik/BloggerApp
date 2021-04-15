package itacademy.kg.bloggerapp;

public class userInfo {
    String userName;
    String email;
    String password;
    String confirmPass;

    public userInfo(String userName, String email, String password, String confirmPass) {
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.confirmPass = confirmPass;
    }

    public String getUserName() { return userName; }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPass() {
        return confirmPass;
    }

    public void setConfirmPass(String confirmPass) {
        this.confirmPass = confirmPass;
    }
}
