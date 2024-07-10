
public class Ex42 {

	public static void main(String[] args) {
		// 문자열 연결
		String str = "java";
		str += "spring";
		str = str.concat("jsp");

		// StringBuilder sb = new StringBuilder(str);
		StringBuilder sb = new StringBuilder();
//		sb.append("servlet");
//		sb.append("oracle");
//		sb.append("mysql");
		sb.append("servlet ").append("oracle ").append("mysql");

		// System.out.println("str : " + str);
		String result = sb.toString();
		System.out.println("sb : " + result);
	}

}
