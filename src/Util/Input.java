package Util;
import java.util.Scanner;

public class Input {
    private Node inputNode;
    private Node targetNode;
    private int algorithmChoice;

    public Input() {
        Scanner sc = new Scanner(System.in);
        String str1, str2;
        int algoChoice;
        System.out.print("Enter start word: ");
        str1 = sc.nextLine(); // Read start word
        do {
            System.out.print("Enter end word: ");
            str2 = sc.nextLine(); // Read end word

            // Check if str2 has the same length as str1
            if (str2.length() != str1.length()) {
                System.out.println("End word must have the same length as the start word.");
            }
        } while (str2.length() != str1.length()); // Repeat if lengths are different

        do {
            System.out.print("1. A* Algorithm\n2. Greedy Best First Search Algorithm\n3. Uniform Cost Search Algorithm\nEnter algorithm choice (1/2/3): ");
            algoChoice = sc.nextInt(); // Read integer input
        } while (algoChoice < 1 || algoChoice > 3);

        sc.close();

        this.inputNode = new Node(str1, 0, 0, 0);
        this.targetNode = new Node(str2, 0, 0, 0);
        this.algorithmChoice = algoChoice;
    }

    public Node getInputNode() {
        return this.inputNode;
    }

    public Node getTargetNode() {
        return this.targetNode;
    }

    public int getAlgorithmChoice() {
        return this.algorithmChoice;
    }
}
