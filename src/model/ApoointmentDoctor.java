package model;

import java.util.Date;


public class ApoointmentDoctor implements ISchedulable{
    private int id;
    private Patient patiend;
    private Doctor doctor;
    private Date date;
    private String time;

    @Override
    public void schedule(Date date, String time) {

    }
}
