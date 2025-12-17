public class VolumeOfEarth{
public static void main(String args[]){

double radius=6378;

double volumeOfEarth= (4.0/3.0) * 3.14*radius*radius*radius;

double volumeInMiles=volumeOfEarth * 0.23;

System.out.println("The volume of earth in cubic kilometers is "+volumeOfEarth+" and cubic miles is "+volumeInMiles);
}
}