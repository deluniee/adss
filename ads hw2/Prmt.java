import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Prmt {

    public static void main(String[] args) {
        Romdom<String> q = new Romdom<String>();
        int k = Integer.valueOf(args[0]);
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            q.enqueue(item);
        }
        while (k > 0){
            StdOut.println(q.dequeue());
            k--;
        }
    }

}