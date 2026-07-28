import java.util.List;
import java.util.ArrayList;

class Solution {
    public String simplifyPath(String path) {
     List<String> list = new ArrayList<>();
        
        for (String dir : path.split("/")) {
            if (dir.isEmpty() || dir.equals(".")) {
                continue;
            }
            if (dir.equals("..")) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(dir);
            }
        }
        
        return "/" + String.join("/", list);
    }   
    }
