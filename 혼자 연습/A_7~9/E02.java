public class E02 {
    public static void main(String[] args){
        Song person = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
        person.show();
    }
}

class Song {
    private String title;
    private String artist;
    private int year;
    private String country;
    
    public Song(String t, String a, int y, String c){
        title = t;
        artist = a;
        year = y;
        country = c;
    }
    public void show(){
        System.out.println(year + "년 " + country + " 국적의 " + artist + "가 부른 " + title);
    }
}