package blog.forms;


import javax.validation.constraints.Size;

public class UserForm {

    @Size(max = 30)
    private String username;

    @Size(max = 60)
    private String passwordHash;

    @Size(max = 100)
    private String fullName;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
