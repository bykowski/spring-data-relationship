package pl.bykowski.hibernateassociation.twoway.one2many;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Zoo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "zoo")
    private Set<Animal> animals;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(Set<Animal> animals) {
        this.animals = animals;
    }
}
