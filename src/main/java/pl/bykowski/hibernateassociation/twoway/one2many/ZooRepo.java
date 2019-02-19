package pl.bykowski.hibernateassociation.twoway.one2many;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZooRepo extends CrudRepository<Zoo, Long> {
}
