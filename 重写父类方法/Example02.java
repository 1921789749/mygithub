class Animal
{
	void shout(){
	System.out.println("发出动物的叫声");

	}
}
class Dog
{
	void shout(){
	System.out.println("汪汪······");
	}
}
class Example02
{
	public static void main(String[] args){
	Dog dog=new Dog();
	dog.shout();
	}
}