class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        int open = 0, close = 0;
        dfs(n, res, open, close, "");
        return res;
    }
    public void dfs(int n, List<String> res, int open, int close, String cur){
        if(n*2 == cur.length()){
            res.add(cur);
            return;
        }
        if(open < n){
            dfs(n, res, open+1, close, cur+"(");
        }
        if(open > close){
            dfs(n, res, open, close+1, cur+")");
        }
    }
}
