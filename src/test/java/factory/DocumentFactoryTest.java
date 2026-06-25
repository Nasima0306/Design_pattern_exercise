package factory;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DocumentFactoryTest {
    @Test
    public void testWordFactory() {
        DocumentFactory factory = new WordFactory();
        Document document = factory.createDocument();

        assertNotNull(document);
        assertTrue(document instanceof WordDocument);
    }

    @Test
    public void testPdfFactory() {
        DocumentFactory factory = new PdfFactory();
        Document document = factory.createDocument();

        assertNotNull(document);
        assertTrue(document instanceof PdfDocument);
    }

    @Test
    public void testExcelFactory() {
        DocumentFactory factory = new ExcelFactory();
        Document document = factory.createDocument();

        assertNotNull(document);
        assertTrue(document instanceof ExcelDocument);
    }
}
