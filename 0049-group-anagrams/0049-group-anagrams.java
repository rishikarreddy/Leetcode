class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     Map<String,List<String>> map=new HashMap<>();
    if(strs==null || strs.length==0)
    {
        return new ArrayList<>();
    }
    for(String st:strs)
    {
        String frequencystr= getfrequency(st);
        if(map.containsKey(frequencystr))
        {
            map.get(frequencystr).add(st);
        }
        else
        {
        List<String> strlist=new ArrayList<>();
        strlist.add(st);
        map.put(frequencystr,strlist);
    }
    }
    return new ArrayList<>(map.values());


        
    }
    private static String getfrequency(String str)
    {
        int freq[]=new int[26];
        for(char c:str.toCharArray())
        {
            freq[c-'a']++;
        }
        StringBuilder sb=new StringBuilder("");
        char c= 'a';
        for(int i:freq)
        {
            sb.append(c);
            sb.append(i);
            c++;
        }

    return sb.toString();

    }
    }