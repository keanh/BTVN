import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone implements PhoneFunction {
    ArrayList<Phone> listPhone = new ArrayList<Phone>();

    public ArrayList<Phone> getListPhone() {
        return listPhone;
    }

    @Override
    public void insertPhone(String name, String phoneNumber) {
        Phone newPhone = new Phone(name,phoneNumber);
        listPhone.add(newPhone);
        System.out.println("Thêm thành công");
    }

    @Override
    public void removePhone(String name) {
        boolean isPhone = false;
        for (Phone phone:listPhone){
            if (phone.getName().equals(name)){
                listPhone.remove(phone);
                System.out.println("Đã xóa thành công");
                isPhone = true;
                break;
            }
        }

        if (!isPhone){
            System.out.println("Số không tồn tại, thử lại.");
        }
    }

    @Override
    public void searchPhone(String name) {
        boolean isPhone = false;
        for (Phone phone:listPhone){
            if (phone.getName().equals(name)){
                System.out.println("Your phone: " + phone.toString());
                isPhone = true;
                break;
            }
        }
        if (!isPhone){
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void updatePhone(String name, String phoneNumber) {
        boolean isPhone = false;
        for (Phone phone:listPhone){
            if (phone.getName().equals(name)){
                phone.setPhoneNumber(phoneNumber);
                System.out.println("Thay đổi thành công");
                isPhone = true;
                break;
            }
        }
        if (!isPhone){
            System.out.println("Số đã tồn tại");
        }
    }

    @Override
    public void sortPhone() {
        Collections.sort(listPhone, new Comparator<Phone>() {
            @Override
            public int compare(Phone phone1, Phone phone2) {
                return phone1.getName().compareTo(phone2.getName());
            }
        });
        System.out.println("Đã sắp xếp");
    }

    public void displayListPhone(){
        for (Phone phone:listPhone){
            System.out.println("Tên: " + phone.getName() +", số điện thoại: " + phone.getPhoneNumber());
        }
    }
}
