package nl.florianslob.model.checking.sandbox.graphvisualization;


import java.awt.geom.AffineTransform;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import nl.florianslob.model.checking.sandbox.graphvisualization.datastructure.Node;
import nl.florianslob.model.checking.sandbox.graphvisualization.datastructure.Edge;

public class GraphDrawer extends JFrame {
    int nodeWidth;
    int nodeHeight;

    ArrayList<Node> nodes;
    ArrayList<Edge> edges;

    public GraphDrawer(String title) {
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
        nodeWidth = 30;
        nodeHeight = 30;

        this.setSize(1000,1000);
    }


    public void addNode(Node node) {
        nodes.add(node);
        this.repaint();
    }

    public void addEdge(Node fromNode, Node toNode) {
        //add an edge between nodes
        edges.add(new Edge(fromNode, toNode));
        this.repaint();
    }


    // This is a dirty hack to show directions of edges.
    // Since it is only for debugging purposes, I will not create a decent solution
    public static Shape createArrowShape(Point fromPt, Point toPt) {
        Polygon arrowPolygon = new Polygon();
        arrowPolygon.addPoint(2,0);
        arrowPolygon.addPoint(2,1);
        arrowPolygon.addPoint(3,0);
        arrowPolygon.addPoint(2,-1);
        arrowPolygon.addPoint(2,0);

        Point midPoint = midpoint(fromPt, toPt);

        double rotate = Math.atan2(toPt.y - fromPt.y, toPt.x - fromPt.x);

        AffineTransform transform = new AffineTransform();
        transform.translate(midPoint.x, midPoint.y);
        double ptDistance = fromPt.distance(toPt);
        double scale = ptDistance / 12.0; // 12 because it's the length of the arrow polygon.
        transform.scale(scale, scale);
        transform.rotate(rotate);

        return transform.createTransformedShape(arrowPolygon);
    }

    private static Point midpoint(Point p1, Point p2) {
        return new Point((int)((p1.x + p2.x)/2.0),
            (int)((p1.y + p2.y)/2.0));
    }

    public void paint(Graphics g) { // draw the nodes and edges
        FontMetrics f = g.getFontMetrics();
        int nodeHeight = Math.max(this.nodeHeight, f.getHeight());

        g.setColor(Color.black);

        for (Edge e : edges) {
            g.drawLine(e.fromNode.x, e.fromNode.y,
                e.toNode.x, e.toNode.y);

            Shape arrow = createArrowShape(new Point(e.fromNode.x,e.fromNode.y), new Point(e.toNode.x,e.toNode.y));
            // need to cast to Graphics2D to be able to draw custom shape.
            ((Graphics2D) g ).draw(arrow);
        }

        for (Node n : nodes) {
            int nodeWidth = Math.max(this.nodeWidth, f.stringWidth(n.text) + this.nodeWidth / 2);

            g.setColor(Color.white);
            g.fillOval(n.x - nodeWidth / 2, n.y - nodeHeight / 2,
                nodeWidth, nodeHeight);

            g.setColor(Color.black);
            g.drawOval(n.x - nodeWidth / 2, n.y - nodeHeight / 2,
                nodeWidth, nodeHeight);

            g.drawString(n.text, n.x - f.stringWidth(n.text) / 2,
                n.y + f.getHeight() / 2);
        }
    }
}
