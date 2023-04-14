import java.util.ArrayList;
import java.util.Scanner;

public class AtmAccountDAO {
    private ArrayList<AtmAccountDTO> accountList;
    Scanner sc = new Scanner(System.in);

    public void accountInsert() {
        AtmAccountDTO ac = new AtmAccountDTO();
        System.out.println("[입력] 신규 아이디를 입력:");
        String id = sc.next();
        System.out.println("[입력] 신규 비밀번호 입력:");
        String pw1 = sc.next();
        System.out.println("[입력] 신규 비밀번호 재 입력:");
        String pw2 = sc.next();




    }
}
