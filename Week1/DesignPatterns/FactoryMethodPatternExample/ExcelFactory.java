public class ExcelFactory extends DocFactory {

    @Override
    public Doc createDocument() {
        return new ExcelDoc();
    }
}
