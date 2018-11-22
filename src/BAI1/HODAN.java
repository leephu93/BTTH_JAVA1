package BAI1;

import java.util.Scanner;

public class HODAN {

    Scanner scanner = new Scanner(System.in);
    int songuoi;
    String sonha;

    public int getSonguoi() {
        return songuoi;
    }

    public void setSonguoi(int songuoi) {
        this.songuoi = songuoi;

    }

    public String getSonha() {
        return sonha;
    }

    public void setSonha(String sonha) {
        this.sonha = sonha;
    }

    HODAN(String sonha, int songuoi) {
        this.sonha = sonha;
        this.songuoi = songuoi;
    }

    void insertHODAN(int stt) {
        CANHAN[] ar_canhan = new CANHAN[this.getSonguoi()];
        for (int i = 0; i < ar_canhan.length; i++) {
            System.out.println("THÀNH VIÊN " + (i + 1) + " CỦA HỘ DÂN " + stt);
            System.out.print("NHẬP HỌ TÊN THÀNH VIÊN: ");
            String hoten = scanner.nextLine();
            System.out.print("NHẬP TUỔI CỦA THÀNH VIÊN: ");
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.print("NHẬP NĂM SINH CỦA THÀNH VIÊN: ");
            int namsinh = Integer.parseInt(scanner.nextLine());
            System.out.print("NHẬP NGHỀ NGHIỆP CỦA THÀNH VIÊN: ");
            String nghenghiep = scanner.nextLine();
            ar_canhan[i] = new CANHAN(hoten, tuoi, namsinh, nghenghiep);
        }
        showHODAN(ar_canhan);
    }

    void showHODAN(CANHAN[] ar_canhan) {
        System.out.println("__________DANH SÁCH THÀNH VIÊN CỦA HỘ DÂN " + this.getSonha() + "__________");
        for (int i = 0; i < ar_canhan.length; i++) {
            System.out.println("HỌ TÊN THÀNH VIÊN " + (i + 1) + " : " + ((CANHAN) ar_canhan[i]).hoten);
            System.out.println("TUỔI CỦA THÀNH VIÊN " + (i + 1) + " : " + ((CANHAN) ar_canhan[i]).tuoi);
            System.out.println("NĂM SINH CỦA THÀNH VIÊN " + (i + 1) + " : " + ((CANHAN) ar_canhan[i]).namsinh);
            System.out.println("NGHỀ NGHIỆP CỦA THÀNH VIÊN " + (i + 1) + " : " + ((CANHAN) ar_canhan[i]).nghenghiep);
            System.out.println("_______________________________________________________");
        }
    }
}
