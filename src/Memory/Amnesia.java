
package Memory;

import ClinicalCases.ClinicalCase;

public class Amnesia extends MemoryDeficit {
    private String amnesia_type;
    private String cause;
    private String location;
    private static int totalAmnesia = 0;
    private ClinicalCase clin;


    public Amnesia(String deficit_id, String memory_loss, String amnesia_type, String cause, String location, String patient_id, String patient_name, String patient_surname, int age, String gender) {
        super(deficit_id, memory_loss);
        this.amnesia_type = amnesia_type;
        this.cause = cause;
        this.location = location;
        this.clin = new ClinicalCase(patient_id, patient_name, patient_surname, age, gender);
        totalAmnesia += 1;
    }

    @Override
    public String toString() {
        return super.toString()+
               clin.toString()+ 
               "\nAmnesia Type: " + amnesia_type + "\nCause: " + cause + "\nLocation: " + location + "\n";
    }
    
    /*public static String to2String(){
        return "---------------------\nDeficit ID: " + deficit_id + "\nMemory Loss: " + memory_loss+
               "\nPatient ID: " + clin.getPatient_id() + 
               "\nPatient Name: " + clin.getPatient_name() +
               "\nPatient Surname: " + clin.getPatient_surname() +
               "\nPatient Age: " + clin.getAge() +
               "\nPatient Gender: " + clin.getGender();
                
    }*/
    
    public static int getTotalAmnesia(){
        return totalAmnesia;
    }

    /*public void setAmnesia_type(String amnesia_type) {
        this.amnesia_type = amnesia_type;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ClinicalCase getClin() {
        return clin;
    }*/
    
   
}
