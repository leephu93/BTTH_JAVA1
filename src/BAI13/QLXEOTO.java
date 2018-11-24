package BAI13;

import java.util.ArrayList;
import java.util.Scanner;

public class QLXEOTO {

    public static void main(String[] args) {
//        XEOTO xoto = new XEOTO();
//        xoto.NHAPTHONGTINXE();
//        xoto.XEMTHONGTINXE();

        Scanner scanner = new Scanner(System.in);
        ArrayList<XEOTO> ar_xoto = new ArrayList<>();
        System.out.print("KHAI BÁO SỐ LƯỢNG XE OTO MUỐN NHẬP: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(">>> XE OTO THỨ " + (i + 1));
            XEOTO xoto = new XEOTO();
            xoto.NHAPTHONGTINXE();
            ar_xoto.add(xoto);
        }
        
        System.out.println("**********HIỂN THỊ XE OTO ĐÃ NHẬP**********");
        int count = 0;
        for (Object item : ar_xoto) {
            if (item instanceof XEOTO) {
                count++;
                System.out.println(">>> XE OTO THỨ " + count);
                ((XEOTO) item).XEMTHONGTINXE();
            }
        }

        System.out.println("**********HIỂN THỊ XE OTO CÓ GIÁ CAO NHẤT**********");
        double max = 0;
        XEOTO xoto = new XEOTO();
        for (Object item : ar_xoto) {
            if (item instanceof XEOTO) {
                if (((XEOTO) item).giathanh > max) {
                    max = ((XEOTO) item).giathanh;
                    xoto = (XEOTO) item;
                }
            }
        }
        xoto.XEMTHONGTINXE();

        System.out.println("**********HIỂN THỊ XE OTO DÒNG FORD CÓ GIÁ HƠN 200 TRIỆU ĐỒNG**********");
        int count1 = 0;
        for (Object item : ar_xoto) {
            if (item instanceof XEOTO) {
                if (((XEOTO) item).hangsanxuat.equals("FORD") && ((XEOTO) item).giathanh > (double) 200000000) {
                    count1++;
                    System.out.println(">>> XE OTO THỨ " + count1);
                    ((XEOTO) item).XEMTHONGTINXE();
                }
            }
        }

        System.out.println("**********HIỂN THỊ XE OTO GIẢM DẦN THEO SỐ GHẾ**********");
        int count2 = 0;
        for (int i = 0; i < ar_xoto.size() - 1; i++) {
            for (int j = i + 1; j < ar_xoto.size(); j++) {
                if (ar_xoto.get(i).soghe < ar_xoto.get(j).soghe) {
                    XEOTO xeoto = new XEOTO();
                    xeoto = ar_xoto.get(i);
                    ar_xoto.set(i, ar_xoto.get(j));
                    ar_xoto.set(j, xeoto);
                }
            }
        }
        for (Object item : ar_xoto) {
            count2++;
            System.out.println(">>> XE OTO THỨ " + count2);
            if (item instanceof XEOTO) {
                ((XEOTO) item).XEMTHONGTINXE();
            }
        }
    }
}
