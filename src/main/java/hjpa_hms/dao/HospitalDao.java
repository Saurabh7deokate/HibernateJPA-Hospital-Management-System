package hjpa_hms.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hjpa_hms.dto.Hospital;
import hjpa_hms.dto.Patient;

public class HospitalDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("Saurabh").createEntityManager();
	}
	
	public void addHospital(Hospital hospital, List<Patient> patients) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(hospital);
		for(Patient patient : patients) entityManager.persist(patient);
		entityTransaction.commit();
	}

	public void fetchHospital(Hospital hospital, List<Patient> patients) {
		EntityManager entityManager = getEntityManager();
		//System.out.println(entityManager.find(Hospital.class, 1));
		System.out.println(entityManager.find(Patient.class, 1));
		
	}

}
