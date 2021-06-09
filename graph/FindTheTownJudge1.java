public class FindTheTownJudge1
{
  public int findJudge(int N, int [][]trust){
     int count[] = new int[N + 1];
     for(int [] t : trust){
        count[t[0]]--;
        count[t[1]]++;
     }
    
     for(int idx = 1; idx <= N; idx++){
       if(count[idx] == N - 1) return idx; 
     } 
     return -1;
  }
}
