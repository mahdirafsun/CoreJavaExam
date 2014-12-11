package random.number;

public class RandomNumberManipulation {

	/**
	 * Please solve the following problem in java code.
	 */
	public static void main(String[] args) {
	  /*
	   * Declare an array to store 50 random numbers range from 1 to 500. Then find the 
	   * even numbers only to print to the console.
	   * Hints: use Random() class.
	   * 
	   */
		
		int size = 50;
      int[] array = new int[size];
      for(int i = 0; i<size; i++){
    	  final int randomNum = (int) (Math.random() * 100);
    	  if(randomNum%2 == 0){
    	  array[i] = randomNum;
    	  }
      }
      
      for(int i = 0; i< size; i++){
    	  System.out.println(array[i]);
      }
	}

}
