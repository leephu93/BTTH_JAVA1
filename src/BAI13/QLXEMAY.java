package BAI13;

import java.util.Scanner;

public class QLXEMAY {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        XEMAY xm = new XEMAY();
//        xm.NHAPTHONGTINXE();
//        xm.XEMTHONGTINXE();

        System.out.print("KHAI BÁO SỐ LƯỢNG XE MÁY CẦN NHẬP: ");
        int n = Integer.parseInt(scanner.nextLine());
        XEMAY[] ar_xemay = new XEMAY[n];
        System.out.println("**********KHAI BÁO XE MÁY**********");
        for (int i = 0; i < ar_xemay.length; i++) {
            System.out.println(">>> XE MÁY THỨ " + (i + 1));
            XEMAY xm = new XEMAY();
            xm.NHAPTHONGTINXE();
            ar_xemay[i] = xm;
        }
        System.out.println("**********HIỂN THỊ XE MÁY ĐÃ NHẬP**********");
        int count = 0;
        
        //HIỂN THỊ THÔNG TIN TẤT CẢ XE MÁY ĐÃ NHẬP
        for (XEMAY item : ar_xemay) {
            count++;
            System.out.println(">>> XE MÁY THỨ " + count);
            if (item instanceof XEMAY) {
                ((XEMAY) item).XEMTHONGTINXE();
            }
        }

        //HIỂN THỊ CÁC XE MÁY TỪ HÃNG SẢN XUẤT XE YAMAHA
//        for (XEMAY item : ar_xemay) {
//            count++;
//            System.out.println(">>> XE MÁY THỨ " + count);
//            if (item instanceof XEMAY) {
//                if("YAMAHA".equals(((XEMAY) item).hangsanxuat)){
//                    ((XEMAY) item).XEMTHONGTINXE();
//                }
//            }
//        }

        //SẮP XẾP ĐỐI TƯỢNG GIẢM DẦN THEO GIÁ THÀNH XE
//        for (int i = 0; i < ar_xemay.length - 1; i++) {
//            for (int j = i + 1; j < ar_xemay.length; j++) {
//                if (ar_xemay[i].giathanh < ar_xemay[j].giathanh) {
//                    XEMAY xm = new XEMAY();
//                    xm = ar_xemay[i];
//                    ar_xemay[i] = ar_xemay[j];
//                    ar_xemay[j] = xm;
//                }
//            }
//        }
//        for (XEMAY item : ar_xemay) {
//            count++;
//            System.out.println(">>> XE MÁY THỨ " + count);
//            if (item instanceof XEMAY) {
//                ((XEMAY) item).XEMTHONGTINXE();
//            }
//        }

        //HIỂN THỊ THÔNG TIN XE MÁY CÓ GIÁ THÀNH LỚN NHẤT
//        float max = 0;
//        XEMAY xm = new XEMAY();
//        System.out.println(">>> XE MÁY CÓ GIÁ THÀNH CAO NHẤT");
//        for (XEMAY item : ar_xemay) {
//            if(item.giathanh > max){
//                max = item.giathanh;
//                xm = item;
//            }
//        }
//        xm.XEMTHONGTINXE();

        //HIỂN THỊ CÁC XE MÁY YAMAHA VÀ CÓ GIÁ TRÌNH CAO HƠN 15 TRIỆU ĐỒNG
//        for (XEMAY item : ar_xemay) {
//            if (item.hangsanxuat.equals("YAMAHA")) {
//                if (item.giathanh > (float) 15000000) {
//                    count++;
//                }
//            }
//        }
//        System.out.println(">>> HÃNG XE MÁY YAMAHA CÓ " + count + " CHIẾC GIÁ THÀNH CAO HƠN 15 TRIỆU ĐỒNG");
    }
}
