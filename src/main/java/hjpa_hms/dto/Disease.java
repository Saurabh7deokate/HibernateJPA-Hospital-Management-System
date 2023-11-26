package hjpa_hms.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disease {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dId;
	private String dName;
	private String primarySymptom;

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getPrimarySymptom() {
		return primarySymptom;
	}

	public void setPrimarySymptom(String primarySymptom) {
		this.primarySymptom = primarySymptom;
	}

	@Override
	public String toString() {
		return "Disease [dId=" + dId + ", dName=" + dName + ", primarySymptom=" + primarySymptom + "]";
	}

}
