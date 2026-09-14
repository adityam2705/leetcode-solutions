class BrowserHistory {
private class  Node {
        String url;
        Node next;
        Node prev;
        Node(String url){
            this.url = url;
        }
    }

     Node currP;
    public BrowserHistory(String homepage) {
        currP = new Node(homepage);
    }
    
    public void visit(String url) {
    currP.next = new Node(url);
    currP.next.prev = currP;
    currP = currP.next;
    return ;
    }
    
    public String back(int steps) {
        while(currP.prev!= null && steps-- > 0){
            currP = currP.prev;
        }
        return currP.url;
    }
    
    public String forward(int steps) {
        while(currP.next != null && steps-- > 0){
            currP = currP.next;
        }
        return currP.url;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */