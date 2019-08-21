public class Main{
	public static void main(String[] args){
		A a = new A();
	}
}

class A{
	int i = 10;
	{
		i = 12;
	}
	public A(){
		System.out.println(i);
		i = 11;
	}
	
}
