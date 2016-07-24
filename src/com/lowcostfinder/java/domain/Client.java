package com.lowcostfinder.java.domain;

public class Client {

	private static long ID_CLIENT;
	private static String NOM_CLIENT;
	private static String PRENOM_CLIENT;
	private static String EMAIL_CLIENT;
	private static String ADRESSE_CLIENT;
	public static long getID_CLIENT() {
		return ID_CLIENT;
	}
	public static void setID_CLIENT(long iD_CLIENT) {
		ID_CLIENT = iD_CLIENT;
	}
	public static String getNOM_CLIENT() {
		return NOM_CLIENT;
	}
	public static void setNOM_CLIENT(String nOM_CLIENT) {
		NOM_CLIENT = nOM_CLIENT;
	}
	public static String getPRENOM_CLIENT() {
		return PRENOM_CLIENT;
	}
	public static void setPRENOM_CLIENT(String pRENOM_CLIENT) {
		PRENOM_CLIENT = pRENOM_CLIENT;
	}
	public static String getEMAIL_CLIENT() {
		return EMAIL_CLIENT;
	}
	public static void setEMAIL_CLIENT(String eMAIL_CLIENT) {
		EMAIL_CLIENT = eMAIL_CLIENT;
	}
	public static String getADRESSE_CLIENT() {
		return ADRESSE_CLIENT;
	}
	public static void setADRESSE_CLIENT(String aDRESSE_CLIENT) {
		ADRESSE_CLIENT = aDRESSE_CLIENT;
	}
	
	
	
}
