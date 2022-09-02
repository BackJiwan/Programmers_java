package Report_Results;
/*
 * 1. reportInfo = 신고자가 누구를 신고했는지
 * 2. reportedCount = 피신고자가 몇번 신고 당했는지
 * 3. reportInfo = 중복 신고를 1회로 처리하기 위해서 Set을 사용
 * 4.
 * 4. reportedCount =
*/
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        HashMap<String, HashSet<String>> reporterInfo = new HashMap<>();
        HashMap<String, Integer> reportedCount = new HashMap<>();
        HashSet<String> reportSet = new HashSet<>(Arrays.asList(report));

        for(String reportInfo : reportSet){
            String reporter = reporterInfo.split(" ")
        }

        return answer;
    }
}
