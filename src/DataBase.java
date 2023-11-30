import java.util.Arrays;

public class DataBase {
    private Hospital[] hospitals = new Hospital[0];


    public Hospital[] getHospitals() {
        return hospitals;
    }

    public void setHospitals(Hospital hospital) {
        this.hospitals = Arrays.copyOf(hospitals, hospitals.length+1);
        hospitals[hospitals.length-1] = hospital;

    }
}
