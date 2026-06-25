class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> {
                int cor_a = a[0]*a[0] + a[1]*a[1];
                int cor_b = b[0]*b[0] + b[1]*b[1];
                return cor_b-cor_a;
            }
        );

        for(int[] n : points){
            pq.offer(n);
            if(pq.size() > k){
                pq.poll();
            }
        }

        int[][] arr = new int[k][2];
        for(int i = 0; i<k; i++){
            arr[i] = pq.poll();
        }
        return arr;
    }
}
