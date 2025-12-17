class PenDistribution{
public static void main (String args[]){

int pen=14;
int students=3;

int distributedPens =pen/students;
int nonDistributedPens= pen%students;

System.out.println("The Pen Per Student is "+distributedPens+" and the remaining pen not distributed is"+nonDistributedPens);

}
}