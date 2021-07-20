package Question3.Order;

import Question3.material.Accessories;
import Question3.material.Laptop;

public class Order {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(101,"i3",50000,"Hp",5,3); 
		Laptop l2 = new Laptop(102,"i2",5000,"Dell",10,1); 
		Laptop l3 = new Laptop(103,"i5",57000,"Sony",11,5); 
		Laptop l4 = new Laptop(104,"i7",90000,"Hp",12,2);
		Laptop l5 = new Laptop(105,"i9",150000,"Apple",14,9);
		
		System.out.println();
		System.err.println("DETAILES ABOUT THE ORDER OF LAPTOPS ");
		System.out.println();
		
		l1.lowOrderLevelQuantityfun();
		l2.lowOrderLevelQuantityfun();
		l3.lowOrderLevelQuantityfun();
		l4.lowOrderLevelQuantityfun();
		l5.lowOrderLevelQuantityfun();
		
		System.out.println();System.out.println();
		System.err.println("ETAILES ABOUT THE ORDER OF ACCESSORIES ");
		System.out.println();
		
		Accessories a1 = new Accessories(1001,15000,5,3);
		Accessories a2 = new Accessories(1002,52000,6,1);
		Accessories a3 = new Accessories(1003,50300,51,2);
		Accessories a4 = new Accessories(1004,50100,34,6);
		Accessories a5 = new Accessories(1005,50050,45,7);
		Accessories a6 = new Accessories(1006,50500,5,31);
		Accessories a7 = new Accessories(1007,50400,54,36);
		Accessories a8 = new Accessories(1008,54000,12,2);
		Accessories a9 = new Accessories(1009,50060,63,1);
		Accessories a10 = new Accessories(1010,50800,10,0);
		
		a1.lowOrderLevelQuantityfun();
		a2.lowOrderLevelQuantityfun();
		a3.lowOrderLevelQuantityfun();
		a4.lowOrderLevelQuantityfun();
		a5.lowOrderLevelQuantityfun();
		a6.lowOrderLevelQuantityfun();
		a7.lowOrderLevelQuantityfun();
		a8.lowOrderLevelQuantityfun();
		a9.lowOrderLevelQuantityfun();
		a10.lowOrderLevelQuantityfun();
	}
}
