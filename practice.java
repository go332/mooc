import java.util.ArrayList;
import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        //mean,mode,median
//a series of numbers are taken as an input, transposed in a list and then processed to give the three statistical averages.
        //at first will take the numbers one at a time, then can be implemented to take a list of numbers as input.
        Scanner input = new Scanner(System.in);
        ArrayList<Double> data = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            data.add(input.nextDouble());
        }
        mean(data);
        System.out.println(data + "size" + data.size() + "mean" + mean(data)+"ORDEREDLIST"+median(data));
    }

    public static double mean(ArrayList<Double> list) {
        double sum = 0;
        for(double number:list){
            sum=sum+number;
        }
        return sum / list.size();
    }
    public static double min(ArrayList<Double> list){
        double min=list.get(0);
        for (int i=1;i<list.size();i++){
            if(list.get(i)<min){min=list.get(i);}
        }
        return min;
    }
    public static double max(ArrayList<Double> list){
        double max=list.get(0);
        for (int i=0;i<list.size();i++){
            if(list.get(i)>max){max=list.get(i);}
        }
        return max;
    }
    public static ArrayList<Double> median(ArrayList<Double> list){
        //first i need to order the elements of the list
        ArrayList<Double> orderedlist=new ArrayList<>();
        for (int i=0;i<list.size();i++
             ) {
            orderedlist.add(min(list));
            list.remove(min(list));
        }
        return orderedlist;
    }
}
