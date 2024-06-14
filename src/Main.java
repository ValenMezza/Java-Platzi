import model.Doctor;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@anahi.com");
        Doctor myDoctor2 = new Doctor("Anahí Salgado", "anahi@anahi.com");

        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor2.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);
        System.out.println(myDoctor2);

    }
}