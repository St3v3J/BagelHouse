package bagelShopApp;

/*
 * This class and MultithreadThing.java represent the second point
 * of project 5.
 */
public class Multithreading{
	public static void main(String[] args) {
		
// this starts new threads.
		for (int i = 0; i <= 7; i++) {
			MultithreadThing myThing = new MultithreadThing(i);
			Thread myThread = new Thread(myThing);
			myThread.start();
		}
		
	}
	
}








