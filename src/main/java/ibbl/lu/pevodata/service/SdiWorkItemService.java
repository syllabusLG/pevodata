package ibbl.lu.pevodata.service;

import ibbl.lu.pevodata.entities.Sdiworkitem;

import java.util.List;

public interface SdiWorkItemService {
    public List<Sdiworkitem> getAllSdiWorkItems();
    public Sdiworkitem getSdiWorkItemById(String id);
}
