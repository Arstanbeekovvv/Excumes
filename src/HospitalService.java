public class HospitalService implements HospitalMethods{
    DataBase db = new DataBase();

    public HospitalService() {
    }

    public HospitalService (DataBase das){
        this.db = das;
    }
    @Override
    public void register(Hospital hospital) {
        db.setHospitals(hospital);
    }

    @Override
    public void login() {

    }

    @Override
    public void getHospitalByName(String nameHospital) {
        for (int i = 0; i < db.getHospitals().length; i++) {
            if(db.getHospitals()[i].getName().equalsIgnoreCase(nameHospital)){
                System.out.println(db.getHospitals()[i]);
                return;
            }
        }
    }

    @Override
    public void getAllHospitals() {
        for (Hospital hospitals : db.getHospitals()) {
            System.out.println(hospitals);
        }
    }
}
