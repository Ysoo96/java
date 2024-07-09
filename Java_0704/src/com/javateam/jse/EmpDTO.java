package com.javateam.jse;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
// @Getter
// @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpDTO {
	
	/** 사원 번호 */
	private int empNo; // scott.emp.EMPNO 필드에 대응(mapping)
	
	/** 사원명 */
	private String eName; // scott.emp.ENAME 필드에 대응
	// 주의) lombok 적용시 getter/setter 메소드명이 다름 !
	// lombok : getEName() (X)
	// 자동 생성 : geteName() (O)
	
	/** 사원 직무 */
	private String job; // scott.emp.JOB 필드에 대응
	
	/** 담당 관리자 */
	private int mgr; // scott.emp.MGR 필드에 대응
	
	/** 입사일 */
	private Date hiredate; // scott.emp.HIREDATE 필드에 대응
	
	/** 급여 */
	private float sal; // scott.emp.SAL 필드에 대응
	
	/** 보너스(상여금) */
	private float comm; // scott.emp.COMM 필드에 대응
	
	/** 부서 번호 */
	private int deptNo; // scott.emp.DETNO 필드에 대응
	
	// private int eeDriver;

	public static void main(String[] args) {

		EmpDTO empDTO = new EmpDTO();		
		empDTO.setEmpNo(1000);
		empDTO.setEName("자바맨"); // (O)
		// 주의) setter/getter 한마디의 단어 변경 => 소문자화
		// empDTO.setEName("자바맨"); => lombok (X) : 맹점
		empDTO.setJob("프로그래머");
		empDTO.setMgr(7839);
		empDTO.setHiredate(Date.valueOf("2024-12-02"));
		empDTO.setSal(3000000);
		empDTO.setComm(0);
		empDTO.setDeptNo(10);
		
		// 개별 멤버 필드 내용(값) 확인
		System.out.println("사원 번호 : " + empDTO.getEmpNo());
		
		// 전체 멤버 필드 내용(값) 확인
		System.out.println("전체 내용 확인 : " + empDTO.toString());
		System.out.println("전체 내용 확인 : " + empDTO);
		
//		EmpDTO empDTO2 
//			= new EmpDTO(1000, "자바맨", "프로그래머", 7839, 
//					Date.valueOf("2024-12-02"), 3000000, 0, 10);
		
		EmpDTO empDTO2 = EmpDTO.builder()
							   .empNo(1000)
							   .eName("자바맨")
							   .job("프로그래머")
							   .mgr(7839)
							   .hiredate(Date.valueOf("2024-12-02"))
							   .sal(3000000)
							   .comm(0)
							   .deptNo(10)
							   .build();
		
		System.out.println("전체 내용 확인 : " + empDTO2);
		
		System.out.println("두 객체간 필드들 비교 : " + empDTO.equals(empDTO2));
		System.out.println("empDTO hashCode : " + empDTO.hashCode());
		System.out.println("empDTO2 hashCode : " + empDTO2.hashCode());
	}

}
