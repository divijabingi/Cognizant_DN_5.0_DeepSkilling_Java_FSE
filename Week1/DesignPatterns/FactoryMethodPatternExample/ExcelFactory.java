public class ExcelFactory extends DocFactory {

    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
