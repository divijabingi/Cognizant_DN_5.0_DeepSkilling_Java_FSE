public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println(">> Excel Document is ready for data entry!");
        System.out.println("   Format: .xlsx | App: MS Excel");
    }
    @Override
    public void close() {
        System.out.println("   Excel Document closed.\n");
    }
}
