package in.tka.encapsulation;

public class PersonTest {

	public static void main(String[] args) {
		//create an objectof person
		Person p1=new Person();
		
		//change age using setter
		p1.setAge(24);
		
		//acess age using getter
		System.out.println(p1.getAge());
		
	}
}
