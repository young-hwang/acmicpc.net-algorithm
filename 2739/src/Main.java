import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
		 * ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
		 * ������İ� ���� N*1���� N*9���� ����Ѵ�.
		 * 
		 * 2
		 * 
  		 * 2 * 1 = 2
		 * 2 * 2 = 4
		 * 2 * 3 = 6
		 * 2 * 4 = 8
		 * 2 * 5 = 10
		 * 2 * 6 = 12
		 * 2 * 7 = 14
		 * 2 * 8 = 16
		 * 2 * 9 = 18
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String value = sc.nextLine();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(value + " * " + i + " = " + Integer.parseInt(value) * i);
		}
	}
	
}