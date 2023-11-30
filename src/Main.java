import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       register[] users = new register[0];
       while(true) {
           System.out.println("1. register \n2. login");
           String n = new Scanner(System.in).nextLine();
           switch (n) {
               case "1" -> {
                   users = Arrays.copyOf(users, users.length + 1);
                   users[users.length - 1] = register.register();
               }
               case "2" -> {
                   if (register.login(users)) {
                       comands();
                   }
               }
               case "0" -> {
                   return;
               }
           }
       }

    }

    public static void comands(){
        HospitalService hs = new HospitalService();
        DoctorService ds = new DoctorService();
        PatientService ps = new PatientService();
        while(true) {
            System.out.println("""
                    0. New Hospital
                    1. Get hospital by name
                    2. get all hospitals
                    3. add doctor to hospital
                    4. get all doctors
                    5. update doctor bby id
                    6. delete doctors By id
                    7. add patient to doctor
                    8. get all patients
                    9. update patient by id 
                    10. delete patient by id
                    """);
            String choice = new Scanner(System.in).nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.print("Enter name Hospital: ");
                    hs.getHospitalByName(new Scanner(System.in).nextLine());
                }
                case "2" -> {
                    hs.getAllHospitals();
                }
                case "3" -> {
                    Doctor doctor = new Doctor();
                    System.out.print("Enter full name: ");
                    doctor.setName(new Scanner(System.in).nextLine());
                    doctor.setId(UniqueId.generated());
                    System.out.print("Gender: ");
                    doctor.setGender(new Scanner(System.in).nextLine());
                    System.out.print("Enter name hospital ");
                    ds.addDoctorToHospital(new Scanner(System.in).nextLine(), doctor);
                }
                case "4" -> {
                    ds.getAllDoctors();
                }
                case "5" -> {
                    System.out.print("Enter id for update Doctor name: ");
                    ds.updateDoctorById(new Scanner(System.in).nextLong());
                }
                case "6" -> {
                    System.out.print("Enter id for delete doctor!! ");
                    ds.deleteDoctorsById(new Scanner(System.in).nextLong());
                }
                case "7" -> {
                    Patient patient = new Patient();
                    System.out.print("Name Patient: ");
                    patient.setName(new Scanner(System.in).nextLine());
                    patient.setId(UniqueId.generated());
                    System.out.print("Enter gender patient: ");
                    patient.setGender(new Scanner(System.in).nextLine());
                    System.out.println("Enter id Doctor");
                    ps.addPatientToDoctor(new Scanner(System.in).nextLong(), patient);
                }
                case "8" -> {
                    ps.getAllPatient();
                }
                case "9" -> {
                    System.out.print("Enter id patient for update name patient: ");
                    ps.updatePatientById(new Scanner(System.in).nextLong());
                }
                case "10" -> {
                    System.out.print("Enter id patient for delete: ");
                    ps.deletePatientById(new Scanner(System.in).nextLong());
                }
                case "0" -> {
                    Hospital hospital = new Hospital();
                    System.out.print("Enter name Hospital: ");
                    hospital.setName(new Scanner(System.in).nextLine());
                    System.out.print("Enter address Hospital: ");
                    hospital.setAddress(new Scanner(System.in).nextLine());
                    hs.register(hospital);
                }
            }

        }
    }
}