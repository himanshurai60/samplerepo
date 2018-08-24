

public class Person {
public int age;
public String name;

public Person()
{
	age=10;
	name="raju";
}
public Person(int age, String name)
{
	this.age=age;
	this.name=name;
}
@Override
public String toString() {
	return "Person [age=" + age + ", name=" + name + "]";
}}