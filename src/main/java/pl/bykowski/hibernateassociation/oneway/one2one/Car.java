package pl.bykowski.hibernateassociation.oneway.one2one;

import javax.persistence.*;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;
    private String mark;

    @JoinColumn(name = "ID_Caraaa")
    @OneToOne
    private SerialNumber serialNumber;

    public SerialNumber getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(SerialNumber serialNumber) {
        this.serialNumber = serialNumber;
    }

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
}
