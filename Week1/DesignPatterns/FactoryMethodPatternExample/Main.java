public class Main {
    public static void main(String[] args) {

        System.out.println(" Document Management System\n");
        DocumentFactory wordFactory = new WordFactory();
        Document wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();
        DocumentFactory pdfFactory = new PdfFactory();
         Document pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();
        DocumentFactory excelFactory = new ExcelFactory();
        Document excelDoc = excelFactory.createDocument();
          excelDoc.open();
        excelDoc.close();
        System.out.println(" All Documents Processed ");
    }
}
