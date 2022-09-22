//Time: O(E).
//Space: O(N)
class Solution {
    public int findJudge(int n, int[][] trust) {
        if(n==1){return 1;}
      
        HashMap<Integer,HashSet>hm= new HashMap<>();
       
        for(int[]a:trust){
          if(!hm.containsKey(a[0])){ hm.put(a[0],new HashSet<>());}
            hm.get(a[0]).add(a[1]);
        }
        int flag=0;
        int judge=-1;
        
        if(hm.size()<n-1){return -1;}
        for(int i=1;i<=n;i++){
            
            if(!hm.containsKey(i)){
                
                for(HashSet out:hm.values()){
                    
                   System.out.println(i+" "+out);
                    if(!out.contains(i)){
                        flag=0;
                        break;
                    }
                    flag=1;
                }
                if(flag==1){return i;}
            }
        }
        return -1;
    }
}
