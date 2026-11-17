public class Main {
    static void main(String[] args) {

        PrinterImpl printer = new PrinterImpl();

        PrinterImpl.Message message1 = new PrinterImpl.Message("Привіт!", "Іван");
        printer.print(message1);

        PrinterImpl.Message message2 = new PrinterImpl.Message("Як справи?", null);
        printer.print(message2);

        PrinterImpl.Message message3 = new PrinterImpl.Message(null, null);
        printer.print(message3);
    }
}