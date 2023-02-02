package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		int inCircle = 0;
		int totalPoint = 1000;
		
		for (int i = 0; i < totalPoint; i++)
		{
			a = Math.random()*2 - 1;
			b = Math.random()*2 - 1;
			double distance = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
			if (distance <= 1)
			{
				inCircle++;
			}
		}
		double pi = 4 * inCircle*1.0/totalPoint;
		System.out.println(pi);

	}

}
