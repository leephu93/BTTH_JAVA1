package BAI11;

import java.util.Scanner;

public class MATRAN {

    static Scanner in = new Scanner(System.in);
    int SD, SC;
    int[][] matran;
    static int total;

    public MATRAN() {
        MATRAN.total = 0;
    }

    public MATRAN(int SD, int SC) {
        this.SD = SD;
        this.SC = SC;
        matran = new int[SD][SC];
    }

    public void NHAPDL() {
        for (int i = 0; i < SD; i++) {
            for (int j = 0; j < SC; j++) {
                System.out.printf("PHẦN TỬ VỊ TRÍ (%d,%d): ", i, j);
                matran[i][j] = in.nextInt();
            }
        }
    }

    public void XUATDL() {
        System.out.println("HIỂN THỊ MA TRẬN ĐÃ NHẬP: ");
        for (int i = 0; i < SD; i++) {
            for (int j = 0; j < SC; j++) {
                System.out.print(" " + matran[i][j] + " ");
                total += matran[i][j];
            }
            System.out.println();
        }
    }

    static public void TONGMATRAN() {
        System.out.println("TỔNG CỦA 2 MA TRẬN: " + total);
    }

    public static void main(String[] args) {
        System.out.println("NHẬP MA TRẬN 1: ");
        System.out.print("NHẬP SỐ DÒNG: ");
        int sodong1 = in.nextInt();
        System.out.print("NHẬP SỐ CỘT: ");
        int socot1 = in.nextInt();
        MATRAN mt1 = new MATRAN(sodong1, socot1);
        mt1.NHAPDL();
        mt1.XUATDL();
        System.out.println("NHẬP MA TRẬN 2: ");
        System.out.print("NHẬP SỐ DÒNG: ");
        int sodong2 = in.nextInt();
        System.out.print("NHẬP SỐ CỘT: ");
        int socot2 = in.nextInt();
        MATRAN mt2 = new MATRAN(sodong2, socot2);
        mt2.NHAPDL();
        mt2.XUATDL();
        TONGMATRAN();
    }

}
