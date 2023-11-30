import java.time.LocalDate;

public class Patient extends Doctor{
    public Patient() {
    }
    public Patient(String name, String address, Doctor[] doctor, LocalDate dateOfBirth, String gender, String email) {
        super(name, address, doctor, dateOfBirth, gender, email);
    }

    @Override
    public String toString() {
        return "Patient{} " + super.toString();
    }
}
