/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author leeph
 */
public class KHACHSAN {

    Scanner scanner = new Scanner(System.in);

    void nhapTT() {
        System.out.print("KHAI BÁO SỐ LƯỢNG KHÁCH LƯU TRÚ: ");
        int slkh = Integer.parseInt(scanner.nextLine());
        KHACHHANG[] kh = new KHACHHANG[slkh];
        System.out.println("_________________________________________");
        for (int i = 0; i < kh.length; i++) {
            System.out.print("NHẬP HỌ & TÊN KHÁCH HÀNG: ");
            String hoten = scanner.nextLine();
            System.out.print("NHẬP NĂM SINH KHÁCH HÀNG: ");
            int namsinh = Integer.parseInt(scanner.nextLine());
            System.out.print("NHẬP SỐ CMND KHÁCH HÀNG: ");
            String cmnd = scanner.nextLine();
            System.out.print("NHẬP SỐ NGÀY Ở: ");
            int spo = Integer.parseInt(scanner.nextLine());
            System.out.print("NHẬP LOẠI PHÒNG Ở: ");
            String lpo = scanner.nextLine();
            System.out.print("NHẬP GIÁ PHÒNG: ");
            double gp = Double.parseDouble(scanner.nextLine());
            kh[i] = new KHACHHANG(hoten, namsinh, cmnd, spo, lpo, gp);
        }
        xuatTT(kh);
    }

    void xuatTT(KHACHHANG[] kh) {
        System.out.println("_________________________________________");
        for (int i = 0; i < kh.length; i++) {
            System.out.println("KHÁCH HÀNG SỐ " + (i + 1));
            System.out.println("HỌ & TÊN KHÁCH HÀNG: " + kh[i].hoten);
            System.out.println("NĂM SINH KHÁCH HÀNG: " + kh[i].namsinh);
            System.out.println("SỐ CMND KHÁCH HÀNG: " + kh[i].cmnd);
            System.out.println("SỐ NGÀY Ở: " + kh[i].songayo);
            System.out.println("LOẠI PHÒNG Ở: " + kh[i].loaiphongo);
            System.out.println("GIÁ PHÒNG: " + kh[i].giaphong);
        }
    }
}
