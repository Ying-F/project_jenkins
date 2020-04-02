package fr.isika.andre;

public class WhoIam {
	
	public static String whoAreYou(String name) {
		
		String reponse = "Vous ntes pas connu de nos services";
		
		if(name.equals("Camille")) {
			
			reponse = "je mappelle "+ name;
		}
		
		return reponse;
	}

}
