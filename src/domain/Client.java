package domain;

public class Client {

	private long ID_CLIENT;
	private String NOM_CLIENT;
	private String PRENOM_CLIENT;
	private String EMAIL_CLIENT;
	private String ADRESSE_CLIENT;
	public long getID_CLIENT() {
		return ID_CLIENT;
	}
	public void setID_CLIENT(long iD_CLIENT) {
		ID_CLIENT = iD_CLIENT;
	}
	public String getNOM_CLIENT() {
		return NOM_CLIENT;
	}
	public void setNOM_CLIENT(String nOM_CLIENT) {
		NOM_CLIENT = nOM_CLIENT;
	}
	public String getPRENOM_CLIENT() {
		return PRENOM_CLIENT;
	}
	public void setPRENOM_CLIENT(String pRENOM_CLIENT) {
		PRENOM_CLIENT = pRENOM_CLIENT;
	}
	public String getEMAIL_CLIENT() {
		return EMAIL_CLIENT;
	}
	public void setEMAIL_CLIENT(String eMAIL_CLIENT) {
		EMAIL_CLIENT = eMAIL_CLIENT;
	}
	public String getADRESSE_CLIENT() {
		return ADRESSE_CLIENT;
	}
	public void setADRESSE_CLIENT(String aDRESSE_CLIENT) {
		ADRESSE_CLIENT = aDRESSE_CLIENT;
	}
	
	
	
}
