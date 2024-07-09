package home;

public class Demo {

	private String spec;

	public String getSpec() {
		return spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public static void main(String[] args) {

		Demo demo = new Demo();
		demo.setSpec("java"); // 입력
		System.out.println(demo.getSpec()); // 출력

	}

}
