package ibbl.lu.pevodata.service;

import ibbl.lu.pevodata.dao.SampleRepository;
import ibbl.lu.pevodata.entities.Sample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SampleServiceImpl implements SampleService {

    @Autowired
    private SampleRepository sampleRepository;
    @Override
    public List<Sample> getAllSamples() {
        return this.sampleRepository.findAll();
    }

    @Override
    public Sample getSampleById(String id) {
        return this.sampleRepository.findBySampleId(id);
    }
}
