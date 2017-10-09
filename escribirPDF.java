import java.io.*;
import com.itextpdf.text.*;

public class escribirPDF{

	public static void main(String[] args) throws DocumentException, IOException{
		new escribirPDF().createPdf("PDF.pdf");			
	}

	public void createPdf(String archivo)throws DocumentException, IOException{
		Document doc=new Document();
		PdfWriter.getInstance(doc, new FileOutputStream(archivo));
		doc.open();
		doc.add(new Paragraph("He creado un PDF :v"));
		doc.close();
	}
}