

public class RemoveAllAdjacentCharacterII {

  public String removeAllAdjacentCharacter(String str, int k){
    int i = 0;
    int N = str.length();
    int count[] = new int[N];
    char []stack = str.toCharArray();
    
    for(int j = 0; j < N; j++, i++){
       stack[i] = stack[j];
       count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i  - 1] + 1 : 1; 
       if(count[i] == k) i -=k; 
     } 

     return new String(stack, 0, i);
   
  }  

}
