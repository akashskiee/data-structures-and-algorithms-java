//https://leetcode.com/problems/defanging-an-ip-address/

public class DefangIP {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < address.length(); i++){
            char c = address.charAt(i);
            if(c == '.') {
                sb.append("[.]");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
    
}
