package pl.bykowski.hibernateassociation.twoway.one2one;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirplaneNumberRepo extends CrudRepository<AirplaneNumber, Long> {
}
