import java.util.*;

public class Solution {
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    public Solution(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();
        String[] result = magazine.split(" ");
        String token = "";
        for (int x = 0; x < result.length; x++) {
            token = result[x];
            if(magazineMap.containsKey(token)) {
                
                int count = magazineMap.get(token);
                magazineMap.put(token,count + 1);
            } else {
                magazineMap.put(token,1);
            }
        }
        
        String[] result2 = note.split(" ");
        for (int x=0; x < result2.length; x++) {
            token = result2[x];
            if(noteMap.containsKey(token)) {
                
                int count = noteMap.get(token);
                noteMap.put(token,count + 1);
            } else {
                noteMap.put(token,1);
            }
        }
         
    }
    
    public boolean solve() {
        if(magazineMap.size() < noteMap.size()) {
            return false;
        } else {
            Set<String> words = noteMap.keySet();

            for(String word : words) {
                int count = noteMap.get(word);
                
                if(magazineMap.containsKey(word)) {
                    int count2 = magazineMap.get(word);
                    if(count2 < count) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        String magazine = scanner.nextLine();
        String note = scanner.nextLine();
        Solution s = new Solution(magazine, note);
        scanner.close();
        
        boolean answer = s.solve();
        //boolean answer = false;
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}
