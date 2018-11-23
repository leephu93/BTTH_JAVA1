package BAI13;

import java.util.Scanner;

public class XE {

    String somay;
    String sokhung;
    float giathanh;
    String hangsanxuat;
    Scanner scanner = new Scanner(System.in);

    XE() {

    }

    XE(String somay, String sokhung, float giathanh, String hangsanxuat) {
        this.somay = somay;
        this.sokhung = sokhung;
        this.giathanh = giathanh;
        this.hangsanxuat = hangsanxuat;
    }

    void NHAPTHONGTINXE() {
        System.out.print("NHẬP SỐ MÁY XE: ");
        this.somay = scanner.nextLine();
        System.out.print("NHẬP SỐ KHUNG XE: ");
        this.sokhung = scanner.nextLine();
        System.out.print("NHẬP GÍA XE: ");
        this.giathanh = Float.parseFloat(scanner.nextLine());
        System.out.print("NHẬP HÃNG SẢN XUẤT XE: ");
        this.hangsanxuat = scanner.nextLine();
    }

    void XEMTHONGTINXE() {
        System.out.println("SỐ MÁY XE: " + somay);
        System.out.println("SỐ KHUNG XE: " + sokhung);
        System.out.println("GIÁ CỦA XE: " + giathanh + " VNĐ");
        System.out.println("HÃNG SẢN XUẤT XE: " + hangsanxuat);
    }
}
