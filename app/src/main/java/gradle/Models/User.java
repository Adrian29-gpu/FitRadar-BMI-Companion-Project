package gradle.Models;

public class User extends Model {
    private String username;
    private String fullname;
    private String phonenumber;

    public User(int id, String username, String fullname, String phonenumber) {
        super(id);
        this.username = username;
        this.fullname = fullname;
        this.phonenumber = phonenumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
