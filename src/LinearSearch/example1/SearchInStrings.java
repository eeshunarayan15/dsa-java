package LinearSearch.example1;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="Kunal";
        char target='t';
//      boolean res=  search(name,target);
//        System.out.println(res);
        boolean b = search2(name, target);
        System.out.println(b);
    }
    private static boolean search2(String name, char target) {
        if(name.length()==0){
            return  false;
        }
        for(char c:name.toCharArray()){
            if(c==target){
                return  true;
            }
        }
        return  false;
    }
    private static boolean search(String name, char target) {
        if(name.length()==0){
            return  false;
        }
        for(int i=0;i<name.length();i++){
            char c = name.charAt(i);
            if(c==target){
                return  true;
            }
        }
        return  false;
    }
}
