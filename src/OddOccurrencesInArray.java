import java.util.ArrayList;
import java.util.List;

public class OddOccurrencesInArray {

    List<Integer> list = new ArrayList<>();
    public int solution(int[] a){

        for (int i = 0; i < a.length; i++) {
            int num = a[i];
            if(list.contains(num)){
                list.remove(new Integer(num));
            }else{
                list.add(num);
            }

        }

        return list.getFirst();
    }

}
