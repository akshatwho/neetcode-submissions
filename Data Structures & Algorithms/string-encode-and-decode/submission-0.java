class Solution {

    public String encode(List<String> strs) {
        String result = "";
        for (String str : strs) {
            // result.append(str.length()).append(":").append(str);
            result += Integer.toString(str.length()) + ":" + str;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;

            while (str.charAt(j) != ':') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            String fStr = str.substring(j + 1, j + 1 + length);
            result.add(fStr);
            i = j + 1 + length;
        }

        return result;
    }
}
