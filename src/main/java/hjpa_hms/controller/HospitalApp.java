package hjpa_hms.controller;

import java.util.ArrayList;
import java.util.List;
import hjpa_hms.dao.HospitalDao;
import hjpa_hms.dto.Branch;
import hjpa_hms.dto.Disease;
import hjpa_hms.dto.Hospital;
import hjpa_hms.dto.MedicalRecord;
import hjpa_hms.dto.Patient;

public class HospitalApp {

	public static void main(String[] args) {

		Hospital hospital = new Hospital();
		hospital.sethName("Upasana");
		hospital.sethCeo("Karan");

		Branch branch1 = new Branch();
		branch1.setbName("Upasana Pune");
		branch1.setbManager("Vikas");

		Branch branch2 = new Branch();
		branch2.setbName("Upasana Mumbai");
		branch2.setbManager("Ajay");

		Branch branch3 = new Branch();
		branch3.setbName("Upasana Solapur");
		branch3.setbManager("Smriti");

		List<Branch> branches = new ArrayList<>();
		branches.add(branch1);
		branches.add(branch2);
		branches.add(branch3);

		Patient patient1 = new Patient();
		patient1.setpName("Gauri");
		patient1.setpAge(20);
		patient1.setpGender("Female");
		patient1.setpWeight(50);

		Patient patient2 = new Patient();
		patient2.setpName("Dhananjay");
		patient2.setpAge(45);
		patient2.setpGender("Male");
		patient2.setpWeight(78);

		Patient patient3 = new Patient();
		patient3.setpName("Sachin");
		patient3.setpAge(35);
		patient3.setpGender("Male");
		patient3.setpWeight(100);

		List<Patient> patients = new ArrayList<>();
		patients.add(patient1);
		patients.add(patient2);
		patients.add(patient3);

		MedicalRecord medicalRecord1 = new MedicalRecord();
		medicalRecord1.setDiseaseName("High Blood Pressure");
		medicalRecord1.setDate("30 March 2021");

		MedicalRecord medicalRecord2 = new MedicalRecord();
		medicalRecord2.setDiseaseName("Asthma");
		medicalRecord2.setDate("20 April 2022");

		MedicalRecord medicalRecord3 = new MedicalRecord();
		medicalRecord3.setDiseaseName("High Colestrol");
		medicalRecord3.setDate("03 Decenmber 2019");

		List<MedicalRecord> medicalRecords = new ArrayList<>();
		medicalRecords.add(medicalRecord1);
		medicalRecords.add(medicalRecord2);
		medicalRecords.add(medicalRecord3);

		Disease disease1 = new Disease();
		disease1.setdName("High Blood Pressure");
		disease1.setPrimarySymptom("Fever");

		Disease disease2 = new Disease();
		disease2.setdName("Asthma");
		disease2.setPrimarySymptom("chills and fever");

		Disease disease3 = new Disease();
		disease3.setdName("High Colestrol");
		disease3.setPrimarySymptom("Muscle-ache");

		List<Disease> diseases = new ArrayList<>();
		diseases.add(disease1);
		diseases.add(disease2);
		diseases.add(disease3);

		hospital.setBranches(branches);

		int branchNum = 0;
		for (Branch branch : branches) {
			branch.setHospital(hospital);
			branch.setPatients(patients.subList(branchNum++, branchNum));
		}

		int diseaseNum = 0;
		int mrNum = 0;
		for (Patient patient : patients) {
			patient.setDiseases(diseases.subList(diseaseNum++, diseaseNum));
			patient.setMedicalRecords(medicalRecords.subList(mrNum++, mrNum));
		}

		medicalRecord1.setPatient(patient1);
		medicalRecord2.setPatient(patient2);
		medicalRecord3.setPatient(patient3);

		HospitalDao hospitalDao = new HospitalDao();
		//hospitalDao.addHospital(hospital, patients);
		hospitalDao.fetchHospital(hospital,patients);

		System.out.println("Success");
	}
}
