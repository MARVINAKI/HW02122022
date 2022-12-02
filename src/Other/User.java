package Other;

public abstract class User  {
    private String login;
    private String password;
    private String confirmPassword;

    public User(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    private String getLogin() {
        return login;
    }

    private void setLogin(String login) {
        this.login = login;
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private String getConfirmPassword() {
        return confirmPassword;
    }

    private void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
