package com.stackandqueue;
import java.util.LinkedList;
import java.util.Queue;

public class CircularTour {
	static class PetrolPump{
		int petrol;
		int distance;
		PetrolPump(int petrol,int distance){
			this.petrol=petrol;
			this.distance=distance;
		}
	}
	public static int findPoint(PetrolPump[] pump) {
		int n=pump.length;
		Queue<Integer> q=new LinkedList<>();
		int start=0;
		int currentPetrol=0;
		int i=0;
		while(q.size()<n) {
			currentPetrol+=pump[i].petrol-pump[i].distance;
			q.add(i);
		       while (currentPetrol<0 &&!q.isEmpty()){
	                int removed=q.poll();
	                currentPetrol-= (pump[removed].petrol - pump[removed].distance);
	                start = removed + 1;
	            }
	            i=(i+ 1) % n;
	            if (i == start && q.isEmpty()) {
	                return -1;
	            }
	        }

	        return start;
	    }

	    public static void main(String[] args) {
	        PetrolPump[] pumps = {
	            new PetrolPump(6, 4),
	            new PetrolPump(3, 6),
	            new PetrolPump(7, 3)
	        };

	        int start=findPoint(pumps);

	        if (start==-1)
	            System.out.println("No possible circular tour");
	        else
	            System.out.println("Start tour at petrol pump index: " + start);
	    }
	
		}
	



