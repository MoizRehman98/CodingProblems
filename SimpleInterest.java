package CodingProblems;


class Solution {
	 double simpleInterest = 0;
	 double principle = 1000;
	 float rate = 2.5f;
	 int time = 10;
	
	
	
	void calculation() {
		simpleInterest = (principle * time * rate)/100;
		System.out.println("The simple interest is $" + simpleInterest );
	}
	
	void totalAmount() {
		System.out.println("The total amount after the loan period ends is $" + (principle + simpleInterest));
	}
	
}

public class SimpleInterest {

	public static void main(String[] args) {
		Solution s = new Solution();
		
		s.calculation();
		s.totalAmount();
		
		

	}

}
