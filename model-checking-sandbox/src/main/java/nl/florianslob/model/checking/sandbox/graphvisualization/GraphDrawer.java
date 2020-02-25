package nl.florianslob.model.checking.sandbox.graphvisualization;


import java.awt.geom.AffineTransform;
import java.util.*;
import java.awt.*;
import javax.swing.*;

import com.kitfox.svg.SVGDiagram;
import com.kitfox.svg.SVGException;
import nl.florianslob.model.checking.sandbox.graphvisualization.datastructure.Node;
import nl.florianslob.model.checking.sandbox.graphvisualization.datastructure.Edge;

public class GraphDrawer extends JFrame {
    private final SVGDiagram diagram;
    int nodeWidth;
    int nodeHeight;

    ArrayList<Node> nodes;
    ArrayList<Edge> edges;

    public GraphDrawer(String title, SVGDiagram diagram) {
        this.diagram = diagram;
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        nodeWidth = 30;
        nodeHeight = 30;

        this.setSize(1000,1000);
    }

    public void paint(Graphics g) { // draw the nodes and edges
        try {
            diagram.render((Graphics2D) g);
        } catch (SVGException e) {
            e.printStackTrace();
        }
    }
}
