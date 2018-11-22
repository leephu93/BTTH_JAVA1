package BAI1;

import java.util.Scanner;

public class BAI1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("KHAI BÁO SỐ LƯỢNG HỘ DÂN: ");
        int soluonghd = Integer.parseInt(scanner.nextLine());
        HODAN[] ar_hodan = new HODAN[soluonghd];
        System.out.println("*******************************************************");
        for (int i = 0; i < ar_hodan.length; i++) {
            System.out.println("HỘ DÂN " + (i + 1));
            System.out.print("NHẬP VÀO SỐ NHÀ: ");
            String sonha = scanner.nextLine();
            System.out.print("NHẬP VÀO SỐ NGƯỜI TRONG NHÀ: ");
            int songuoi = Integer.parseInt(scanner.nextLine());
            ar_hodan[i] = new HODAN(sonha, songuoi);
            ar_hodan[i].insertHODAN(i+1);
        }
    }
}
