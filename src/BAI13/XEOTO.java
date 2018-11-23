package BAI13;

public class XEOTO extends XE {

    int soghe;

    @Override
    void NHAPTHONGTINXE() {
        super.NHAPTHONGTINXE();
        System.out.print("SỐ GHẾ TRONG XE: ");
        this.soghe = Integer.parseInt(scanner.nextLine());
    }

    @Override
    void XEMTHONGTINXE() {
        super.XEMTHONGTINXE();
        System.out.println("SỐ GHẾ TRONG XE: " + soghe + " GHẾ");
    }
}
