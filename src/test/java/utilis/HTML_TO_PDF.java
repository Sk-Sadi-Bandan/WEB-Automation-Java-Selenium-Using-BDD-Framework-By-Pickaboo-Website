package utilis;

import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HTML_TO_PDF {

    public static void pdf_html() {

        try {
            // Paths to the HTML and PDF files
            String htmlSource = System.getProperty("user.dir") + "/Test_Automation_Report/html/overview.html";
            String pdfDest = System.getProperty("user.dir") + "/Test_Automation_Report/Test_Automation_Report.pdf";

            // Check if HTML file exists
            if (!Files.exists(Paths.get(htmlSource))) {
                System.err.println("HTML file not found: " + htmlSource);
                return;
            }

            // Converter properties to enable CSS processing and specify base URI for external resources
            ConverterProperties properties = new ConverterProperties();
            properties.setBaseUri(System.getProperty("user.dir") + "/Test_Automation_Report/html");

            // Convert HTML to PDF
            try (FileInputStream htmlStream = new FileInputStream(htmlSource);
                 FileOutputStream pdfStream = new FileOutputStream(pdfDest)) {
                HtmlConverter.convertToPdf(htmlStream, pdfStream, properties);
            }

            System.out.println("PDF generated successfully with HTML and CSS!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}