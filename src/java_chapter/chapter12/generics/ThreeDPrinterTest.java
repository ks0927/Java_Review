package java_chapter.chapter12.generics;

public class ThreeDPrinterTest {
    public static void main(String[] args) {
/*
		TreeDPrinter printer = new TreeDPrinter();

		printer.setMaterial(new Powder());

		Powder powder = (Powder)printer.getMaterial(); //다운캐스팅 해줘야댐, 업캐스팅 되어있으니까
		*/

        ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
        printer.setMaterial(new Powder());
        Powder powder = printer.getMaterial();
        System.out.println(printer);

        ThreeDPrinter<Plastic> printerP = new ThreeDPrinter<Plastic>();
        printerP.setMaterial(new Plastic());
        Plastic plastic = printerP.getMaterial();
        System.out.println(printerP);

        ThreeDPrinter<Water> printerW = new ThreeDPrinter<Water>();
        printerW.setMaterial(new Water());
        System.out.println(printerW);
    }
}
