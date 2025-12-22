// Create a program to find the shortest, tallest, and mean height of players present in a football team.

import java.util.Random;

public class FootballTeamHeight{
 public static int findSum(int[] heights){
     int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public static double findMean(int[] heights){
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }
  public static int findShortest(int[] heights){
        int min = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < min) {
                min = heights[i];
            }
        }
        return min;
    }
  public static int findTallest(int[] heights){
        int max = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
     int[] heights = new int[11];
          Random random = new Random();
    for (int i = 0; i < heights.length; i++){
           heights[i] = random.nextInt(101) + 150; 
        }
     System.out.println("Heights of players:");
    for (int i = 0; i < heights.length; i++){
            System.out.print(heights[i] + " ");
        }
   System.out.println("\n\nShortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}
