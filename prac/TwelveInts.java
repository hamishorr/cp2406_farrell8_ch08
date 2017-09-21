import java.util.ArrayList;

public class TwelveInts {

public static void main(String[] args){

    ArrayList<Integer> intList = new ArrayList<Integer>(12);

    for(int i = 0; i < 12; i = i + 1){
        intList.add(i+1);
    }

    System.out.println(intList.toString());
    ArrayList<Integer> reverseIntList = new ArrayList<Integer>(12);

    for(int i = intList.size()-1; i>=0 ; i = i-1){
        reverseIntList.add(intList.get(i));
    }
    System.out.println(reverseIntList.toString());
}
}
