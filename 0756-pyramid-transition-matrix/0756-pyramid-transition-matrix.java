class Solution {
    HashMap<String, List<Character>> map;
    public boolean pyramidTransition(String bottom, List<String> allowed) {
        map = new HashMap<>();
        for(String s : allowed) {
            String sub = s.substring(0, 2);
            if(!map.containsKey(sub)){
                map.put(sub, new ArrayList<>());
            }
            map.get(sub).add(s.charAt(2));
        }
        return checking(bottom, 0, new StringBuilder());
    }
    public boolean checking(String base, int ind, StringBuilder upBase){
        if(base.length() == 1) return true;
        if(upBase.length() == base.length()-1){
            return checking(upBase.toString(), 0, new StringBuilder());
        }
        
        String tar = base.substring(ind, ind+2);
        if(!map.containsKey(tar)) return false;
        for(Character ch: map.get(tar)){
            upBase.append(ch);
            if(checking(base, ind+1, upBase)) return true;
            upBase.deleteCharAt(upBase.length()-1);
        }
        
        return false;
    }
}