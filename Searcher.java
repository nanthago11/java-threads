package sample;

public class Searcher extends Thread
{
	 private int f[];
	 private int lb, ub;
	 private int x;
	 private boolean found;
	 Searcher(int f1[], int a, int b, int x) 
	 {
	 f = f1; lb = a; ub = b; this.x = x;
	 }
			
	 public void run() 
	 {
	 int k = lb; found = false;
	 while (k < ub && !found)
	 {
	 if(f[k] == x) found = true;
	 k++;
	 }
	 }
	 boolean getResult() 
	 {
	 return found;
	 }
	 }


