package week1.day2;

public class TwoWheeler {
	
	int noOfWheels=4;
	short noOfMirrors=2;
	long chassisNumber=37458694;
    boolean isPunctured ;
    String bikeName ;
    double runningKm=1000.45;
    
    public static void main(String args[])
    {
    	TwoWheeler vehicle = new TwoWheeler();
    	int wheels =vehicle.noOfWheels;
    	System.out.println(wheels);
    	short mirror=vehicle.noOfMirrors;
    	System.out.println(mirror);
    	long chassNum=vehicle.chassisNumber;
    	System.out.println(chassNum);
    	boolean isPunctured=vehicle.isPunctured;
    	System.out.println(isPunctured);
    	String bikeName=vehicle.bikeName;
    	bikeName = "Pulsar 250";
    	System.out.println(bikeName);
    	double runningKm=vehicle.runningKm;
    	System.out.println(runningKm);
    	
    	
    	
   
    	
    	
    }
	

}
