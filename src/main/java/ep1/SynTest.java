/**
 * synchronized关键字
 * 锁对象变更问题
 * 同步代码一旦加锁后，那么会有一个临时的锁引用执行锁对象，和真实的引用无直接关联。
 * 在锁未释放之前，修改锁对象引用，不会影响同步代码的执行。
 */
package ep1;

import java.util.concurrent.TimeUnit;

public class SynTest {
	 Object o = new Object();

	int i = 0;

	void  m(){
		System.out.println(Thread.currentThread().getName() + " start");


				synchronized (o) {
					while(true) {
					try {
						TimeUnit.SECONDS.sleep(1);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(Thread.currentThread().getName() + " - " + o);
				}
			}

	}

	public static void main(String[] args) {
		final SynTest t = new SynTest();
		new Thread(new Runnable() {
			@Override
			public void run() {
				t.m();
			}
		}, "thread1").start();

		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.o = new Object();

		new Thread(new Runnable() {
			@Override
			public void run() {
				t.m();
			}
		}, "thread2").start();


	}
	
}
