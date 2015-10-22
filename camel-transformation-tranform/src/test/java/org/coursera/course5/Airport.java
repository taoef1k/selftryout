package org.coursera.course5;

public class Airport {
	private String city;
	private String country;
	private String code3;
	
	private static Airport[] airports= new Airport[]{
		new Airport("Mountreal", "Canada", "YMX"),
		new Airport("Lagos", "Nigeria", "LOS"),
		new Airport("Essen", "Germany", "ESS"),
		new Airport("Chicago", "USA", "ORD"),
		new Airport("Beijing", "China", "PEK"),
		new Airport("Sydney", "Australia", "SYD"),
		new Airport("Quito", "Ecuador", "UIO"),
		new Airport("Agra", "India", "AGR")
	};
	
	public Airport() { }
	
	public Airport(String city, String country, String code3) { 
		this.city= city;
		this.country= country;
		this.code3= code3;
	}
	
	public static void main(String args[]) {
		String toFind= "Beijing";
		String airportCode= findAirportCode(toFind, airports);
		System.out.println("airportCode for " + toFind + " = " + airportCode);
	}
	
	public static String findAirportCode(String toFind, Airport[] airports) {
		int idx= 0;
		while(idx < airports.length) {
			if(airports[idx].getCity().equals(toFind)) {
				return airports[idx].getCode3();
			}
			idx++;
		}
		return new String();
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCode3() {
		return code3;
	}
	public void setCode3(String code3) {
		this.code3 = code3;
	}
	
	
}
