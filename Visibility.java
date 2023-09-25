package Method_Overriding;

class Low_Visibility
{
	 void wishes()
	{
		System.out.println("good morning");
	}
}


public class Visibility extends  Low_Visibility  {
	@Override
	public void wishes()
	{
		System.out.println("good night");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method_Overriding mo=new Method_Overriding();
		mo.wishes();
	}

}