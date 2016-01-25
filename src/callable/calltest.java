package callable;

import java.util.concurrent.Callable;

public class calltest implements Callable
{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		
		int sum = 0;
		for(int i=1;i<=199;i++){
			sum+=i;
		}
		return sum;
	}
}
	