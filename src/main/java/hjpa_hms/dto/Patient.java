package hjpa_hms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pId;
	private String pName;
	private int pAge;
	private String pGender;
	private double pWeight;
	
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL)
	private List<MedicalRecord> medicalRecords;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Disease> diseases;
	
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getpAge() {
		return pAge;
	}

	public void setpAge(int pAge) {
		this.pAge = pAge;
	}

	public String getpGender() {
		return pGender;
	}

	public void setpGender(String pGender) {
		this.pGender = pGender;
	}

	public double getpWeight() {
		return pWeight;
	}

	public void setpWeight(double pWeight) {
		this.pWeight = pWeight;
	}

	public List<MedicalRecord> getMedicalRecords() {
		return medicalRecords;
	}

	public void setMedicalRecords(List<MedicalRecord> medicalRecords) {
		this.medicalRecords = medicalRecords;
	}

	public List<Disease> getDiseases() {
		return diseases;
	}

	public void setDiseases(List<Disease> diseases) {
		this.diseases = diseases;
	}

	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", pName=" + pName + ", pAge=" + pAge + ", pGender=" + pGender + ", pWeight="
				+ pWeight + ", medicalRecords=" + medicalRecords + ", diseases=" + diseases
				+ "]";
	}
}
