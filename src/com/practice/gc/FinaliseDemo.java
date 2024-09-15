package com.practice.gc;

public class FinaliseDemo {
	private static FinaliseDemo f;

	public static void main(String[] args) throws InterruptedException {
		FinaliseDemo ff = new FinaliseDemo();
		System.out.println(ff.hashCode());
		// f = ff;
		ff = null;
		System.gc();
		Thread.sleep(10000);

		// Thread.sleep(1000);

		System.out.println(f.hashCode());
	}

	public void finalise() throws Throwable {
		f = this;
		System.out.println("finalised called");

	}
}
