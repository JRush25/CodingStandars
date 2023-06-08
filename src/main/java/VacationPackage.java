import java.util.Locale;

public class VacationPackage {

private String touristSpot;
private int numberofTravelers;
private int duration;
private double baseCost = 1000;
private double totalCost;
private int addOn;

public int getAddOn() {
	return addOn;
}

public void setAddOn(int addOn) {
	this.addOn = addOn;
}
/**
 *VacationPackage Constructor
 */	
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
/**
 *validateDestination Method
 */	
public double validateDestination(String destination) {
		double additionalCost = 0;
if(("Paris").equals(destination.toUpperCase(Locale.getDefault()))) {
			additionalCost = 500+ this.baseCost;
		}
		else if(("New York City").equals(destination.toUpperCase(Locale.getDefault()))) {
			additionalCost = 600+ this.baseCost;
		}
		return additionalCost + this.baseCost;	
	}
/**
 *validateTravelers Method
 */	
	public void validateTravelers(int travelers) {
		if (travelers > 80) {
System.out.println(
"The vacation package is not available for groups of more than 80 persons"
);
		}
	}
 
	/**
	 *estimateCost Method
	 */		
	public void estimateCost(double additionalCost, int travelers, int duration) {
		double discount;
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
	/**
	 *TotalPlusAddOn Method
	 */		
	public void TotalPlusAddOn(int addon, int travelers) {
		double addonCost = 0;
		switch (addon){
		case 1:
			addonCost = 200*travelers;
			break;
		case 2:
			addonCost = 150*travelers;
			break;
		case 3:
			addonCost = 100*travelers;
			break;
		case 4:
			addonCost = 0;
			break;
		default:
			addonCost = 0;
			break;
		}
		this.totalCost = this.totalCost+addonCost;
	}
	

}
