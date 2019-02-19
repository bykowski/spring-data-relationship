package pl.bykowski.hibernateassociation.oneway.one2one;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerialNumberRepo extends CrudRepository<SerialNumber, Long> {
}
