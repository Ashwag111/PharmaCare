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
import java.util.List;
public class MakeOrder {
    // --------------- Attribute -----------
    private Integer order;
    private List<Medicine> medicineCollections;
    private Integer patientId;

    // --------------- Getter and Setter -----------

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public List<Medicine> getMedicineCollections() {
        return medicineCollections;
    }

    public void setMedicineCollections(List<Medicine> medicineCollections) {
        this.medicineCollections = medicineCollections;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }


    // --------------- Operation -----------
    public Double caculatePrice(){
        return 0D;
    }

}

