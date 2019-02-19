package pl.bykowski.hibernateassociation.twoway.many2many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component("manyToMany")
public class Start {

    private ComputerRepo computerRepo;
    private UserRepo userRepo;

    @Autowired
    public Start(ComputerRepo computerRepo, UserRepo userRepo) {
        this.computerRepo = computerRepo;
        this.userRepo = userRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample() {
        Computer computer1 = new Computer();
        computer1.setMacIp("00-14-22-01-23-45");

        Computer computer2 = new Computer();
        computer2.setMacIp("00-14-22-01-23-23");

        User user1 = new User();
        user1.setName("Jan");

        User user2 = new User();
        user2.setName("Karolina");

        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        computer1.setUserSet(users);

        computer2.setUserSet(Collections.singleton(user2));

        user1.setComputerSet(Collections.singleton(computer1));

        Set<Computer> computerSet = new HashSet<>();
        computerSet.add(computer1);
        computerSet.add(computer2);
        user2.setComputerSet(computerSet);

        computerRepo.save(computer1);
        computerRepo.save(computer2);

        userRepo.save(user1);
        userRepo.save(user2);
    }
}
