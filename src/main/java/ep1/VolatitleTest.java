/**
 * volatile关键字
 * volatile的可见性
 * 通知OS操作系统底层，在CPU计算过程中，都要检查内存中数据的有效性。保证最新的内存数据被使用。
 * 
 */
package ep1;

import java.util.concurrent.TimeUnit;

public class VolatitleTest {
	
	 volatile boolean b = true;
	
	void m(){
		System.out.println("start");
		while(b){
		}
		System.out.println("end");
	}
	
	public static void main(String[] args) {
		final VolatitleTest t = new VolatitleTest();
		new Thread(()->{t.m();}).start();

		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t.b = false;
	}
	
}
