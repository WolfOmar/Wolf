
public class Exercise17 {

	    /** 
	     * 用JAVA实现字符串压缩算法。 将字符串 aaabcdda 编程实现将其转换为 3a1b1c2d1a ； 
	     *  
	     * @param str 
	     *            需要转换的字符串 
	     * @return string 
	     */  
	    public static String stringToReduce(final String str)  
	    {  
	        //   
	        StringBuffer result = new StringBuffer();  
	  
	        // 计算字符串长度  
	        final int count = str.length();  
	  
	        // 取第一个字符  
	        char c1 = str.charAt(0);  
	  
	        // 连续字符的个数  
	        int sum = 1;  
	        for (int i = 1; i < count; i++)  
	        {  
	            // 循环取字符  
	            char c2 = str.charAt(i);  
	  
	            // 把前一个字符和当前字符比较  
	            if (c1 == c2)  
	            {  
	                // 相同的只个数加一  
	                sum++;  
	                continue;  
	            }  
	  
	            // 拼接字符  
	            result.append(sum).append(c1);  
	  
	            // 当前字符变为前一字符  
	            c1 = c2;  
	  
	            // 个数清零  
	            sum = 1;  
	        }  
	  
	        // 加上最后一个字符及个数  
	        result.append(sum).append(c1);  
	  
	        return result.toString();  
	    }  
	  
	    public static void main(String[] args)  
	    {  
	        System.out.println(stringToReduce("aaabcddabddd"));  
	    }  
	}  

