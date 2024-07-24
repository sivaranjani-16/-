package exam;

public class User {
    private String username;
    private String pwd;
    private String profile;

    public User(String userid, String password, String profile) {
        this.username=userid;
        this.pwd=password;
        this.profile=profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username=username;
    }

    public String getPassword() {
        return pwd;
    }

    public void setPassword(String password) {
        this.pwd=password;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile=profile;
    }
}


