package thread;

public class Thread_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Thread_run th = new Thread_run();
		//Thread_runnable th2 = new Thread_runnable(); 
		Thread_run th[] = new Thread_run[2];
		Thread_runnable th2[] = new Thread_runnable[3]; 
		
		for(int i = 0; i < th.length; i++) {
			th[i] = new Thread_run();
		}
		for(int i = 0; i < th2.length; i++) {
			th2[i] = new Thread_runnable();
		}
		
		for(int i = 0; i < th.length; i++) {
			th[i].start();
		}
		for(int i = 0; i < th2.length; i++) {
			th2[i].run();
		}
		
		/*th.start();
		th2.run();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		for(int i = 0; i < 10; i++) {
			System.out.println("mainから出力:" + i);
		}

	}

}
