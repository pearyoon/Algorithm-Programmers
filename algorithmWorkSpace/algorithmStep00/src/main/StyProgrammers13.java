package main;

public class StyProgrammers13 {

		public static void main(String[] args) {
			
			String my_string = "jaron";
			
			String[] arr = my_string.split("");
			String answer = "";
			for(int i = arr.length-1; i >= 0; i--) {
				answer += arr[i];
			}
			
			System.out.println(answer);
			
	}
}
