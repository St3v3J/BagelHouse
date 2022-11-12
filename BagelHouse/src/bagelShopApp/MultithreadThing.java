package bagelShopApp;

public class MultithreadThing implements Runnable {
	
	private int threadNumber;
	public MultithreadThing(int threadNumber) {
		this.threadNumber = threadNumber;
	}
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 7; i++) {
			System.out.println(i + " from thread " + threadNumber);
			
		/*
		 * un-comment out the next 3 lines of code to generate an exception
		 * to demonstrate that the other threads continue even when one of 
		 * them throws an exception.
		 */
			
		//	if(threadNumber == 3) {		// number three will blow up now!
		//		throw new RuntimeException("This demonstrates that the other threads continue.");
		//	}
			
				try {
				Thread.sleep(1000);		// So it is easier to see the 
										// threads, one second delay between numbers!
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
}
}
}
