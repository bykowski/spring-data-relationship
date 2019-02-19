package pl.bykowski.hibernateassociation.twoway.one2one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service("Airplane")
public class Start {

    private AirplaneRepo airplaneRepo;
    private AirplaneNumberRepo airplaneNumberRepo;

    @Autowired
    public Start(AirplaneRepo airplaneRepo, AirplaneNumberRepo airplaneNumberRepo) {
        this.airplaneRepo = airplaneRepo;
        this.airplaneNumberRepo = airplaneNumberRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void start() {
        AirplaneNumber airplaneNumber = new AirplaneNumber();
        airplaneNumber.setNumber("AD231");
        airplaneNumberRepo.save(airplaneNumber);

        Airplane airplane = new Airplane();
        airplane.setMark("Bombardier");
        airplane.setModel("F12");
        airplane.setAirplaneNumber(airplaneNumber);

        airplaneRepo.save(airplane);
    }
}
