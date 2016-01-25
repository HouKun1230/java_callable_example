package callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;

public class testCallable {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		   ExecutorService service =  Executors.newSingleThreadExecutor();
		   calltest Task = new calltest();
		   Future<Integer> future = service.submit(Task);
		   Integer result = future.get();
		   System.out.println(result);

	}
	
	

}
