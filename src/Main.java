import Algorithm.Astar;
import Algorithm.GBFS;
import Algorithm.UCS;
import Util.Result;
import Util.Input;

public class Main {
    public static void main(String[] args) {
        Input input = new Input();
        Result hasil;

        if (input.getAlgorithmChoice() == 1) {
            hasil = Astar.resulting(input.getInputNode(), input.getTargetNode());
        } else if (input.getAlgorithmChoice() == 2) {
            hasil = GBFS.resulting(input.getInputNode(), input.getTargetNode());
        } else {
            hasil = UCS.resulting(input.getInputNode(), input.getTargetNode());
        }

        if (hasil.getPath() != null) {
            System.out.println("Lintasan : ");
            for (int i = 0; i < hasil.getPath().size(); i++) {
                System.out.println(hasil.getPath().get(i));
            }
            System.out.println("Panjang lintasan solusi : " + (hasil.getPath().size() - 1));
        } else {
            System.out.println("Path tidak ditemukan.");
        }

        System.out.println();
        System.out.println("Banyak node dikunjungi : " + hasil.getVisited());
        System.out.println("Durasi : " + hasil.getDuration() + " ms.");
    }
}
