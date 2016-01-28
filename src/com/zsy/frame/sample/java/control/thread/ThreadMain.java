package com.zsy.frame.sample.java.control.thread;

/**
 * 商业用词：框架与插件
 * <E>是控制点，透过<I>来驱动<T>
 * <E>+<I> = 框架(Framework)
 * <T> = 插件(Pluy-in)
 * 
 * 分工模式
 * 1：框架师做EIT设计
 * 2：强龙做框架
 * 3：地头蛇配插件   
 */


/**
 * Java中Runnable和Thread的区别
 * 在java中可有两种方式实现多线程，一种是继承Thread类，一种是实现Runnable接口；
 * Thread类是在java.lang包中定义的。
 * 一个类只要继承了Thread类同时覆写了本类中的run()方法就可以实现多线程操作了，
 * 但是一个类只能继承一个父类，这是此方法的局限。
 * 
 * 在程序开发中只要是多线程肯定永远以实现Runnable接口为主，因为实现Runnable接口相比继承Thread类有如下好处：
避免点继承的局限，一个类可以继承多个接口。
适合于资源的共享
 * 
 * 
 * @description：java Thread两种简单用法总结
 * //多线程的写法2，用两种情况变换，
//情况1：新建一个对象，两个线程共享一个对象。另外是新建两个对象，两个线程用两个对象
//情况2：int i=0；拿到run（）外面与在run（）里面两种情况。
//上面4种情况可以排列组合试一下
 * @author samy
 * @date 2015-3-1 下午10:38:58
 */
public class ThreadMain {

	public static void main(String args[]) {

		// MyThread1 myThread = new MyThread1();
		// myThread.start();
		// MyThread1 myThread2 = new MyThread1();
		// myThread2.start();
		//
		// Thread t1 = new Thread(myThread);
		// Thread t2 = new Thread(myThread);
		// t1.start();
		// t2.start();

		// * 这段跟下面的作用是一样的。。。new的ThreadTest1的对象不能调用start方法
		Thread1Runable mt = new Thread1Runable();//Task();
		new Thread(mt).start();// 同一个mt，但是在Thread中就不可以，如果用同一个实例化对象mt，就会出现异常
		new Thread(mt).start();
		new Thread(mt).start();
	}
}

/**
 * @description：这段代码用实现接口来做;可以让类extends继承其他类
 * 　虽然现在程序中有三个线程，但是一共卖了10张票，也就是说使用Runnable实现多线程可以达到资源共享目的。
 * 
　　Runnable接口和Thread之间的联系：
　　public class Thread extends Object implements Runnable
　　发现Thread类也是Runnable接口的子类。
 * @author samy
 * @date 2015-3-1 下午10:45:44
 */
class Thread1Runable implements Runnable {
	int ticket = 10;
	public void run() {
		for (int i = 0; i < 20; i++) {
			if (this.ticket > 0) {
				System.out.println("卖票：ticket" + this.ticket--);
			}
		}
	}
}

/**
 * @description：这种方式
 * @author samy
 * @date 2015-3-1 下午10:40:52
 */
class MyThread1 extends Thread {
	// int i=0;//1
	public void run() {
		String name = Thread.currentThread().getName();
		String inf = Thread.currentThread().toString();
		long idnum = Thread.currentThread().getId();
		for (int i = 0; i < 10; i++) {// 不管是新建一个对象，还是两个对象，//2，都是打印20个数据
			// for(;i<10;i++){//新建一个对象的时候，打印11个左右的数据 ,新建两个对象的时候，//2，会打印20个数据。//1
			System.out.println("i----------" + i + ",thread name==" + name + ",threadid==" + idnum + ",thread inf==" + inf);
		}
	}
}
