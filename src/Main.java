import java.util.*;

public class Main {

    public static void main(String[] args) {
        // arraylist
        //  1 - 3  10 , 4  1
        //  2 - 5  5 , 6  30
        //  3 - 2  5 , 4  20
        //  4 - 6  25 ,
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int T = s.nextInt();


        ArrayList<Integer[]>[] inputs = new ArrayList[N+1];

        for(int i = 1;i<=T;i++){
            int index = s.nextInt();
            int node = s.nextInt();
            int weight = s.nextInt();
            Integer[] input = {node, weight};
            if(inputs[index] == null)
                inputs[index] = new ArrayList<>();
            inputs[index].add(input);
        }

        Queue<Integer> queue = new PriorityQueue<>();










    }
}
