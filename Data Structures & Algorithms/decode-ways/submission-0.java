class Solution {
    public int numDecodings(String s) {
        HashMap<Integer, Integer> cache = new HashMap<>();
        return dfs(s, 0, cache);
    }

    private int dfs(String s, int i, HashMap<Integer, Integer> cache) {
        if (i == s.length()) {
            return 1;
        }

        if (s.charAt(i) == '0') {
            return 0;
        }

        if (cache.containsKey(i)) {
            return cache.get(i);
        }

        int res = dfs(s, i + 1, cache);

        if (i + 1 < s.length()) {
            int digits = Integer.parseInt(s.substring(i, i + 2));
            if (digits >= 10 && digits <=26) {
                res += dfs(s, i + 2,cache);
            }
        }

        cache.put(i, res);
        return res;

    }
}
