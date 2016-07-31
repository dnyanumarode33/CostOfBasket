/*
 * Author : DD Marode :  cell no. 7276021922
 */

public class CostOfBasket {


	private String [] message;

	//Constructor
	//@param message to be printed
	public CostOfBasket(String [] message){
		System.out.println("inside "+ this.getClass());
		this.message = message;
	}

	// calculate and return the total cost of the basket
	public float calculateCostofBasket(){
		System.out.println("inside method calculateCostofBasket");

		float totalCost =0f;
		try {

			for ( String item : message ){

				String [] fruitDtls = item.split("\\|");

				if ( !(fruitDtls[0].equalsIgnoreCase("Bananas") || fruitDtls[0].equalsIgnoreCase("Oranges") ||
						fruitDtls[0].equalsIgnoreCase("Apples") || fruitDtls[0].equalsIgnoreCase("Lemons") ||
						fruitDtls[0].equalsIgnoreCase("Peaches")) ){

					System.out.println("One of the fruit name is not recognised, hence returning.");
					System.out.println("Expected fruit names are : Bananas, Oranges, Apples, Lemons, Peaches");
					System.out.println("Test case execution completed : failure case (Fruit name is not recognised)");

					return  0.0f;
				}
				totalCost += Long.valueOf(fruitDtls[1]) * Float.valueOf(fruitDtls[2]); 
			}

			totalCost = (float) (Math.round(totalCost*100.00)/100.00);
			System.out.println("Total cost of the basket is :: "+ totalCost);
			System.out.println("Test case execution completed.");

		}catch(Exception e){
			e.printStackTrace();
			System.out.println("Test case execution completed : == failure case (Exception occured)");
		}
		return totalCost;
	}   

}  