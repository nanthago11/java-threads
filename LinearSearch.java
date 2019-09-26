package sample;
import java.util.*;
public class LinearSearch 
{
	public static void main(String args[])
	{
		int list[] = new int[100];
		for(int j = 0; j < list.length; j++) list[j] = (int)(Math.random()*100);
		for(int y : list) System.out.print(y+" ");
		System.out.println();
		System.out.print("Enter number to search for: ");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		Searcher t = new Searcher(list,0,50,x);
		Searcher t1 = new Searcher(list,50,100,x);
				t.start(); t1.start();
				try{
				t.join(); t1.join();
				}
				catch(InterruptedException e){}
				boolean found = t.getResult() || t1.getResult();
				System.out.println("Found = " + found);
				
				}
				}	

