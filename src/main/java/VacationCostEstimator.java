import java.util.Scanner;

public class VacationCostEstimator {

//CHECKSTYLE:OFF
public static void main(String[] args) {
VacationPackage package1 = new VacationPackage();
Scanner sc = new Scanner(System.in);
System.out.println("*****Vacation Package Cost Estimator*****");
System.out.println("Enter your destination:");
package1.setTouristSpot(sc.nextLine());
System.out.println("Enter the number of travelers:");
package1.setNumberofTravelers(sc.nextInt());
System.out.println("Enter the duration in days:");
package1.setDuration(sc.nextInt());
if (package1.getNumberofTravelers() > 80) {
System.out.println(
"The vacation package is not available for groups of more than 80 persons"
);
		} else {
double additionalCost = package1.validateDestination(package1.getTouristSpot());
package1.estimateCost(additionalCost, package1.getNumberofTravelers(), package1.getDuration());
System.out.println("The total cost of the vacation package is " + package1.getTotalCost());
		}

	}
//CHECKSTYLE:ON
}
