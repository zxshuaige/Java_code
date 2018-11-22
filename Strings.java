//String类扩展功能实现
public class Strings{
	
    public static void main(String[] args){
        String str1 = null;
        String str2 = new String("wo_shi_xi_ha");

        //测试repeat()
        String str3 = repeat('y',10);
        System.out.println("重复字符后的字符串为：" + str3);

        //测试fillBefore()  fillAfter()
        System.out.println("前填充的字符串为：" + fillBefore(str1, 'Y', 15));
        System.out.println("前填充的字符串为：" + fillBefore(str2, 'Y', 15));
        System.out.println("后填充的字符串为：" + fillAfter(str1, 'Y', 15));
        System.out.println("后填充的字符串为：" + fillAfter(str2, 'Y', 15));

        //测试 removeAll()  reverse()
        System.out.println("移除后的字符串为：" + removeAll(str1, "_"));
        System.out.println("移除后的字符串为：" + removeAll(str2, "_"));
        System.out.println("反转后的字符串为：" + reverse(str1));
        System.out.println("反转后的字符串为：" + reverse(str2));
    }
    
     /**
     * 重复某个字符
     * 
     * 例如： 
     * 'a' 5   => "aaaaa"  
     * 'a' -1  => ""
     * 
     * @param c     被重复的字符
     * @param count 重复的数目，如果小于等于0则返回""
     * @return 重复字符字符串
     */
    public static String repeat(char c, int count) {
        if(count <= 0){
            return "";
        }
        char[] ch = new char[count];
        for(int i = 0; i < count; i++){
            ch[i] = c;
        }
        return new String(ch);
    }
    
    
     /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串
     * 字符填充于字符串前
     *
     * 例如： 
     * "abc" 'A' 5  => "AAabc"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
    public static String fillBefore(String str, char filledChar, int len) {
        if(str == null){
            return repeat(filledChar,len);
        }
       if(len <= str.length()){
           return str;
       }
       String newStr = repeat(filledChar, (len - str.length()));
       return  newStr+str;
    }
    
    /**
     * 将已有字符串填充为规定长度，如果已有字符串超过这个长度则返回这个字符串<br>
     * 字符填充于字符串后
     * 例如： 
     * "abc" 'A' 5  => "abcAA"
     * "abc" 'A' 3  => "abc"
     *
     * @param str        被填充的字符串
     * @param filledChar 填充的字符
     * @param len        填充长度
     * @return 填充后的字符串
     */
    public static String fillAfter(String str, char filledChar, int len) {
        if(str == null){
            return repeat(filledChar,len);
        }
        if(len <= str.length()){
            return str;
        }
        String newStr = repeat(filledChar, (len - str.length()));
        return  str+newStr;
    }

    /**
     * 移除字符串中所有给定字符串
     * 例：removeAll("aa-bb-cc-dd", "-") => aabbccdd
     *
     * @param str         字符串
     * @param strToRemove 被移除的字符串
     * @return 移除后的字符串
     */
    public static String removeAll(CharSequence str, CharSequence strToRemove) {
        if(str == null || str.toString().isEmpty()) {
            return "";
        }
		
        return str.toString().replaceAll(strToRemove.toString(),"");
    }
    
    /**
     * 反转字符串
     * 例如：abcd => dcba
     *
     * @param str 被反转的字符串
     * @return 反转后的字符串
     */
    public static String reverse(String str) {
        if(str == null || str.isEmpty()){
            return "";
        }
		char[] ch = str.toCharArray();
        int begin = 0;
		int end = str.length()-1;
		while(begin < end){
			char temp = ' ';
			temp = ch[begin];
			ch[begin] = ch[end];
			ch[end] = temp;
			begin++;
			end--;
		}
		String newStr = new String(ch);
		return newStr;
		//StringBuffer sb = new StringBuffer(str);

        //return sb.reverse().toString();
    }
    
    

}
