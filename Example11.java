interface Animal
{
	int ID=1;
	void breathe();
	void run();
}
class Dog implements Animal
{
	public void breathe(){
	System.out.println("���к���");

	}
	public void run(){
	System.out.println("������");
	}

}
class Example11
{
	public static void main(String[] args){
	Dog dog=new Dog();
	dog.run();
	dog.breathe();
	}
}