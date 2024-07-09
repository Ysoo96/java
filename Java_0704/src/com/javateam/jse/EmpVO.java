package com.javateam.jse;

import java.sql.Date;
import java.util.Objects;

// table 컬럼(필드) 1:1 mapping(대응)
// table field = VO field
// VO : Entity(테이블)의 내용(필드 -> 행(레코드, 튜플))
/*
 * 사원 정보 테이블 VO(값 객체)
 */
public class EmpVO {

	/** 사원 번호 */
	private int empNo; // scott.emp.EMPNO 필드에 대응
	/** 사원명 */
	private String eName; // scott.emp.ENAME 필드에 대응
	// 주의) lombok 적용시 getter/setter 메소드명이 다름
	// lombok : getEName() X
	// 자동 생성 : geteName() O
	/** 사원 직무 */
	private String job; // scott.emp.JOB 필드에 대응
	/** 담당 관리자 */
	private int mgr; // scott.emp.MGR 필드에 대응
	/** 입사일 */
	private Date hiredate; // scott.emp.HIREDATE 필드에 대응
	/** 급여 */
	private float sal; // scott.emp.SAL 필드에 대응
	/** 상여금 */
	private float comm; // scott.emp.COMM 필드에 대응
	/** 부서 번호 */
	private int deptNo; // scott.emp.DEPTNO 필드에 대응

	public EmpVO() {

	}

	// 자동 생성 메뉴
	// setter 's'
	public EmpVO(int empNo, String eName, String job, int mgr, Date hiredate, float sal, float comm, int deptNo) {
		// super();
		this.empNo = empNo;
		this.eName = eName;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptNo = deptNo;
	}

	// 코드 생성 자동화
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getMgr() {
		return mgr;
	}

	public void setMgr(int mgr) {
		this.mgr = mgr;
	}

	public Date getHiredate() {
		return hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public float getSal() {
		return sal;
	}

	public void setSal(float sal) {
		this.sal = sal;
	}

	public float getComm() {
		return comm;
	}

	public void setComm(float comm) {
		this.comm = comm;
	}

	public int getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}

	// toString 재정의(오버라이딩)
	// 코드 생성 자동화
	@Override
	public String toString() {
		return "EmpVO [empNo=" + empNo + ", eName=" + eName + ", job=" + job + ", mgr=" + mgr + ", hiredate=" + hiredate
				+ ", sal=" + sal + ", comm=" + comm + ", deptNo=" + deptNo + "]";
	}

	// 두 객체(인스턴스) 간 멤버 필드들 내용(값)들을 일괄 비교
	@Override
	public int hashCode() {
		return Objects.hash(comm, deptNo, eName, empNo, hiredate, job, mgr, sal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpVO other = (EmpVO) obj;
		return Float.floatToIntBits(comm) == Float.floatToIntBits(other.comm) && deptNo == other.deptNo
				&& Objects.equals(eName, other.eName) && empNo == other.empNo
				&& Objects.equals(hiredate, other.hiredate) && Objects.equals(job, other.job) && mgr == other.mgr
				&& Float.floatToIntBits(sal) == Float.floatToIntBits(other.sal);
	}

	public static void main(String[] args) {
		EmpVO empVO = new EmpVO();
		empVO.setEmpNo(1000);
		empVO.seteName("자바맨");
		// 주의) setter/getter 한마디의 단어 변경 -> 소문자화
		// empVO.setEName("자바맨"); -> lombok X : 맹점
		empVO.setJob("프로그래머");
		empVO.setMgr(7839);
		empVO.setHiredate(Date.valueOf("2024-12-02"));
		empVO.setSal(3000000);
		empVO.setComm(0);
		empVO.setDeptNo(10);

		// 개별 멤버 필드 내용(값) 확인
		System.out.println("사원 번호 : " + empVO.getEmpNo());

		// 전체 멤버 필드 내용(값) 확인
		System.out.println("전체 내용 확인 : " + empVO.toString());
		System.out.println("전체 내용 확인 : " + empVO);

		EmpVO empVO2 = new EmpVO(1000, "자바맨", "프로그래머", 7839, Date.valueOf("2024-12-02"), 3000000, 0, 10);
		System.out.println("전체 내용 확인 : " + empVO2);

		System.out.println("두 객체 간 필드들 비교 : " + empVO.equals(empVO2));
		System.out.println("empVO hashCode : " + empVO.hashCode());
		System.out.println("empVO2 hashCode : " + empVO2.hashCode());
	}

	// 멤버 필드 -> private : 보안(캡슐화) 적용
	// 멤버 필드에 접근 -> getter/setter 간접 접근 + 가공

	// get method -> getter
//	public int getEmpNo() {
//		return empNo;
//	}

	// set method -> setter
//	public void setEmpNo(int empNo) {
//		this.empNo = empNo;
//	}
}
