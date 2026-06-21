public class WordFactory extends DocFactory {

    @Override
    public Doc createDocument() {
        return new WordDoc();
    }
}
