package Session6;

class NewThread extends Thread{
	Thread t;
	
	NewThread() {
		super("Demo Thread");
		System.out.println("My thread created " +this);
		start();
	}

	@Override
	public void run() {
		
		try {
			for(int i = 0; i < 10; i++){
				System.out.println("Printing the count: " +i);
				Thread.sleep(500);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("My thread run is over");
		}
		System.out.println("Main thread run is over ");
	}
	
	
	
}


public class ExtendedThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewThread td = new NewThread();
		
		try {
			while(td.isAlive()){
				System.out.println("Main thread will be alive till the child thread is live");
		           Thread.sleep(1500);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("My thread run is over");
		}
		
		System.out.println("Main thread's run is over ");
	}

}
