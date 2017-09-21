import java.util.ArrayList;

public class ArrayMethodDemo {

    public static void main(String[] args){

        ArrayList<Integer> intList = new ArrayList<Integer>(0);

        //generate values.. could also take input
        for(int i = 0; i < 10; i = i + 1){
            intList.add(i+1);
            displayInts(intList);
            displayReversed(intList);
            displayOverValue(intList,5);
            displayUnderValue(intList,5);
            
        }

    }

    public static void displayInts(ArrayList<Integer> list){
        System.out.println(list.toString());
    }

    public static void displayReversed(ArrayList<Integer> list){
        ArrayList<Integer> reverseIntList = new ArrayList<Integer>(0);

        for(int i = list.size()-1; i>=0 ; i = i-1){
            reverseIntList.add(list.get(i));
        }
        System.out.println(reverseIntList.toString());
    }

    public static void displaySum(ArrayList<Integer> list){
        int sum = 0;
        for(int number :list){
            sum = number + sum;
        }
        System.out.println(sum);
    }

    public static void displayOverValue(ArrayList<Integer> list, int value){
        ArrayList<Integer> overValueList = new ArrayList<Integer>(0);
        for(int i = 0; i<list.size() ; i = i+1){
            if(list.get(i)>value){
                overValueList.add(list.get(i));
        }}
        System.out.println(overValueList.toString());

    }

    public static void displayUnderValue(ArrayList<Integer> list, int value){
        ArrayList<Integer> underValueList = new ArrayList<Integer>(0);
        for(int i = 0; i<list.size() ; i = i+1){
            if(list.get(i)<value){
                underValueList.add(list.get(i));
            }}
        System.out.println(underValueList.toString());

    }

}
