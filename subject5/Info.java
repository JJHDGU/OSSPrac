import java.util.Scanner;

public class Info {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String name = sc.nextLine();
		
		System.out.print("학번을 입력하세요: ");
		String studentId = sc.nextLine();
		
		System.out.println("\n<출력>");
		System.out.println("이름: " + name);
		System.out.println("학번: " + studentId);
		
		sc.close();
	}

}
