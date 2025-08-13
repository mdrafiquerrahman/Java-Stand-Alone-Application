package nit.collections_framework;

import java.util.ArrayList;
import java.util.Collections;

public class TestProduct {

	public static void main(String[] args) 
	{
		ArrayList<Product> list= new ArrayList<Product>();
		list.add(new Product(101,"Mobile",67000D));
		list.add(new Product(102,"Camera",58000D));
		list.add(new Product(103,"Laptop",90000D));
		list.add(new Product(104,"Refrigerator",30000D));
		list.add(new Product(105,"Washing Machine",40000D));
		list.add(new Product(106,"Television",40000D));
		System.out.println("Before Sorting: ");
		list.forEach(System.out::println);
		System.out.println("After Sorting based on name: ");
		Collections.sort(list);
		list.forEach(System.out::println);

	}

}
