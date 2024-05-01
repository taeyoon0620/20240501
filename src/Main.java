import book.BookService;
import book.MenuView;

public class Main {
	
	//객체 생성 
	private static BookService manage = new BookService();
	public static void main(String[] args) {
		
	int choice;	
	
		while(true) { 
			
			MenuView.showMenu();
			choice = MenuView.Scanner.nextInt();
			
			switch(choice) {
			case 1 :
				manage.input();
				break;
			case 2: 
				manage.search();
				break;
			case 3 : 
				manage.update();
				break;
			case 4 :
				manage.delete();
				break;
			case 5 :
				manage.print();
				break;
			case 6 :
				manage.clearStore();
				break;
			case 7 :
				manage.SystemEnd();

				
				
			}
		}
	}
}
