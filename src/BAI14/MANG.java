/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI14;

import java.util.Scanner;

/**
 *
 * @author leeph
 */
public class MANG {

    Scanner scanner = new Scanner(System.in);
    private int n;
    private int A[];

    void NHAPDL() {
        System.out.print("NHẬP SỐ PHẦN TỬ TRON MẢNG: ");
        this.n = scanner.nextInt();
        this.A = new int[n];
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            count++;
            System.out.print("NHẬP PHẦN TỬ THỨ " + count + " : ");
            int input_val = scanner.nextInt();
            A[count - 1] = input_val;
        }
    }

    void XUATDL() {
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    void LKSNT() {
        for (int i = 0; i < A.length; i++) {
            int count = 0;
            for (int j = 1; j <= A[i]; j++) {
                if (A[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(A[i]);
            }
        }
    }

    void LKSHH() {
        for (int i = 0; i < A.length; i++) {
            int total = 0;
            for (int j = 1; j < A[i]; j++) {
                if (A[i] % j == 0) {
                    total = total + j;
                }
            }
            if (total == A[i]) {
                System.out.println("SỐ " + A[i] + " LÀ SỐ HOÀN HẢO!");
            }
        }
    }

    void SXGD() {
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] < A[j]) {
                    int term = A[i];
                    A[i] = A[j];
                    A[j] = term;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
    }

    void Y2() {
        System.out.print("NHẬP SỐ PHẦN TỬ TRON MẢNG: ");
        this.n = scanner.nextInt();
        this.A = new int[n];
        boolean ck = true;
        for (int i = 0; i < A.length; i++) {
            System.out.print("NHẬP PHẦN TỬ THỨ " + (i + 1) + " : ");
            int input_val = scanner.nextInt();
            if (2 <= input_val && 100 >= input_val) {
                A[i] = input_val;
            } else {
                ck = false;
                break;
            }
        }
        if (ck) {
            for (int i = 0; i < A.length - 1; i++) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[i] > A[j]) {
                        int term = A[i];
                        A[i] = A[j];
                        A[j] = term;
                    }
                }
            }
            System.out.println("MẢNG SAU KHI SẮP XẾP TĂNG DẦN: ");
            for (int i = 0; i < A.length; i++) {
                System.out.println(A[i]);
            }
        } else {
            System.out.println(" --->>> SỐ KHÔNG HỢP LỆ !");
        }
    }

    public static void main(String[] args) {
        MANG mang = new MANG();
//        mang.NHAPDL();
//        System.out.println("MẢNG TRƯỚC KHI SẮP XẾP: ");
//        mang.XUATDL();
//        mang.LKSNT();
//        mang.LKSHH();
//        System.out.println("MẢNG SAU KHI SẮP XẾP GIẢM DẦN: ");
//        mang.SXGD();
        mang.Y2();
    }
}
