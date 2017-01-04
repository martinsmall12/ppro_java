package blog.services;

import blog.models.Check;

import java.util.List;

/**
 * Created by marti on 04.12.2016.
 */
public interface CheckService {
    List<Check> findAll();
    Check findById(Long id);
    Check create(Check check);
    Check edit(Check check);
    void deleteById(Long id);
}
