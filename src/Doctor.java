import java.util.Date;
import java.util.Scanner;

public class Doctor {
    //ATTRIBUTES
    static int id = 0 ;
    static String name;
    String speciality;

    private int id_avaliableAppointment;
    private Date date;
    private String time;


    Doctor(String name, String speciality){
        System.out.println("El nombre del Doctor es: "+ name);
        id++;
        this.name=name;
        this.speciality=speciality;
        showData();
    }
    //METHODS
    public void showData(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(speciality);
    }
}
