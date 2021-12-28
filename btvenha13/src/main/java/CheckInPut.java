import java.util.Scanner;

public class CheckInPut {
    public static int input(){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        boolean isCheck = false;
        while (!isCheck)
        {
            try {
                System.out.print("Nhập lựa chọn của bạn : ");
                number = Integer.parseInt(sc.nextLine());
                isCheck = true;
            } catch (NumberFormatException e){
                System.out.println("Không được nhập chữ, vui lòng nhập số !!!");
                Controller.menu();
            }
        }
        return number;
    }
}