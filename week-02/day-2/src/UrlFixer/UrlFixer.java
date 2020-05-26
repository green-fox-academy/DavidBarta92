package UrlFixer;

public class UrlFixer {
    public static void main(String[] args) {
        //v1
        String url = "https//www.reddit.com/r/nevertellmethebots";
        url = url.replace("bots", "odds");
        url = url.replace("//", "://");
        System.out.println(url);
        //v2
        url = "https//www.reddit.com/r/nevertellmethebots";
        String[] parts = url.split("s");
        parts[0] = parts[0] + "s:";
        url = parts[0] + parts[1];
        parts = url.split("bot");
        parts[0] = parts[0] + "odds";
        url = parts[0];
        System.out.println(url);
    }
}
