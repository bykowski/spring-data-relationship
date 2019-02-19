package pl.bykowski.hibernateassociation.twoway.many2many;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Computer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String macIp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMacIp() {
        return macIp;
    }

    public void setMacIp(String macIp) {
        this.macIp = macIp;
    }

    @ManyToMany(mappedBy = "computerSet")
    private Set<User> userSet;

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }
}
