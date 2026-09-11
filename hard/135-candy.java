class Solution {
    public int candy(int[] ratings) {int n= ratings.length;
    int sum=1;   
     int i=1;
     while(i<n){if(ratings[i]==ratings[i-1]){sum=sum+1;
                    i++;
                    continue;} 
                  int top =1;
            while(i<n && ratings[i-1]<ratings[i]){top=top+1;
                sum=sum+top;
                 i++;}
                 int bottom =1;
                 while(i<n && ratings[i-1]>ratings[i]){
                    sum=sum+bottom;
                     bottom++;    
                     i++;
                 }if(top<bottom){ 
                    sum=sum+(bottom-top);}
                    }

                 
      return sum;  }
        
    }
