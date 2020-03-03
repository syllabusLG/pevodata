package ibbl.lu.pevodata.service;

import ibbl.lu.pevodata.dao.SdiworkitemRepository;
import ibbl.lu.pevodata.entities.Sdiworkitem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SdiWorkItemServiceImpl implements SdiWorkItemService {

    @Autowired
    private SdiworkitemRepository sdiworkitemRepository;

    @Override
    public List<Sdiworkitem> getAllSdiWorkItems() {
        return this.sdiworkitemRepository.findAll();
    }

    @Override
    public Sdiworkitem getSdiWorkItemById(String id) {
        return this.sdiworkitemRepository.findByKeyId1(id);
    }
}
