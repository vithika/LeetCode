class Solution {
    public String reverseWords(String s) {
        String ss[]=s.split(" ");
        StringBuffer res= new StringBuffer();
        StringBuffer temp=new StringBuffer();
        
        for(int i=0;i<ss.length;i++)
        {
            temp= new StringBuffer(ss[i]);
            temp.reverse();
            res.append(temp);
            if(i != ss.length-1)
            {
                res.append(" ");
            }
        }
        return res.toString();
        
    }
}


    
