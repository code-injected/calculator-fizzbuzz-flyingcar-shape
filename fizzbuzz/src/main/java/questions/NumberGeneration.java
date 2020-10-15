package questions;

public class NumberGeneration {
	
	public void generate(int current, int last){		
		if (current <= last){
			System.out.println(calculateResult(current));
			current++;
			generate(current, last);
		}
	}
	
	public String calculateResult(int number){
		boolean multipleThree = multiplyOf(number, 3);
		boolean multipleFive = multiplyOf(number, 5);
		String result;
		
		if (multipleThree && multipleFive){
			result = "FizzBuzz";
		}
		else if(multipleThree){
			result = "Fizz";
		}
		else if(multipleFive){
			result = "Buzz";
		}
		else{
			result = String.valueOf(number);
		}
		
		return result;
	}
	
	private boolean multiplyOf(int number, int multiple){
		return (number % multiple == 0?true:false);
	}
}
