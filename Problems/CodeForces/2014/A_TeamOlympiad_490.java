// Problem: A. Team Olympiad - Codeforces Round 279
// Author: Michael Feliciano

// Goal: Given an array of at most 5000 consisting of only the values {1,2,3} determine
// how many 3 element combinations can be formed such that each combination contains each
// distinct digit once. Also output indexes of each combination that can be made on 
// separate lines.  

// Approach: Basically I create 3 arrays, one for each specialization, then I iterate through
// the input array which is at most 5000 elements. It should be noted that since we are creating
// 3 man teams even if the 3 specializations were equally represented a maximum of 1666 complete
// team would be possible so we use this as the size of our arrays. I proceed by iterating through
// the input array and putting the index of the current student in the array of the proper
// specialization. During this process I also keep my Idx (index variables) so I not only 
// know where to put the next element in each of my 3 arrays but also the min of these 3 tells
// me the maximum number of teams which can be formed. Once I finish populating my 3 arrays I 
// am able to loop min(cdIdx,min(mathIdx,peIdx)) times and on each line print the indexes stored
// in each array. 

// Difficulty: Easy
// Tags: Implementation
// Problem Link: http://codeforces.com/contest/490/problem/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class A_TeamOlympiad_490{

	public static void main(String [] args) throws IOException{
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);

		int N  = Integer.parseInt(in.readLine());
		String [] students = in.readLine().split(" ");

		// Note that max of 5000 students could only allow max of 1666 teams of 3
		int [] cs = new int[1666];
		int [] math = new int[1666];
		int [] pe = new int[1666];

		int csIdx = 0;
		int mathIdx = 0;
		int peIdx = 0;

		// Place students in proper categories and keep track of indicies
		for(int i = 0; i < N; i++){
			
			if(students[i].equals("1") && csIdx < 1666){
				cs[csIdx] = i+1;
				csIdx++;

			}else if(students[i].equals("2") && mathIdx < 1666){
				math[mathIdx] = i+1;
				mathIdx++;

			}else if(students[i].equals("3") && peIdx < 1666){
				pe[peIdx] = i+1;
				peIdx++;
			}
		}

		int maxTeamCount = Math.min(csIdx,Math.min(mathIdx,peIdx));

		out.println(maxTeamCount);

		for(int j = 0; j  < maxTeamCount; j++){
			out.printf("%d %d %d\n",cs[j],math[j],pe[j]);
		}


		in.close();
		out.close();	
	}
}
