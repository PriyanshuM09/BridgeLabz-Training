// 16. Digital Watch Simulation 


public class WatchSimulation{
public static void main(String args[]){
int hours=24;
int minuites=60;

for(int i=0;i<hours;i++){
  if(i ==13){ break; }
  for(int j=0;j<minuites;j++){
     System.out.println("H : M "+ i +" : "+j);
  }
}
 }
}