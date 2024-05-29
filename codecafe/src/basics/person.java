package basics;

import java.util.Scanner;

public class person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob= new Scanner (System.in);
		String name;
		System.out.println("Enter Person Name:");
		name = ob.next();
		System.out.println("Enter age:");
		int age = ob.nextInt();
		String gender;
		System.out.println("Enter the gender");
		gender = ob.next();
		System.out.println("Enter taxable income:");
		int income = ob.nextInt();
		persondemo person = new persondemo();
		person.setName(name);
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		System.out.println(person);
		Taxcalculation calc = new Taxcalculation();
		calc.calculateTax(person);
		System.out.println("After calculating tax:");
		System.out.println(person);
		ob.close();
		
		
		
		

	}

}