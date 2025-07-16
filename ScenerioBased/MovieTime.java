import java.util.*;
public class MovieTime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter Movie Names :");
        String [] movieName=new String[n];
        for(int i=0;i<n;i++){
            movieName[i]=sc.next();
        }
        System.out.println("Enter Movie Show Times :");
        String[] showTime=new String[n];
        for(int i=0;i<n;i++){
            showTime[i]=sc.next();
        }
        

        Insertion(showTime,movieName);
    }
    public static void Insertion(String[] showTime, String[] movieName) {
        int n = showTime.length;
        for (int i = 1; i < n; i++) {
            String key = showTime[i];
            String keyMovie = movieName[i];
            int j = i - 1;

            while (j >= 0 && showTime[j].compareTo(key) > 0) {
                showTime[j + 1] = showTime[j];
                movieName[j + 1] = movieName[j];
                j--;
            }
            showTime[j + 1] = key;
            movieName[j + 1] = keyMovie;
        }

        System.out.println("Movie Show Times:");
        for (int i = 0; i < n; i++) {
            System.out.println(movieName[i] + " " + showTime[i]);
        }
    }
}