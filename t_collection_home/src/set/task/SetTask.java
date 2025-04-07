package set.task;

import java.util.ArrayList;
import java.util.HashSet;

public class SetTask {
	public static void main(String[] args) {
//		태극기 색깔
//		흰색, 검은색, 빨간색, 파란색
		
//		각 색상을 Color 객체에 담은 뒤 HashSet에 담는다.
//		흰색을 한 번 더 담은 뒤 결과를 확인하고, hashCode()를 이해
		
		ArrayList<Color> flagColor = new ArrayList<Color>();
		flagColor.add(new Color(1L,"white"));
		flagColor.add(new Color(2L,"black"));
		flagColor.add(new Color(3L,"blue"));
		flagColor.add(new Color(4L,"red"));
		
		System.out.println(flagColor);
		
		HashSet<Color> flagHashSet = new HashSet<Color>(flagColor);
		System.out.println(flagHashSet);
		System.out.println(flagHashSet.size());
//		4색이므로 4
		flagHashSet.add(new Color(1L, "white"));
		flagHashSet.add(new Color(5L, "white"));
		System.out.println(flagHashSet.size());
//		똑같은 색이므로 4여야 하지만 id가 다르므로 추가.
	}
}
