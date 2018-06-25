/**
 * volatile关键字
 * volatile的非原子性问题
 * volatile， 只能保证可见性，不能保证原子性。
 * 不是枷锁问题，只是内存数据可见。
 */
package ep1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class VolatitleTest2 {
	
	   volatile int count = 0;
	//AtomicInteger count = new AtomicInteger(0);
	synchronized void m(){
		for(int i = 0; i < 10; i++){
			count++;
//			count.incrementAndGet();

		}
	}
	
	public static void main(String[] args) {
		final VolatitleTest2 t = new VolatitleTest2();
		List<Thread> threads = new ArrayList<>();
		for(int i = 0; i < 10; i++){
			threads.add(new Thread(()->t.m()));
		}
		for(Thread thread : threads){
			thread.start();
		}
		for(Thread thread : threads){
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(t.count);
	}
}
