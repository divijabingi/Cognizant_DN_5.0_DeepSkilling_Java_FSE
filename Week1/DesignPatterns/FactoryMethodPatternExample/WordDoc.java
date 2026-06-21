public class WordDoc implements Doc {

    @Override
    public void open() {
        System.out.println("Word Document is ready to edit!");
        System.out.println("Format: .docx | App: MS Word");
    }

    @Override
    public void close() {
        System.out.println("Word Document closed.\n");
    }
}
