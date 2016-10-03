package cn.oops.generics.example2;

public class Box<T> {

	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}

	public static void main(String[] args) {
		Box<Integer> intBox = new Box<Integer>();
		Box<String> stringBox = new Box<String>();
		Integer x = 10;
		intBox.set(x);
		String str = "Hello";
		stringBox.set(str);

		System.out.printf("Integer Value :%d\n\n", intBox.get());
		System.out.printf("String Value :%s\n", stringBox.get());
	}
}