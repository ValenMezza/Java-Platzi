import static UI.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient("Valentino","mezza12354@gmail.com");
        patient.setPhoneNumber("11111111");
        patient.setAddress("San lorenzo 501");
        patient.setBlood("Positive");
        System.out.println(patient);
    }
}