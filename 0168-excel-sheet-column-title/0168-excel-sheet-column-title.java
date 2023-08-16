class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            char character = (char)((columnNumber - 1) % 26 + 'A');
            sb.insert(0, character);
            columnNumber = (columnNumber - 1) / 26; 
        }
        return sb.toString();
    }
}