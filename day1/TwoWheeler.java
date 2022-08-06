package week1.day1;

public class TwoWheeler 
{
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 75137835889L;
	boolean isPunctured = false;
	String bikeName = "Yamaha";
	double runningKM = 56089.2;
	public static void main(String[] args) 
	{
		TwoWheeler tw = new TwoWheeler();
		System.out.println("No. of wheels = " +tw.noOfWheels);
		System.out.println("No. of Mirrors = " +tw.noOfMirrors);
		System.out.println("Chassis no. of vehicle = " +tw.chassisNumber);
		System.out.println("Is the bike punctured" +tw.isPunctured);
		System.out.println("Bike name is = " +tw.bikeName);
		System.out.println("Totla KM driven is = " +tw.runningKM);
	}
}
