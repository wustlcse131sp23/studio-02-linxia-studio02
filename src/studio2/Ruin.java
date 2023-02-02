package studio2;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startAmount = 2;
		double winChance = 0.7;
		int winLimit = 10;
		int totalSimulations = 500;
		
		int amount;
		int countInDay;
		int countRuin = 0;
		
		for (int i = 0; i < totalSimulations; i++)
		{
			amount = startAmount;
			countInDay = 0;
			while (amount > 0 && amount < winLimit)
			{
				boolean result = Math.random() < winChance;
				if (result)
					amount++;
				else
					amount--;
				countInDay++;
			}
			if (amount == 0)
			{
				countRuin++;
				System.out.println("Simulation " + (i + 1) + ": " + countInDay + " LOSE");
			}
			else
			{
				System.out.println("Simulation " + (i + 1) + ": " + countInDay + " WIN");
			}
				
		}
		double ruinRateFromSimulation = countRuin*1.0/totalSimulations;
		System.out.println("Ruin Rate from Simulation:" + ruinRateFromSimulation);
		
		double expectedRuin;
		if (winChance == 0.5)
		{
			expectedRuin = 1 - startAmount*1.0/winLimit;
		}
		else
		{
			double a = (1 - winChance)/winChance;
			expectedRuin = (Math.pow(a,startAmount) - Math.pow(a,winLimit))/
					(1 - Math.pow(a,winLimit));
		}
		System.out.println("Expected Ruin Rate:" + expectedRuin);
			

	}

}
