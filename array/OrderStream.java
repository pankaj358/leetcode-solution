import java.util.List;
import java.util.ArrayList;

class OrderedStream {

    int currentPos=0, oldPos=0;
    List<String> list= new ArrayList();
    
    public OrderedStream(int n) {
        for(int i=0;i<=n;i++){
            list.add(null);
        }
    }
    
    public List<String> insert(int idKey, String value) {

        list.set(idKey-1,value);
        oldPos=currentPos;
        
        while(list.get(currentPos)!=null){
            currentPos++;
        }
        return  list.subList(oldPos, currentPos);
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
