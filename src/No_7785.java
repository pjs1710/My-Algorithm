import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class No_7785 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());
        HashSet<String> hashSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String command = st.nextToken();
            if (command.equals("enter")) {
                hashSet.add(name);
            } else if (command.equals("leave")) {
                hashSet.remove(name);
            } else {
                return;
            }
        }
        List<String> list = new ArrayList<>(hashSet);
        list.sort(Collections.reverseOrder());

        for (String s : list) {
            System.out.println(s);
        }
    }
}
