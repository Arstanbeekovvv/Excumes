import java.util.Arrays;

public class Hospital{
    private String name;
    private String address;
    private Doctor[] doctor=  new Doctor[0];

    public Hospital() {
    }

    public Hospital(String name, String address, Doctor[] doctor) {
        this.name = name;
        this.address = address;
        this.doctor = doctor;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", doctor=" + Arrays.toString(doctor) +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Doctor[] getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor[] doctor) {
        this.doctor = doctor;
    }


}
