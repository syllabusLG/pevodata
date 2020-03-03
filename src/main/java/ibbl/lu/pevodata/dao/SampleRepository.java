package ibbl.lu.pevodata.dao;

import ibbl.lu.pevodata.entities.Sample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample, String> {

    public Sample findBySampleId(String sampleId);
}
