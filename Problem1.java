import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exec {

	public static void main(String[] args) throws IOException {

    	//Write code here
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br1.readLine());
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		String data = br2.readLine();
        String[] listElements = data.split(" ");
		if(listElements.length > n) {
			System.out.println("Invalid input");
		} else if(listElements.length <= n) {
            ArrayList<Integer> presentStudents = new ArrayList<>();
            List<String> absentStudents = new ArrayList<>();
            for(String element: listElements) {
                if(!presentStudents.contains(element)) {
                    presentStudents.add(Integer.parseInt(element));
                }
            }

            for(int i=1; i<=n;i++){
                if(!presentStudents.contains(i)) {
                    absentStudents.add(String.valueOf(i));
                }
            }
            System.out.println(absentStudents.stream().collect(Collectors.joining(" ")));
        }
   }

}
