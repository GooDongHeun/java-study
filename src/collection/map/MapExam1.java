package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Map Key-Value구조
public class MapExam1 {
	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		hm.put("이름","홍길동1");
		hm.put("이름","홍길동2");
		System.out.println(hm);
		System.out.println(hm.get("이름"));
		List<String> ll = new ArrayList<>();
		ll.add("이름");
		ll.add("이름");
		ll.add("이름");
		System.out.println(ll); 
	}

}
