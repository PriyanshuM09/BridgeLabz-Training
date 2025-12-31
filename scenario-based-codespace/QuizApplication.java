// 17. Online Quiz Application 

import  java.util.Scanner;
public class QuizApplication{
public static void main(String args[]){ 

Scanner sc= new Scanner(System.in);

String[] ques= { " 1. the value of 2 + 3 options A 2, B 3, C 5, D 2 ", "2. the value of 5 * 6 options A 20, B 30, C 50, D 25 ",
                 "3. the value of 90 /10 options A 2, B 3, C 9, D 5 ",  "4. the value of 8 % 2  options A 0, B 1, C 5, D 10 ",
				  "5. the value of 99 - 88 options A 10, B 11, C 15, D 52 "};
				  
char correctAns[]={'C', 'B', 'C','A','B'};
int score=0;

        for(int i=0;i<ques.length;i++){
		System.out.println(ques[i]);
		System.out.print("Enter your answer (A/B/C/D): ");
        char answer = sc.next().toUpperCase().charAt(0);
		
		switch(answer){
		case 'A':
		case 'B':
		case 'C':
		case 'D':
		
		if(answer==correctAns[i]){
		score++;
		}
		break;
		
	default : 
	 System.out.println("Invalid option");
		}
		System.out.println();
}
        System.out.println("Quiz Completed!");
        System.out.println("Your Score: " + score + " out of " + ques.length);
  }
}