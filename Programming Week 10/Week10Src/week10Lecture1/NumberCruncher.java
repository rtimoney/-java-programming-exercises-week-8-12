/**
 * 
 */
package week10Lecture1;

/**
 * @author Ronan J Timoney
 *
 */
public class NumberCruncher {
    /**
     * Method adds two numbers and returns the result
     * 
     * @param num1
     * @param num2
     * @return
     */
    public int addNumbers(int num1, int num2) {
        return num1 + num2;
    }
    /**
     * Method adds three numbers and returns the result
     * 
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public int addNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
    /**
     * Method multiplies two numbers and returns the result
     * 
     * @param num1
     * @param num2
     * @return
     */
    public int multiplyNumbers(int num1, int num2) {
        return num1*num2;
    }
    /**
     * Method multiplies three numbers and returns the result
     * 
     * @param num1
     * @param num2
     * @param num3
     * @return
     */
    public int multiplyNumbers(int num1, int num2, int num3) {
        return num1*num2*num3;
    }
    
    /**
     * Divides first number by the second
     * @param num1
     * @param num2 - should not be 0
     * @return
     * @throws Exception
     */
    public int divideNumbers(int num1, int num2) throws Exception{
    	if(num2==0) {
    		throw new Exception();
    	} else {
    		return num1/num2;
    	}
    }
}
