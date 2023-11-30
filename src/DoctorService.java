import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class DoctorService implements DoctorMethods{
    DataBase dataBase = new DataBase();

    public DoctorService() {
    }

    HospitalService hospitalService = new HospitalService(dataBase);

    @Override
    public void addDoctorToHospital(String nameHospital, Doctor doctor) {
        for (int i = 0; i < dataBase.getHospitals().length; i++) {
            if(dataBase.getHospitals()[i].getName().equalsIgnoreCase(nameHospital)){
                dataBase.getHospitals()[i].setDoctor(Arrays.copyOf(dataBase.getHospitals()[i].getDoctor(), dataBase.getHospitals()[i].getDoctor().length + 1));
                dataBase.getHospitals()[i].getDoctor()[dataBase.getHospitals()[i].getDoctor().length-1] = doctor;
                System.out.println("Successful add doctor to hospital .");
                return;
            }
        }
        System.out.println("Not found hospital");
    }

    @Override
    public void getAllDoctors() {
        for (int i = 0; i < dataBase.getHospitals().length; i++) {
            for (int i1 = 0; i1 < dataBase.getHospitals()[i].getDoctor().length; i1++) {
                System.out.println(dataBase.getHospitals()[i].getDoctor()[i1]);
                System.out.println();
            }
        }
        System.out.println("Successful get all doctors");
    }

    @Override
    public void updateDoctorById(Long idDoctor) {
        for (int i = 0; i < dataBase.getHospitals().length; i++) {
            for (int j = 0; j < dataBase.getHospitals()[i].getDoctor().length; j++) {
                if(Objects.equals(dataBase.getHospitals()[i].getDoctor()[j].getId(), idDoctor)){
                    System.out.print("Enter new name: ");
                    dataBase.getHospitals()[i].getDoctor()[j].setName(new Scanner(System.in).nextLine());
                    System.out.println("Successful update doctor by id:)");
                    System.out.println(dataBase.getHospitals()[i].getDoctor()[j]);
                }
            }
        }
    }

    @Override
    public void deleteDoctorsById(Long idDoctor) {
        for (int i = 0; i < dataBase.getHospitals().length; i++) {
            for (int j = 0; j < dataBase.getHospitals()[i].getDoctor().length; j++) {
                if(Objects.equals(dataBase.getHospitals()[i].getDoctor()[j].getId(), idDoctor)){
                    for (int i1 = j; i1 < dataBase.getHospitals()[i].getDoctor().length; i1++) {
                        Doctor doctor = dataBase.getHospitals()[i].getDoctor()[i1+1];
                        dataBase.getHospitals()[i].getDoctor()[i1+1] = dataBase.getHospitals()[i].getDoctor()[i1];
                        dataBase.getHospitals()[i].getDoctor()[i1] = doctor;
                        System.out.println("Successful delete doctor by id:)");
                    }
                }
            }
        }
    }
}
