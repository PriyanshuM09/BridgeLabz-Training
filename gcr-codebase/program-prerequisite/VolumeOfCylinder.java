import java.util.*;
class VolumeOfCylinder{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int radius =sc.nextInt();
int height=sc.nextInt();
int volume= 22/7 * radius*radius * height;
System.out.println(volume);
}
} 