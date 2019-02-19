package pl.bykowski.hibernateassociation.twoway.one2many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.bykowski.hibernateassociation.twoway.one2one.Airplane;
import pl.bykowski.hibernateassociation.twoway.one2one.AirplaneNumber;
import pl.bykowski.hibernateassociation.twoway.one2one.AirplaneNumberRepo;
import pl.bykowski.hibernateassociation.twoway.one2one.AirplaneRepo;

import java.util.HashSet;
import java.util.Set;

@Service("ZooStart")
public class Start {

    private ZooRepo zooRepo;
    private AniamlRepo aniamlRepo;

    @Autowired
    public Start(ZooRepo zooRepo, AniamlRepo aniamlRepo) {
        this.zooRepo = zooRepo;
        this.aniamlRepo = aniamlRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void start() {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        Zoo zoo = new Zoo();
        animal1.setZoo(zoo);
        animal2.setZoo(zoo);
        zooRepo.save(zoo);
        aniamlRepo.save(animal1);
        aniamlRepo.save(animal2);

    }
}
