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
        boolean validInput = true;

        do {
            validInput = true;
            System.out.print("Kata awal: ");
            str1 = sc.nextLine().trim();
            int lastSpaceIndex1 = str1.lastIndexOf(' ');
            if (lastSpaceIndex1 != -1 && lastSpaceIndex1 == str1.length() - 1) {
                str1 = str1.substring(0, lastSpaceIndex1).trim();
            }

            System.out.print("Kata target: ");
            str2 = sc.nextLine().trim();
            int lastSpaceIndex2 = str2.lastIndexOf(' ');
            if (lastSpaceIndex2 != -1 && lastSpaceIndex2 == str2.length() - 1) {
                str2 = str2.substring(0, lastSpaceIndex2).trim();
            }

            if (str2.length() != str1.length()) {
                System.out.println("Panjang kata awal dan kata target haruslah sama!");
                validInput = false;
            }
            if (str1.contains(" ") || str2.contains(" ")) {
                System.out.println("Kata masukan hanya boleh terdiri dari satu kata! Tidak boleh ada spasi di antara huruf masukan!");
                validInput = false;
            }
            if (!str1.matches("[a-zA-Z]+") || !str2.matches("[a-zA-Z]+")) {
                System.out.println("Kata masukan hanya boleh tersusun atas huruf alfabetis!");
                validInput = false;
            }
            if (!DictionaryChecker.isExist(str1)) {
                System.out.println("Kata awal tidak ada dalam kamus.");
                validInput = false;
            }
            if (!DictionaryChecker.isExist(str2)) {
                System.out.println("Kata target tidak ada dalam kamus.");
                validInput = false;
            }
            
        } while (!validInput);
        System.out.println();

        do {
            System.out.print("1. A* Algorithm\n2. Greedy Best First Search Algorithm\n3. Uniform Cost Search Algorithm\nPilih algoritma penyelesaian (1/2/3): ");
            try {
                algoChoice = sc.nextInt();
                if (algoChoice < 1 || algoChoice > 3) {
                    System.out.println("Mohon masukkan angka 1/2/3!");
                }
            } catch (Exception e) {
                System.out.println("Mohon masukkan integer!");
                sc.next();
                algoChoice = 0; 
            }
        } while (algoChoice < 1 || algoChoice > 3);

        sc.close();

        this.inputNode = new Node(str1, 0, 0, 0);
        this.targetNode = new Node(str2, 0, 0, 0);
        this.algorithmChoice = algoChoice;
        System.out.println();
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
