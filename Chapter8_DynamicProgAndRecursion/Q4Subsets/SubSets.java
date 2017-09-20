package Chap8DynamicProgAndRecursion.Q4Subsets;

import java.util.ArrayList;

public class SubSets {

    private static ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> list, int index){
        ArrayList<ArrayList<Integer>> allSubsets;

        if(list.size() == index){
            allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<>());
        }
        else{
            allSubsets = getSubsets(list, index +1);
            int item = list.get(index);
            ArrayList<ArrayList<Integer>> moreSubsets = new ArrayList<>();
            for(ArrayList<Integer> subSet : allSubsets){
                ArrayList<Integer> newSubset = new ArrayList<>();
                newSubset.addAll(subSet);
                newSubset.add(item);
                moreSubsets.add(newSubset);
            }
            allSubsets.addAll(moreSubsets);
        }
        return allSubsets;
    }

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        ArrayList<ArrayList<Integer>> subsets = getSubsets(arrayList, 0);

        System.out.println(subsets.toString());

    }
}
