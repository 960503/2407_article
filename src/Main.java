import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("== 프로그램 시작 ==");
		int id = 0;
		while (true) {

			System.out.printf("명령어 ) ");
			String cmd = sc.nextLine();

			if (cmd.length() == 0) {
				System.out.println("명령어를 입력해주세요.");

			} else if (cmd.equals("article write")) {

				System.out.printf("제목 : ");
				cmd = sc.nextLine();

				System.out.printf("내용 : ");
				cmd = sc.nextLine();

				id++;

				System.out.printf("%d번 글이 생성되었습니다.\n", id);

			} else if (cmd.equals("article list")) {

				System.out.println("게시물이 존재하지 않습니다.");

			} else {

				System.out.println("존재하지 않는 명령어입니다.");

			}

			if (cmd.equals("exit")) {

				System.out.println("== 프로그램 끝 ==");
				break;
			}

		}
		sc.close();
	}
}