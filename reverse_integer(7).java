class Solution {
    public int reverse(int x) {
        Boolean b=false;
        String s=String.valueOf(x);
        String ss=s;
        int count=0,xx=s.length()-1;
        if(s.charAt(0)=='-'){
            b=true;
            ss=s.replace("-","");
               xx--;
        }
     
        String rev="";
       if(b){
        while(count<s.length()-1){
            rev+=ss.charAt(xx);
             count++;
            xx--;
        }
    }
            if(b==false){
                while(count<s.length()){
            rev+=s.charAt(xx);
            count++;
            xx--;
        }
    }
       if (b) {
    String ans = "-" + rev;
    long xv = Long.parseLong(ans);  
    if (xv > Integer.MAX_VALUE || xv < Integer.MIN_VALUE)
    return 0;

    return (int) xv;                
} else {
    long xvv = Long.parseLong(rev); 
    if (xvv > Integer.MAX_VALUE || xvv < Integer.MIN_VALUE)
    return 0;

    return (int) xvv;               
    }

        }
    }

