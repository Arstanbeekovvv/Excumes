public interface PatientMethods {
    void addPatientToDoctor(Long id, Patient patient);
    void getAllPatient();
    void updatePatientById(Long idPatient);
    void deletePatientById(Long idPatient);

}
