package ocr;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Test4J {
    public static void main(String[] args) throws TesseractException {
        final ITesseract instance = new Tesseract();
        instance.setDatapath("src/main/resources/ocr");
        instance.setLanguage("chi_sim");

        File imageLocation = new File("D:\\work\\OCR\\Test4J\\demo");
        for(File image : imageLocation.listFiles()){
            System.out.println(image.getName()+" -->"+instance.doOCR(image));
        }
    }

}
