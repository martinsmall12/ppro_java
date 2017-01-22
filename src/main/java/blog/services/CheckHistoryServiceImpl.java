package blog.services;

import blog.models.CheckHistory;
import blog.repositories.CheckHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by M.B. on 21.01.2017.
 */
@Service
public class CheckHistoryServiceImpl implements CheckHistoryService {

    @Autowired
    private CheckHistoryRepository checkHistoryRepository;

    @Override
    public List<CheckHistory> findAll() { return checkHistoryRepository.findAll(); }

    @Override
    public  CheckHistory findById(Long id) {return null; }

    @Override
    public CheckHistory create (CheckHistory checkHistory) { return checkHistoryRepository.save(checkHistory); }

    @Override
    public CheckHistory edit (CheckHistory checkHistory) { return null; }

    @Override
    public void deleteById(Long id) {

    }

}
