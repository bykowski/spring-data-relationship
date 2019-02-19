package pl.bykowski.hibernateassociation.twoway.one2many;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.bykowski.hibernateassociation.twoway.one2one.AirplaneNumber;

@Repository
public interface AniamlRepo extends CrudRepository<Animal, Long> {
}
