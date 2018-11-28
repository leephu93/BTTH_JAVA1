package BAI15;

import java.util.Scanner;

public class CHUOIKYTU {

    Scanner scanner = new Scanner(System.in);
    String str;
    String str_term;

    CHUOIKYTU() {
        System.out.print("NHẬP VÀO 1 CHUỖI KÝ TỰ BẤT KỲ: ");
        this.str = scanner.nextLine();
        this.str_term = "";
    }

    void XEMCHUOI() {
        str = str.replaceAll(" ", "_");
        System.out.println("KẾT QUẢ SAU KHI NHẬP: " + str);
    }

    void DODAICHUOI() {
        System.out.println("ĐỘ DÀI CỦA CHUỖI SAU KHI NHẬP: " + str.length());
    }

    void CHUANHOACHUOI() {
        str = str.trim();
        String[] term = str.split("_");
        for (String item : term) {
            str_term += item;
        }
        System.out.println("XÓA KHOẢNG TRẮNG CỦA CHUỖI SAU KHI NHẬP: " + str_term);
    }

    void TUKETTHUCBANGG() {
        System.out.print("CÁC CHUỖI CÓ KÝ TỰ CUỐI LÀ G hoặc g :");
        str = str.trim();
        String[] term = str.split("_");
        for (String item : term) {
            for (int i = 0; i < item.length(); i++) {
                char xxx = item.charAt(item.length() - 1);
                if (xxx == 'G' || xxx == 'g') {
                    if (i < 1) {
                        System.out.print(" " + item + " ");
                    }
                }
            }
        }
        System.out.println();
    }

    void DAONGUOCCHUOI() {
        System.out.print("ĐẢO NGƯỢC CHUỖI : ");
        String[] ar_term = new String[str_term.length()];
        int count = 0;
        for (int i = str_term.length() - 1; i >= 0; i--) {
            count++;
            ar_term[count - 1] = Character.toString(str_term.charAt(i));
        }
        for (String item : ar_term) {
            System.out.print(item);
        }
        System.out.println();
    }

    void KKDOIXUNG() {
        System.out.print("CHUỖI CÓ ĐỐI XỨNG HAY KHÔNG? : ");
        String[] ar_term;
        int rs = str_term.length() / 2;
        ar_term = new String[rs];
        int count = 0;
        if (str_term.length() % 2 == 0) {
            for (int i = rs; i < str_term.length(); i++) {
                count++;
                ar_term[count - 1] = Character.toString(str_term.charAt(i));
            }
        } else {
            for (int i = rs + 1; i < str_term.length(); i++) {
                count++;
                ar_term[count - 1] = Character.toString(str_term.charAt(i));
            }
        }
        int count_rs = 0;
        int term = 0;
        for (int i = ar_term.length - 1; i >= 0; i--) {
            for (int j = 0; j < rs; j++) {
                if (i == j) {
                    term++;
                    if (ar_term[i].equals(Character.toString(str_term.charAt(term - 1)))) {
                        count_rs++;
                    }
                }
            }
        }
        if (count_rs == rs) {
            System.out.print("CHUỖI ĐỐI XỨNG !");
        } else {
            System.out.print("CHUỖI KHÔNG ĐỐI XỨNG !");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CHUOIKYTU chuoi = new CHUOIKYTU();
        chuoi.XEMCHUOI();
        chuoi.DODAICHUOI();
        chuoi.CHUANHOACHUOI();
        chuoi.TUKETTHUCBANGG();
        chuoi.DAONGUOCCHUOI();
        chuoi.KKDOIXUNG();
    }
}
