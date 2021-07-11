package techmahindra;
import java.util.*;

public class Sort {
    public int[] sort(int[] array,int N){
        int[] result= new int[N];

        //  Creating two arraylist of type integer

        ArrayList<Integer> Even=new ArrayList<Integer>();
        ArrayList<Integer> Odd=new ArrayList<Integer>();

        //Adding element to arraylist

        for(int i=0;i<N;i++){
            if(array[i]%2==0){
                Even.add(array[i]);
            }else{
                Odd.add(array[i]);
            }
        }

        //  Creating two arraylist of type integer

        ArrayList<Integer> Oeven=new ArrayList<Integer>();
        ArrayList<Integer> Peven=new ArrayList<Integer>();


        for(int i=0;i<Even.size();i++){

            //Sorting the even array list
            //The number which are divisible by 5 and even comes first and also in decending order
            //the number which are not divisible by 5 but are even comes after also in deceding order

            if(Even.get(i)%5==0){
            Oeven.add(Even.get(i));
            }else
            { Peven.add(Even.get(i));
            }
        }

        Collections.sort(Oeven,Collections.reverseOrder());
        Collections.sort(Peven,Collections.reverseOrder());

        //Merging all the ArrayList into a single one.

        Oeven.addAll(Peven);
        Oeven.addAll(Odd);

//changing wrapper class element to int array

        Iterator it=Oeven.iterator();
        while(it.hasNext()){
            for(int i=0;i<Oeven.size();i++){
                result[i]= (int) it.next();
            }
        }
        return result;
    }

public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
      //  int n= scan.nextInt();

        String s=scan.nextLine();
        int n=s.length();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
         //   arr[i]=Integer.parseInt(s.charAt(i));
        }
        Sort sort=new Sort();
        int[] res=sort.sort(arr,n);
        System.out.println(Arrays.toString(res));

}


}
