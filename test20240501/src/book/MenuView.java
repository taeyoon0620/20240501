package book;

import java.util.Scanner;

public class MenuView {
	
	public static final Scanner Scanner = new Scanner(System.in);

	
	public static void showMenu() {
		System.out.println("\n<< 동물병원 회원 정보 관리 >> ");
		System.out.println("1. 정보 저장");
		System.out.println("2. 정보 조회");
		System.out.println("3. 정보 수정");
		System.out.println("4. 정보 삭제");
		System.out.println("5. 정보 전체 출력");
		System.out.println("6. 정보 전체 삭제");
		System.out.println("7. 프로그램 종료");
		System.out.print("선택 :");
	}
	
	
	
}
