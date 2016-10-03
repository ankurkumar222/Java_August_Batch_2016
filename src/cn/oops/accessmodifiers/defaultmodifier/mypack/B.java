package cn.oops.accessmodifiers.defaultmodifier.mypack;
import cn.oops.accessmodifiers.defaultmodifier.pack.*;

class B {
	public static void main(String args[]) {
		A obj = new A();// Compile Time Error
		obj.msg();// Compile Time Error
	}
}