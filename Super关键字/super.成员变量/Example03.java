class Animal
{
	String name="½�ض���";
	void shout(){
	System.out.println("this is a animal!");
	}

}
class Dog extends Animal
{
	String name="dog";
	void shout(){
	super.shout();
	}
	void printName(){
	System.out.println("super name = "+super.name);
	System.out.println("this name = "+this.name);
	}
}
class Example03
{
	public static void main(String[] args)
	{
	Dog dog=new Dog();
	dog.shout();
	dog.printName();
	
	}

}