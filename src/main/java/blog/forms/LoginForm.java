package blog.forms;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LoginForm {

    @Size(min = 2, max = 30,
            message = "Přihlašovací jméno musí mít minimálně 3 a maximálně 30 znaků!")
    private String username;

    @Size(min = 3)
    @NotNull
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
