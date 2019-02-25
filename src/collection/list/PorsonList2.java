package collection.list;
class Porson2{
	private String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class PorsonList2 {
	public static void main(String[] args) {
		Porson2 p = new Porson2();
		Porson2 p2 = p;
		Porson2 p3 = p;
		p.setName("hong");
		p.setName("black");
		p.setName("black2");
		System.out.println(p.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		p.setName("black3");
		System.out.println(p.getName());
		System.out.println(p2.getName());
	}

}
