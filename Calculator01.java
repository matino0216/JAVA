package Calculator01;

import java.util.Scanner;

public class Calculator01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char op;
        int result = 0;

        String str = "";

        do {
            System.out.println("첫 번째 값을 입력해 주세요.");
            num1 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: \n");
            op = sc.next().charAt(0);
            System.out.println("두 번째 값을 입력해 주세요.");
            num2 = sc.nextInt();

            switch (op) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로는 나눌 수 없습니다.");
                    } else {
                        result = num1 / num2;
                        break;
                    }
                default:
                    System.out.println("+, -, *, / 중 선택하여 입력하세요.");
                    break;
            }
            System.out.println("답 : " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            str = sc.next();
        } while (!str.equals("exit"));
    }
}
