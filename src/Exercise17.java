
public class Exercise17 {

	    /** 
	     * ��JAVAʵ���ַ���ѹ���㷨�� ���ַ��� aaabcdda ���ʵ�ֽ���ת��Ϊ 3a1b1c2d1a �� 
	     *  
	     * @param str 
	     *            ��Ҫת�����ַ��� 
	     * @return string 
	     */  
	    public static String stringToReduce(final String str)  
	    {  
	        //   
	        StringBuffer result = new StringBuffer();  
	  
	        // �����ַ�������  
	        final int count = str.length();  
	  
	        // ȡ��һ���ַ�  
	        char c1 = str.charAt(0);  
	  
	        // �����ַ��ĸ���  
	        int sum = 1;  
	        for (int i = 1; i < count; i++)  
	        {  
	            // ѭ��ȡ�ַ�  
	            char c2 = str.charAt(i);  
	  
	            // ��ǰһ���ַ��͵�ǰ�ַ��Ƚ�  
	            if (c1 == c2)  
	            {  
	                // ��ͬ��ֻ������һ  
	                sum++;  
	                continue;  
	            }  
	  
	            // ƴ���ַ�  
	            result.append(sum).append(c1);  
	  
	            // ��ǰ�ַ���Ϊǰһ�ַ�  
	            c1 = c2;  
	  
	            // ��������  
	            sum = 1;  
	        }  
	  
	        // �������һ���ַ�������  
	        result.append(sum).append(c1);  
	  
	        return result.toString();  
	    }  
	  
	    public static void main(String[] args)  
	    {  
	        System.out.println(stringToReduce("aaabcddabddd"));  
	    }  
	}  

