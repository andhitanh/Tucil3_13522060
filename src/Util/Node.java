package Util;
public class Node {
    private int weight;
    private int cost;
    private int heuristic;
    private String word;

    public Node(String word, int weight, int heuristic, int cost) {
        this.word = word;
        this.weight = weight;
        this.heuristic = heuristic;
        this.cost = cost;
    }

    // public void setChildNode (Node node) {
    //     this.children.add(node);
    // }

    // public List<Node> getChildren() {
    //     return this.children;
    // }

    public String getWord() {
        return this.word;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getCost() {
        return this.cost;
    }

    public int getHeuristic() {
        return this.heuristic;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setHeuristic(int heuristic) {
        this.heuristic = heuristic;
    }
}