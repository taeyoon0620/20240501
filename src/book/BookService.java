package book;
import java.util.Scanner;

public class BookService {
	
	private static final Animal[] InfoStore = new Animal[100];
	private int sequence = 0;
	private int id = 1;
	public static final Scanner Scanner = new Scanner(System.in);
	
	// [1.저장]=============================================================================
	public void input() {
		
		//동물정보 입력받기
		System.out.println("이름과 나이를 입력하세요...");
		System.out.print("동물명:");
		String name = Scanner.next();
		System.out.print("나이:");
		int age = Scanner.nextInt();
		
		// 동물정보 저장완료 메세지 출력
		System.out.println("회원 정보가 저장되었습니다.");
		
		// 동물 배열에 저장
		InfoStore[sequence++] = new Animal(id++,name,age);
	}
		
	// [2. 조회] =======================================================================
	private Animal findById(long id) {
		for (int i = 0; i < sequence; i++) {
			if (InfoStore[i].getId() == id) {
				return InfoStore[i]; // 해당 id 동물반환
			}
		}
		return null;
	}
	
	public void search() {
		
		System.out.println("[조회] 회원 아이디 입력...");
		long id = Scanner.nextInt();
		
		Animal foundIndex = findById(id);
		if (foundIndex != null) {
			foundIndex.showInfo();
			System.out.println("\n회원 정보 조회가 완료되었습니다.");
			return;
		}
		
		else if (foundIndex == null) {
			System.out.println("아이디가 " + id + "인 상품은 없습니다.");
			return;
		}
	}
	
	
	// [3. 수정] ====================================================================
	public void update() {
		
		System.out.println("[수정] 회원 아이디 입력...");
		int id = Scanner.nextInt();
		
		Animal foundIndex = findById(id);
		if(foundIndex != null) {
			System.out.print("이름과 나이를 입력하세요...");
			String name = Scanner.next();
			int age = Scanner.nextInt();
			
			foundIndex.setName(name);
			foundIndex.setAge(age);
			System.out.println("회원 정보 수정이 완료되었습니다.");
		}
	}
	
	// [4. 삭제]=====================================================================
	public void delete() {	
	
		System.out.println("[삭제] 회원 아이디 입력...");
		int id = Scanner.nextInt();
		
		int foundIndex = -1;
		for(int i = 0; i < sequence; i++) {
			if(InfoStore[i].getId() == id) {
				foundIndex = i;
				break;
			}
		}
		
		if(foundIndex != -1) {
			for(int j = foundIndex; j < sequence; j++) {
				InfoStore[j] = InfoStore[j + 1];
			}
			sequence--;
			System.out.println(id + "번 회원 정보가 삭제되었습니다.");		
		}
		
	}

	
	// [5.회원 전체 조회]===========================================================
	public void print() {
		
		if(sequence == 0) {
			System.out.println("<< 전체 회원 동물 수 : " + sequence + " >>");
			System.out.println("저장된 고객 정보가 없습니다.");
			return;
			
		}
		
		System.out.println("<< 전체 회원 동물 수 : " + sequence + " >>");
		for (int i = 0; i < sequence; i++) {
			InfoStore[i].showInfo();	
			//System.out.println("번호 : " + id + "," + "이름 : " + name +"," + "나이" + age + ",");
		}
	}
	
	
	// [6. 전체 정보 삭제] ==========================================================
	public void clearStore() {
		//동물 정보 초기화
		sequence = 0;
		System.out.println("모든 고객 정보가 삭제되었습니다.");
	}
	
	
	// 7. 프로그램 종료 ===========================================================
	public void SystemEnd() {
		
		System.exit(0);
		
	}
}
 

