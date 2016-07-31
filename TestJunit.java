import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {

	/*
	 * Author : DD Marode :  cell no. 7276021922
	 */


	/* Note: In this testunit we are passing input fruits to the basket with number of 
	 * fruits and price per unit as an each element of an input array (| separated values)
	 * "Bananas|5|4", in this 5 is the number of bananas and 4 is Price of a Banana. 
	 * I have written total of 5 test cases, in which 1st, 2nd and 3rd are success scenarios
	 * while 4th 5th are failure cases.
	 **/



	// | separated values for a fruit as :  "Fruit name| No. of items | price per unit"

	// test case 1 input == success	
	String [] basketInput_1 = {"Bananas|5|4" , "Oranges|10|10" , "Apples|2|5"};
	float cost_1 =130.00f;

	// test case 2 input == success
	String [] basketInput_2 = {"Bananas|4|5.5" , "Oranges|1|10" , "Apples|2|5.0", "Lemons|4|2.5" , "Peaches|3|3.5"};
	float cost_2 =62.50f;


	//test case 3 input == success
	String [] basketInput_3 = {"Bananas|0|4.50" , "Oranges|10|10" , "Apples|0|5"};
	float cost_3 =100.00f;


	//test case 4 input == failure
	// reason for failure : No of bananas are inputed as 5.23, which is not allowed.
	// exception will occurred and it is handled.
	String [] basketInput_4 = {"Bananas|5.23|4" , "Oranges|10|10" , "Apples|2|5"};
	float cost_4 =130.92f;


	//test case 5 input == failure
	// reason for failure : Grapes are inputed : which are not allowed as they were not mentioned in problem statement
	String [] basketInput_5 = {"Bananas|5|4" , "Grapes|0|10" , "Apples|2|5"};
	float cost_5 =10.00f;




	//execute test case 1
	@Test
	public void testCase1() {
		CostOfBasket costOfBasket = new CostOfBasket(basketInput_1);
		assertEquals(cost_1,costOfBasket.calculateCostofBasket(), 0.0f);

	}

	//execute test case 2
	@Test
	public void testCase2() {
		CostOfBasket costOfBasket = new CostOfBasket(basketInput_2);
		assertEquals(cost_2,costOfBasket.calculateCostofBasket(), 0.0f);

	}


	//execute test case 3
	@Test
	public void testCase3() {
		CostOfBasket costOfBasket = new CostOfBasket(basketInput_3);
		assertEquals(cost_3,costOfBasket.calculateCostofBasket(), 0.0f);

	}

	//execute test case 4
	@Test
	public void testCase4() {
		CostOfBasket costOfBasket = new CostOfBasket(basketInput_4);
		assertEquals(cost_4,costOfBasket.calculateCostofBasket(), 0.0f);

	}

	//execute test case 5
	@Test
	public void testCase5() {
		CostOfBasket costOfBasket = new CostOfBasket(basketInput_5);
		assertEquals(cost_5,costOfBasket.calculateCostofBasket(), 0.0f);

	}

	//ends   
}