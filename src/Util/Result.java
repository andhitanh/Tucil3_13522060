package Util;
import java.util.List;

public class Result {
    private int visited;
    private double duration;
    private List<String> path;

    public Result(int visited, double duration, List<String> path) {
        this.visited = visited;
        this.duration = duration;
        this.path = path;
    }

    public int getVisited() {
        return this.visited;
    }

    public List<String> getPath() {
        return this.path;
    }

    public double getDuration() {
        return this.duration;
    }
}
