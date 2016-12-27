package blog.services;

import blog.models.Check;
import blog.models.User;

import java.util.List;

/**
 * Created by marti on 04.12.2016.
 */
public interface CheckService {
    List<Check> findAll();
    Check findById(Long id);
    Check create(Check user);
    Check edit(Check user);
    void deleteById(Long id);
}
