public class PdfFactory extends DocFactory {

    @Override
    public Doc createDocument() {
        return new PdfDoc();
    }
}
