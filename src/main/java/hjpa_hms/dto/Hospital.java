package hjpa_hms.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hospital {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int hId;
	private String hName;
	private String hCeo;
	
	@OneToMany(mappedBy = "hospital",cascade = CascadeType.ALL)
	List<Branch> branches;

	public int gethId() {
		return hId;
	}

	public void sethId(int hId) {
		this.hId = hId;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String gethCeo() {
		return hCeo;
	}

	public void sethCeo(String hCeo) {
		this.hCeo = hCeo;
	}

	public List<Branch> getBranches() {
		return branches;
	}

	public void setBranches(List<Branch> branches) {
		this.branches = branches;
	}

	@Override
	public String toString() {
		return "Hospital [hId=" + hId + ", hName=" + hName + ", hCeo=" + hCeo + ", branches=" + branches + "]";
	}

	
}
