import java.util.*;

public class exam2 {
    //1672
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentSum += accounts[i][j];
            }
            if (currentSum > max) {
                max = currentSum;
            }
        }
        return max;
    }

//422
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> rs = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                rs.add(nums[i]);
            } else {
                list.add(nums[i]);
            }
        }
        return rs;

    }

    //929
    public static int numUniqueEmails(String[] emails) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < emails.length; i++) {
            String convert = convertEmail(emails[i]);
            if (list.contains(convert)) {
                continue;
            }
            list.add(convert);
        }
        return list.size();
    }

    public static String convertEmail(String email) {
        String local = email.substring(0, email.indexOf("@"));
        if (local.contains("+")) {
            local = local.substring(0, email.indexOf("+"));
        }
        String domain = email.substring(email.indexOf("@"), email.length());
        local = local.replace(".", "");
        return local + domain;
    }


    //844
    public static boolean backspaceCompare(String s, String t) {
        return convertString(s).equals(convertString(t));
    }

    public static String convertString(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                if (stack.isEmpty()) {
                    continue;
                }
                stack.pop();
                continue;
            }
            stack.add(str.charAt(i));
        }
        String rs = "";
        for (Character s : stack) {
            rs += s;
        }
        return rs;
    }




//    public List<List<String>> findDuplicate(String[] paths) {
//        Map<String, List<String>> map = new HashMap<>();
//        for (int i = 0; i < paths.length; i++) {
//            String path = paths[i];
//            String convert = convertPath(path);
//            if (map.containsKey(convert)) {
//                map.get(convert).add(path.substring(0, path.indexOf("(")));
//            } else {
//                List<String> newListPath = new ArrayList<>();
//                newListPath.add(path.substring(0, path.indexOf("(")));
//                map.put(convert, newListPath);
//            }
//        }
//        List<List<String>> rs = new ArrayList<>();
//        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
//            rs.add(entry.getValue());
//        }
//        return rs;
//    }
//
//    public static String convertPath(String path) {
//        StringBuilder rs = new StringBuilder();
//        for (int i = path.length() - 1; i >= 0; i--) {
//            if (path.indexOf(i) == '(') {
//                break;
//            }
//            rs.append(path.indexOf(i));
//        }
//        return rs.reverse().toString();
//    }

//    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
//        Set<Integer> keySet = new HashSet<>();
//        int index = 0;
//        for (List<Integer> room : rooms
//        ) {
//            if (room.isEmpty()){
//                index++;
//                continue;
//            }
//            for (Integer key : room
//            ) {
//                keySet.add(key);
//            }
//            if (!keySet.contains(index) && index != 0) {
//                return false;
//            }
//            index++;
//        }
//        return true;
//    }

    public static void main(String[] args) {

    }
}
