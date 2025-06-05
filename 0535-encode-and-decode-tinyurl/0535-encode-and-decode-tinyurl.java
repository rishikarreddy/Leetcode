public class Codec {

private Map<Integer,String>map=new HashMap<>();
int id=0;
private static final String baseurl="http://tinyurl.com/";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        map.put(id,longUrl);
        return baseurl+ id++;
        
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int id=Integer.parseInt(shortUrl.replace(baseurl,""));
        return map.get(id);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));