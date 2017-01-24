package blog.services;

import blog.models.User;
import blog.repositories.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureTestEntityManager;

import static org.assertj.core.api.Assertions.assertThat;


@AutoConfigureTestEntityManager
public class ProductServiceImplTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void userTest() {
        userRepository.save(new User("sboot", "1234"));
        User user = this.userRepository.findByName("martin");
        assertThat(user.getUsername()).isEqualTo("sboot");
        assertThat(user.getFullName()).isEqualTo("1234");
    }

}