import java.util.Scanner;

public class ManagerPhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhoneBook phoneBook = new PhoneBook();
        int choose = -1;

        while (choose != 0) {
            menu();
            String name;
            String phoneNumber;
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    Scanner input1 = new Scanner(System.in);
                    System.out.println("Nhập tên");
                    name = input1.nextLine();
                    System.out.println("Nhập số điện thoại");
                    phoneNumber = input1.nextLine();
                    phoneBook.insertPhone(name,phoneNumber);
                    break;
                case 2:
                    Scanner input2 = new Scanner(System.in);
                    System.out.println("Nhập tên cần xóa");
                    name = input2.nextLine();
                    phoneBook.removePhone(name);
                    break;
                case 3:
                    Scanner input3 = new Scanner(System.in);
                    System.out.println("Nhâp tên cần thay đổi");
                    name = input3.nextLine();
                    System.out.println("Nhập số muốn thay đổi");
                    phoneNumber = input3.nextLine();
                    phoneBook.updatePhone(name, phoneNumber);
                    break;
                case 4:
                    Scanner input4 = new Scanner(System.in);
                    System.out.println("Nhập tên số cần tìm");
                    name = input4.nextLine();
                    phoneBook.searchPhone(name);
                    break;
                case 5:
                    phoneBook.sortPhone();
                    break;
                case 6:
                    System.out.println("Danh sách số điện thoại");
                    phoneBook.displayListPhone();
                    break;
                case 0:
                    System.exit(0);
            }
        }
        menu();
    }

    public static void menu(){
        System.out.println("MENU");
        System.out.println("1.Insert phone");
        System.out.println("2.Remove phone");
        System.out.println("3.Update phone");
        System.out.println("4.Search phone");
        System.out.println("5.Sort phone");
        System.out.println("6.Danh sách số điện thoại");
        System.out.println("0.Exit");
        System.out.println("Mời bạn chọn");
    }
}
