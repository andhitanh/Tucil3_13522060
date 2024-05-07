package Algorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import Util.DictionaryChecker;
import Util.Node;
import Util.Result;

import java.util.List;

public class GBFS {
    public static Result resulting(Node startWord, Node endWord) {
        Map<Node, Node> parent = new HashMap<>();
        Map<String, Boolean> visited = new HashMap<>();

        String candidateWord = null;
        int nodeCount = 0;

        PriorityQueue<Node> pq = new PriorityQueue<Node>(Comparator.comparingInt(Node::getHeuristic));

        pq.add(startWord);
        
        long startTime = System.nanoTime(); // Record start time
        Node currentWord = null;
        while (!pq.isEmpty()) {
            currentWord =  pq.poll();
            visited.put(currentWord.getWord(), true);
            nodeCount++;

            if (currentWord.getWord().equals(endWord.getWord())) {
                break;
            }

            for (int j = 0; j < startWord.getWord().length(); j++) {
                for (char c = 'a'; c <= 'z'; c++) {
                    if (j == 0) {
                        candidateWord = c + currentWord.getWord().substring(1, startWord.getWord().length());
                    } else if (j == currentWord.getWord().length() - 1) {
                        candidateWord = currentWord.getWord().substring(0, j) + c;
                    } else {
                        candidateWord = currentWord.getWord().substring(0, j) + c + currentWord.getWord().substring(j + 1, startWord.getWord().length());
                    }
                    
                    if (candidateWord != currentWord.getWord() && !visited.containsKey(candidateWord)) {
                        if (DictionaryChecker.isExist(candidateWord)) {                    
                            int heuristic = DictionaryChecker.differentChar(candidateWord, endWord.getWord());
                            Node child = new Node(candidateWord, 0, heuristic, 0);
                            parent.put(child, currentWord);
                            pq.add(child);
                        }
                    } 
                }
            }
        }

        long endTime = System.nanoTime(); 
        double runtime = (double)(endTime - startTime)/1000000; 

        if (pq.size() != 0) {
            List<String> path = new ArrayList<>();
            while (currentWord != null) {
                path.add(currentWord.getWord());
                currentWord = parent.get(currentWord);
            }
            Collections.reverse(path);
            return new Result(nodeCount, runtime, path);
        } else {
            if (currentWord.getCost() == 0) {
                List<String> path = new ArrayList<>();
                path.add(currentWord.getWord());
                System.out.println("Kata awal dan kata target sama.");
                return new Result(nodeCount, runtime, path);
            }
            return new Result(nodeCount, runtime, null);
        }
    }
}

