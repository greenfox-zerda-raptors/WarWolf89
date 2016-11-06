/**
 * Created by almasics on 2016.11.04..
 */
public class Workshop09 {
    public static void main(String[] args) {
        int[] ag = new int[] { 3, 4, 5, 6, 7 };
        // please double all the elements of the list
        int i = 0;
        for (; i < ag.length; i++ ) {
            if (i==2){
                ag[2] = (ag[2]*2);
            }

            System.out.println(ag[i]);
        }
        i++;
        i++;
        i++;
        System.out.println(i);

//        for (int i = ag.length - 1; i >= 0; i--) {
//            int i1 = ag[i];

//        }

    }
}
