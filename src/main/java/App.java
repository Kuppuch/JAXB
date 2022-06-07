import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class App {
    public static void main(String[] args) {
        try {
            Book book = new Book();

            book.setId(1);
            book.setName("ИИИМЯЯ");

            JAXBContext ctx = JAXBContext.newInstance(Book.class);
            Marshaller m = ctx.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(book, System.out);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
