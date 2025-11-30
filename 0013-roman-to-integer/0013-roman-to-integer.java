class Solution {
    public int romanToInt(String s) {
        int res=0;
      int n=s.length();
      for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        switch(ch){
            case 'I':
            if(i<n-1){
                char next=s.charAt(i+1);
                if(next=='V'){
                    res=res+3;
                    i++;
                }
                if(next=='X'){
                    res=res+8;
                    i++;
                }
            }
            res=res+1;
            break;
            case 'V':
            res=res+5;
            break;
            case 'X':
            if(i<n-1){
                char next=s.charAt(i+1);
                if(next=='L'){
                    res=res+30;
                    i++;
                }
                if(next=='C'){
                    res=res+80;
                    i++;
                }
            }
            res=res+10;
            break;
            case 'L':
            res=res+50;
            break;
            case 'C':
            if(i<n-1){
                char next=s.charAt(i+1);
                if(next=='D'){
                    res=res+300;
                    i++;
                }
                if(next=='M'){
                    res=res+800;
                    i++;
                }
            }
            res=res+100;
            break;
            case 'D':
            res=res+500;
            break;
            case 'M':
            res=res+1000;
            break;
        }
      } 
      return res; 
    }
}