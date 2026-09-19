class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2){

    int X = Math.max(x1,Math.min(xCenter, x2));
    int Y = Math.max(y1,Math.min(yCenter, y2));
     
     return dist(X,Y,xCenter,yCenter,radius);
    }

    boolean dist(int x1,int y1,int x2, int y2,int radius){

       int xnet=x2-x1;
       int ynet=y2-y1;

       return (Math.sqrt(Math.pow(xnet,2)+Math.pow(ynet,2))<=radius);

    }
}