package blog.services;

import blog.models.User;

import java.util.List;

/**
 * Created by marti on 04.12.2016.
 */
public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User create(User user);
    User edit(User user);
    void deleteById(Long id);
}
