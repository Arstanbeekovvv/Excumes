import java.time.LocalDate;
import java.util.Arrays;

public class Doctor extends Hospital{
   private LocalDate dateOfBirth;
   private String gender;
   private String email;
   private Patient[] patients = new Patient[0];

    @Override
    public String toString() {
        return "Doctor{" +
                "dateOfBirth=" + dateOfBirth +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                ", patients=" + Arrays.toString(patients) +
                ", id=" + id +
                "} " + super.toString();
    }

    public Doctor() {
    }

    public Patient[] getPatients() {
        return patients;
    }

    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private Long id;

    public Doctor(String name, String address, Doctor[] doctor, LocalDate dateOfBirth, String gender, String email) {
        super(name, address, doctor);
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
