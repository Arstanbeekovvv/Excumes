public interface DoctorMethods {
    void addDoctorToHospital(String nameHospital, Doctor doctor);
    void getAllDoctors();
    void updateDoctorById(Long idDoctor);
    void deleteDoctorsById(Long idDoctor);

}
