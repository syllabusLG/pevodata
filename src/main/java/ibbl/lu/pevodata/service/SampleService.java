package ibbl.lu.pevodata.service;

import ibbl.lu.pevodata.entities.Sample;

import java.util.List;

public interface SampleService {
    public List<Sample> getAllSamples();
    public Sample getSampleById(String id);
}
