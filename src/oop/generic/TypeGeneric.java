package oop.generic;
class Test{
	
}
public class TypeGeneric<T> extends Test{
	private Object o;
	private T t;
	
	public Object getO() {
		return o;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public void setO(Object o) {
		this.o = o;
	}
	public static void main(String[] args) {
		TypeGeneric<Integer> tg = new TypeGeneric<>();
		tg.setT(123);
		Integer i = tg.getT();
		tg.setO("abc");
		Object o = tg.getO();
	}

}
