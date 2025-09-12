package Arrays.example1;

import java.util.ArrayList;

public class MultiDimArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();


        for (int i=0;i<3;i++){
            arrayLists.add(new ArrayList<>());
        };
        System.out.println(arrayLists);
    }
}
