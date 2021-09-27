public class Song { //Zachariah Friesen 100783192
    String artist;  //various variables
    String title;
    int duration;
    static String collectionName;
    Song(String ar, String ti, int dur){ //constructor
        this.artist = ar;
        this.title = ti;
        this.duration = dur;
    }
    public String toString(){ //when printed out in a print statement, this function is called
        int mins = this.duration/60;
        int secs = this.duration%60;
        return (this.artist + " (" + this.title + ") - " + mins + ":" + secs);
    }

    public String getArtist() {     //various getters and setters
        return this.artist;
    }

    public String getTitle() {
        return this.title;
    }

    public int getDuration() {
        return this.duration;
    }

    public static String getCollectionName() {
        return collectionName;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public static void setCollectionName(String collectionName) {
        Song.collectionName = collectionName;
    }
}
