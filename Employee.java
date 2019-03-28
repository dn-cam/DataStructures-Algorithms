/**
 * 
 */
package example;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author camelliadebnath
 * 26-Mar-2019
 */
public class Employee {
	String name;
	Integer age;
	Integer salary;
	
	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	
	public static void main(String args[]) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee("Chandler", 29, 80));
		employees.add(new Employee("Joey", 32, 50));
		employees.add(new Employee("Ross", 31, 45));
		employees.add(new Employee("Monica", 28, 44));
		employees.add(new Employee("Rachel", 27, 70));
		employees.add(new Employee("Phoebe", 35, 40));
		employees.add(new Employee("Richard", 50, 90));
		
	    employees.forEach(n -> System.out.println(n.name));
	    
	    Comparator<Employee> comparator = new Comparator<Employee>() {
	    	public int compare(Employee a, Employee b) {
	    		return a.age - b.age;
	    	}
	    };
	    
	    System.out.println("\n\nIn order of age");
	    
	    Collections.sort(employees, comparator);
	    
	    employees.forEach(n -> System.out.println(n.name));
	    
	    System.out.println("\n\nIn order of salary");
	    
	    employees.stream()
	    .sorted((e1, e2) -> e1.salary.compareTo(e2.salary))
	    .forEach(x -> System.out.println(x.name));
	    
	    System.out.println("\n\nIn between the age of 30 and 35");
	    employees.stream()
	    .filter(x -> x.age > 30 && x.age < 35)
	    .forEach(n -> System.out.println(n.name));
	    
	    
	    
	    List<Employee> list = employees.stream()
	    		.sorted((a,b) -> a.age.compareTo(b.age))
	    		.collect(Collectors.toList());
	    
	    Employee e = employees.stream()
	    		.min((a, b) -> a.age.compareTo(b.age))
	    		.get();
	    
	    System.out.println("\nYoungest");
	    System.out.println(e.name);
	}
	
	
		

}










