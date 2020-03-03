package ibbl.lu.pevodata.dao;

import ibbl.lu.pevodata.entities.Sdiworkitem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SdiworkitemRepository extends JpaRepository<Sdiworkitem, String> {

    public Sdiworkitem findByKeyId1(String keyId1);
}
