package beerProj;

public class BeerExpert {
	public String getBeer(String colorInput){
		if(colorInput.equals("tuborg")){
			return "TUBORG";
		}
		if(colorInput.equals("kingfisher")){
			return "KINGFISHER";
		}
		return "Something Went Wrong";
	}
}
