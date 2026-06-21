public class Main {

    public static void main(String[] args) {

        System.out.println("Document Management System\n");

        DocFactory wordFactory = new WordFactory();
        Doc wordDoc = wordFactory.createDocument();
        wordDoc.open();
        wordDoc.close();

        DocFactory pdfFactory = new PdfFactory();
        Doc pdfDoc = pdfFactory.createDocument();
        pdfDoc.open();
        pdfDoc.close();

        DocFactory excelFactory = new ExcelFactory();
        Doc excelDoc = excelFactory.createDocument();
        excelDoc.open();
        excelDoc.close();

        System.out.println("All Documents Processed");
    }
}
