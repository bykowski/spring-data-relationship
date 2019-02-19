package pl.bykowski.hibernateassociation.oneway.one2many;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends CrudRepository<Subject, Long> {
}
