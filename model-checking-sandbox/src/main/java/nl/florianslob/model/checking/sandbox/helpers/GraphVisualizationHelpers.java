package nl.florianslob.model.checking.sandbox.helpers;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.SourceStringReader;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class GraphVisualizationHelpers {
    public static final String rootFolderForSvgFiles = "generated_graph_svg_files";

    public static void saveSvgStringToFile(String fileContent, String fileName) throws Exception {
        SourceStringReader reader = new SourceStringReader(fileContent);
        final OutputStream svgFileOutputStream = new FileOutputStream(rootFolderForSvgFiles + "/" + fileName);
        reader.generateImage(svgFileOutputStream, new FileFormatOption(FileFormat.SVG));
        svgFileOutputStream.close();
    }
}
