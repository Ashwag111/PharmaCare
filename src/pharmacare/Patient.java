/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacare;

/**
 *
 * @author kmoag
 */
public class Patient extends User{

    // --------------- Attribute -----------
    private String medicalHistory;
    private String chronicDisease;

    // --------------- Getter and Setter -----------

    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getChronicDisease() {
        return chronicDisease;
    }

    public void setChronicDisease(String chronicDisease) {
        this.chronicDisease = chronicDisease;
    }

    // --------------- Operation -----------

    public void orderAMedicine(){

    }

    public Double pay(){
        return 0D;
    }

    public Boolean takeMedicine(){
        return true;
    }
}

