package programsofthread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Thread1 {
	
	public static void main(String [] args) {
		ExecutorService service =Executors.newFixedThreadPool(3);
		
		for(int i=1;i<=5;i++) {
			int task=i;
			service.submit(()-> {System.out.println(task+" "+Thread.currentThread().getName());});
			
		}
		service.shutdown();
	}

}
