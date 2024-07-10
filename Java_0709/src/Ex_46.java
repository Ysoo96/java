import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_46 {
	public static void main(String[] args) {
		// List list = new ArrayList(); // new type(요소의 타입 미지정)
		// List<String> list = new ArrayList<String>(); // 요소 타입 지정(제네릭스)
		// 제네릭스 -> 자료형 제한 : 성능 향상
		List<String> list = new ArrayList<>();
		// list.add(1); // X
		// list.add(1.0); // X
		// 요소 추가
		list.add("java");
		list.add("spring");
		list.add("spring");

		list.addAll(Arrays.asList("jsp", "servlet", "html", "css"));
		list.addAll(Arrays.asList(new String[] { "bootstrap", "javascript" }));

		System.out.println("요소의 갯수 : " + list.size());

		// 요소 조회
		System.out.println("첫 번째 : " + list.get(0));
		System.out.println("마지막 요소 : " + list.get(list.size() - 1));
	}
}
