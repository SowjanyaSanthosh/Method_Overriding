package Method_Overriding;
class Method_Overriding1
{
	public void wishes()
	{
		System.out.println("good morning");
	}
}


public class Method_Overriding extends  Method_Overriding1  {
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
