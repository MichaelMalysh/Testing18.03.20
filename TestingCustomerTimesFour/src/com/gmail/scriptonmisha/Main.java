package com.gmail.scriptonmisha;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		Random rnd = new Random();
		int n = 6;
		
		Map<Key, Double> table = new HashMap<>();
		
		table.put(new Key(1, "Jan"), rnd.nextDouble()*n);
		table.put(new Key(2, "Jan"), rnd.nextDouble()*n);
		table.put(new Key(3, "Jan"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "Feb"), rnd.nextDouble()*n);
		table.put(new Key(2, "Feb"), rnd.nextDouble()*n);
		table.put(new Key(3, "Feb"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "Mar"), rnd.nextDouble()*n);
		table.put(new Key(2, "Mar"), rnd.nextDouble()*n);
		table.put(new Key(3, "Mar"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "Apr"), rnd.nextDouble()*n);
		table.put(new Key(2, "Apr"), rnd.nextDouble()*n);
		table.put(new Key(3, "Apr"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "May"), rnd.nextDouble()*n);
		table.put(new Key(2, "May"), rnd.nextDouble()*n);
		table.put(new Key(3, "May"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "Jun"), rnd.nextDouble()*n);
		table.put(new Key(2, "Jun"), rnd.nextDouble()*n);
		table.put(new Key(3, "Jun"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "Jul"), rnd.nextDouble()*n);
		table.put(new Key(2, "Jul"), rnd.nextDouble()*n);
		table.put(new Key(3, "Jul"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "Aug"), rnd.nextDouble()*n);
		table.put(new Key(2, "Aug"), rnd.nextDouble()*n);
		table.put(new Key(3, "Aug"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "Sep"), rnd.nextDouble()*n);
		table.put(new Key(2, "Sep"), rnd.nextDouble()*n);
		table.put(new Key(3, "Sep"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "Oct"), rnd.nextDouble()*n);
		table.put(new Key(2, "Oct"), rnd.nextDouble()*n);
		table.put(new Key(3, "Oct"), rnd.nextDouble()*n);
		
		table.put(new Key(1, "Nov"), rnd.nextDouble()*n);
		table.put(new Key(2, "Nov"), rnd.nextDouble()*n);
		table.put(new Key(3, "Nov"), rnd.nextDouble()*n);

		table.put(new Key(1, "Dec"), rnd.nextDouble()*n);
		table.put(new Key(2, "Dec"), rnd.nextDouble()*n);
		table.put(new Key(3, "Dec"), rnd.nextDouble()*n);
		
		System.out.println(table.get(new Key(3, "Dec")));

		System.out.println(table);


		


	}

}
