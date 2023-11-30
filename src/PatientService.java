import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class PatientService implements PatientMethods {

    DataBase db = new DataBase();

    public PatientService() {
    }
    HospitalService hospitalService = new HospitalService(db);

    @Override
    public void addPatientToDoctor(Long id, Patient patient) {
        for (int i = 0; i < db.getHospitals().length; i++) {
            for (int j = 0; j < db.getHospitals()[i].getDoctor().length; j++) {
                if(db.getHospitals()[i].getDoctor()[j].getId().equals(id)){
                    db.getHospitals()[i].setDoctor(Arrays.copyOf(db.getHospitals()[i].getDoctor(), db.getHospitals()[i].getDoctor().length+1));
                    db.getHospitals()[i].getDoctor()[db.getHospitals()[i].getDoctor().length-1] = patient;
                }
            }
        }
    }

    @Override
    public void getAllPatient() {
        for (int i = 0; i < db.getHospitals().length; i++) {
            for (int j = 0; j < db.getHospitals()[i].getDoctor().length; j++) {
                for (Patient patient : db.getHospitals()[i].getDoctor()[j].getPatients()) {
                    System.out.println(patient);
                }
                System.out.println();
            }
        }
    }

    @Override
    public void updatePatientById(Long idPatient) {
        for (int i = 0; i < db.getHospitals().length; i++) {
            for (int j = 0; j < db.getHospitals()[i].getDoctor().length; j++) {
                for (int k = 0; k < db.getHospitals()[i].getDoctor()[j].getPatients().length; k++) {
                    if(Objects.equals(db.getHospitals()[i].getDoctor()[j].getPatients()[k].getId(), idPatient)){
                        System.out.print("Enter new name for Patient: ");
                        db.getHospitals()[i].getDoctor()[j].getPatients()[k].setName(new Scanner(System.in).nextLine());
                        System.out.println("Successful update doctor by id:)");
                        System.out.println(db.getHospitals()[i].getDoctor()[j]);
                    }
                }

            }
        }
    }

    @Override
    public void deletePatientById(Long idPatient) {
        for (int i = 0; i < db.getHospitals().length; i++) {
            for (int j = 0; j < db.getHospitals()[i].getDoctor().length; j++) {
                for (int k = 0; k < db.getHospitals()[i].getDoctor()[j].getPatients().length; k++) {
                    if (Objects.equals(db.getHospitals()[i].getDoctor()[j].getId(), idPatient)) {
                        for (int i1 = k; i1 < db.getHospitals()[i].getDoctor()[j].getPatients().length; i1++) {
                            Patient patient = db.getHospitals()[i].getDoctor()[j].getPatients()[i1 + 1];
                            db.getHospitals()[i].getDoctor()[j].getPatients()[i1 + 1] = db.getHospitals()[i].getDoctor()[j].getPatients()[i1];
                            db.getHospitals()[i].getDoctor()[j].getPatients()[i1] = patient;
                            System.out.println("Successful delete doctor by id:)");
                        }
                    }
                }
            }
        }
    }
}
