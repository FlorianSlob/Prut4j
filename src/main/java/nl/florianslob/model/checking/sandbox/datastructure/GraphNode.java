/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.florianslob.model.checking.sandbox.datastructure;

/**
 *
 * @author FlorianSlob
 */
public class GraphNode {
    public String father;
    public String name;
    public String[] incomingEdges;
    public TemporalProperty[] newTemporalProperties;
    public TemporalProperty[] oldTemporalProperties;
    public TemporalProperty[] nextTemporalProperties;
}
