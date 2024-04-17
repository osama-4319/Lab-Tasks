import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

						//********* Student Class *********\\
class Student{
	String name;
	int age;
	
	//Constructor
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//Display Method
	public void display() {
		System.out.println("Name= " + name);
		System.out.println("Age= " + age);
	}
	
}
						//********* Main Class *********\\
public class Main {
	public static void main(String[] args) {
						//****** Task 1 ******\\
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<String> str = new ArrayList<>();
		ArrayList<Student> student = new ArrayList<>();
		
						//****** Task 2.1 ******\\
		//Adding Elements to Integer ArrayList
		arr.add(30);
		arr.add(20);
		arr.add(10);
		//Adding Elements to Integer ArrayList
		str.add("Apple");
		str.add("Banana");
		str.add("Orange");
		//Adding Elements to Integer ArrayList
		student.add(new Student("Osama Malik", 24));
		
						//****** Task 3 ******\\
		//Displaying Elements of Integer ArrayList
		// Get the iterator
	    Iterator<Integer> iter1 = arr.iterator();

	    // Print the items
	    while(iter1.hasNext()) {
	    	  System.out.println(iter1.next());
	    	}
		//Displaying Elements of String ArrayList
	    Iterator<String> iter2 = str.iterator();

	    // Print the items
	    while(iter2.hasNext()) {
	    	  System.out.println(iter2.next());
	    	}
		//Displaying Elements of Student ArrayList
	    Iterator<Student> iter3 = student.iterator();

	    // Print the items
	    while(iter3.hasNext()) {
	    	  iter3.next().display();
	    	}
	    				//****** Task 2.2 ******\\
	    //Removing Banana Element From String Arraylist
	    System.out.println("\n Before Removing Banana");
	    for(String item : str) {
	    	System.out.println(item);
	    	}
	    str.remove(1);
	    System.out.println("\n After Removing Banana");
	    for(String item : str) {
	    	System.out.println(item);
	    	}
	    
	  //Removing Index 1 of Arraylist
	    System.out.println("\n Before Removing Index");
	    for(Integer item : arr) {
	    	System.out.println(item);
	    	}
	    arr.remove(0);
	    System.out.println("\n After Removing Index");
	    for(Integer item : arr) {
	    	System.out.println(item);
	    	}
	    				//****** Task 4 ******\\
	    System.out.println(str.indexOf("Orange"));
	    
	    //Sorting Element of Integer
	    System.out.println("\n Before Sorting");
	    for(Integer item : arr) {
	    	System.out.println(item);
	    	}
	    Collections.sort(arr);
	    System.out.println("\n After Sorting");
	    for(Integer item : arr) {
	    	System.out.println(item);
	    	}
	    
	    				//****** Task 5 ******\\
	    //size method
	    System.out.println("Integer ArrayList Size = " + arr.size());
	    System.out.println("Student ArrayList Size = " + student.size());
	    //isEmpty method
	    System.out.println("Check wether Integer ArrayList is Empty= " + arr.isEmpty()); 
	    //contains method
	    System.out.println("Check Apple in the String ArrayList = " + str.contains("Apple"));
	    //clear method
	    student.clear();
	    System.out.println("Student ArrayList Size After Clear Method = " + student.size());
	    
	    				//****** Task 6 ******\\
	  //Exception handling for of String null values
	    try {
	    	str.add(null);
	    }
	    catch(NullPointerException e){
	    	System.out.println("Catched Null Pointrer");
	    }
	    
	    //Exception handling for of Integer
	    System.out.println("\nBefore Exception Handling");
	    System.out.println(arr.get(1));
	   
	    System.out.println("After Exception Handling");
	    try {
	    	System.out.println(arr.get(2));
        }
        catch (IndexOutOfBoundsException  e) {
            System.out.println("No Index Found");
        }
	}

}
