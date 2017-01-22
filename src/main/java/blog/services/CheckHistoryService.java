package blog.services;

import blog.models.CheckHistory;

import java.util.List;

/**
 * Created by M.B. on 21.01.2017.
 */
public interface CheckHistoryService {
    List<CheckHistory> findAll();
    CheckHistory findById(Long id);
    CheckHistory create(CheckHistory checkHistory);
    CheckHistory edit(CheckHistory checkHistory);
    void deleteById (Long id);
}
