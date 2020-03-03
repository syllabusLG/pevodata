package ibbl.lu.pevodata.web;

import ibbl.lu.pevodata.entities.Sdiworkitem;
import ibbl.lu.pevodata.service.SdiWorkItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ibbl/api")
public class SdiWorkItemController {

    @Autowired
    private SdiWorkItemService sdiWorkItemService;

    @RequestMapping(value = "/items", method = RequestMethod.GET)
    public List<Sdiworkitem> getAllItems(){
        return this.sdiWorkItemService.getAllSdiWorkItems();
    }

    @RequestMapping(value = "/key/{keyId}", method = RequestMethod.GET)
    public Sdiworkitem getItemById(@PathVariable String keyId){
        return this.sdiWorkItemService.getSdiWorkItemById(keyId);
    }
}
