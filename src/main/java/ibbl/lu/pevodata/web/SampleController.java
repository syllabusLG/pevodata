package ibbl.lu.pevodata.web;

import ibbl.lu.pevodata.entities.Sample;
import ibbl.lu.pevodata.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/ibbl/api")
public class SampleController {

    @Autowired
    private SampleService sampleService;

    @RequestMapping(value = "/samples", method = RequestMethod.GET)
    public List<Sample> getAllSamples(){
        return this.sampleService.getAllSamples();
    }

    @RequestMapping(value = "/id/{sampleId}")
    public Sample getSampleBySampleId(@PathVariable String sampleId){
        return this.sampleService.getSampleById(sampleId);
    }
}
