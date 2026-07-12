class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int []copy=arr.clone();
        Arrays.sort(copy);
        int count=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int x:copy){
           if(map.containsKey(x)){
            continue;
           }
           else{
            count++;
            map.put(x,count);
           }
        }
        int []res=new int[arr.length];
        for(int i=0;i<arr.length;i++ ){
            res[i]=map.get(arr[i]);        }
           return res;
    }
}