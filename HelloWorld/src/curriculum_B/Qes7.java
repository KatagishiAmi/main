package curriculum_B;
import java.util.Scanner;
public class Qes7 {
	public static void main(String[] args) {
		//ログイン時の入力チェックシステムを下記条件で作成してください
		//・コンソールにユーザー名を入力できるようにしてください
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("文字を入力してください。");
			String str = scan.next();
			System.out.println("入力された文字は" + str + "です。");
		}
	}
}
