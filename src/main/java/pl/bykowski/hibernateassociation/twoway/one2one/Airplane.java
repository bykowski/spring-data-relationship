package pl.bykowski.hibernateassociation.twoway.one2one;

import javax.persistence.*;

@Entity
public class Airplane {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String mark;

    @OneToOne
    private AirplaneNumber airplaneNumber;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public AirplaneNumber getAirplaneNumber() {
        return airplaneNumber;
    }

    public void setAirplaneNumber(AirplaneNumber airplaneNumber) {
        this.airplaneNumber = airplaneNumber;
    }
}
