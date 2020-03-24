package nl.florianslob.model.checking.sandbox.graphvisualization;

import java.awt.*;
import javax.swing.*;

import com.kitfox.svg.SVGDiagram;
import com.kitfox.svg.SVGException;


public class GraphDrawer extends JFrame {
    private final SVGDiagram diagram;

    public GraphDrawer(String title, SVGDiagram diagram) {
        this.diagram = diagram;
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(1000, 1000);
    }

    public void paint(Graphics g) { // draw the nodes and edges
        try {
            diagram.render((Graphics2D) g);
        } catch (SVGException e) {
            e.printStackTrace();
        }
    }
}
