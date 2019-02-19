package pl.bykowski.hibernateassociation.oneway.one2one;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Start {

    private CarRepo carRepo;
    private SerialNumberRepo serialNumberRepo;

    @Autowired
    public Start(CarRepo carRepo, SerialNumberRepo serialNumberRepo) {
        this.carRepo = carRepo;
        this.serialNumberRepo = serialNumberRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void start() {
        SerialNumber serialNumber = new SerialNumber();
        serialNumber.setNumber("GA12345");

        Car car = new Car();
        car.setMark("Polonez");
        car.setModel("Caro");
        car.setSerialNumber(serialNumber);

        serialNumberRepo.save(serialNumber);
        carRepo.save(car);
    }
}
