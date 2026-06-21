public class Pdf implements Doc {
    @Override
    public void open() {
        System.out.println(" PDF Document is ready to view!");
        System.out.println("   Format: .pdf | App: PDF Reader");
    }
    @Override
    public void close() {
        System.out.println("   PDF Document closed.\n");
    }
}
