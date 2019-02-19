package pl.bykowski.hibernateassociation.twoway.many2many;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToMany
    @JoinTable(
            name = "UsersComputers",
            joinColumns = @JoinColumn(name = "user_id") ,
            inverseJoinColumns = @JoinColumn(name = "computer_id")
    )
    private Set<Computer> computerSet;

    public Set<Computer> getComputerSet() {
        return computerSet;
    }

    public void setComputerSet(Set<Computer> computerSet) {
        this.computerSet = computerSet;
    }
}
