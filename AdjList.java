import java.util.ArrayList;
public class AdjList {
    public static void main(String[] args) {
        int v = 5;
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(v);

        for (int i = 0; i < v; i++) {
            arr.add(new ArrayList<>());
        }

        arr.get(0).add(1);
        arr.get(0).add(3);
        arr.get(1).add(2);
        arr.get(1).add(0);
        arr.get(2).add(3);
        arr.get(2).add(4);
        arr.get(3).add(0);
        arr.get(3).add(2);
        arr.get(4).add(3);
        arr.get(4).add(2);
    
        print(arr);
    }

    public static void print(ArrayList<ArrayList<Integer>> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j : arr.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
