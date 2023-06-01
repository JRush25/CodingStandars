
public class VacationPackage {

private String touristSpot;
private int numberofTravelers;
private int duration;
private double baseCost = 1000;
private double totalCost = 0;

public VacationPackage() {
	}
	
public String getTouristSpot() {
		return touristSpot;
	}
public void setTouristSpot(String touristSpot) {
		this.touristSpot = touristSpot;
	}
public int getNumberofTravelers() {
		return numberofTravelers;
	}
public void setNumberofTravelers(int numberofTravelers) {
		this.numberofTravelers = numberofTravelers;
	}
public int getDuration() {
		return duration;
	}
public void setDuration(int duration) {
		this.duration = duration;
	}
public double getBaseCost() {
		return baseCost;
	}
public void setBaseCost(double baseCost) {
		this.baseCost = baseCost;
	}
public double getTotalCost() {
		if (totalCost == 0){
			return -1;
		}
		return totalCost;
	}
public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}

public double validateDestination(String destination) {
		double additionalCost = 0;
if(destination.toUpperCase().equals("Paris")) {
			additionalCost = 500+ this.baseCost;
		}
		else if(destination.toUpperCase().equals("New York City")) {
			additionalCost = 600+ this.baseCost;
		}
		return additionalCost + this.baseCost;	
	}

	public void validateTravelers(int travelers) {
		if (travelers > 80) {
System.out.println(
"The vacation package is not available for groups of more than 80 persons"
);
		}
	}
 
	public void estimateCost(double additionalCost, int travelers, int duration) {
		double discount = 0;
		double fee = 200;
		if ((travelers > 4) && (travelers  < 10)) {
			discount = additionalCost*0.10;
			this.totalCost = additionalCost - discount;	
		}
		if(travelers>10) {
			discount = additionalCost*0.10;
			this.totalCost = additionalCost - discount;	
		}
		if(duration<7) {
			this.totalCost = additionalCost + fee;
		}
		if(duration>30 || travelers == 2) {
			this.totalCost = additionalCost - fee;
		}
		else {
			this.totalCost = this.baseCost;
		}
	}
	

}
