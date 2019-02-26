package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(33,"삼삼");
		map.put(44,"사사");
		map.put(55,"오오");
		System.out.println(map);
		//고양이 이름은 냥이1~냥이10
		//나이는 랜덤으로 1살부터 30살까지
		//반복문을 사용해서 위에서 생성된 고양이를 출력해주세요
		HashMap<String,Object> cat = new HashMap<>();
		cat.put("name","냥이1");
		cat.put("age",11);
		System.out.println(cat);
		
		List<HashMap<String,Object>> catList = new ArrayList<>();
		catList.add(cat);
		for(int i=0;i<10;i++) {
			cat = new HashMap<>();
			cat.put("고양이 이름","냥이"+(i+1));
			cat.put("고양이 나이", ((int)(Math.random()*30)+1));
			catList.add(cat);
		}
		for(int i=0;i<catList.size();i++) {
			System.out.println(catList.get(i));			
		}
	}

}
