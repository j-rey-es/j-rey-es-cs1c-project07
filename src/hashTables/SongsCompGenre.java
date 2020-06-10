package hashTables;
import cs1c.SongEntry;
import java.util.ArrayList;

/**
 * Wrapper class for SongEntry object, to compare based off genre
 * Uses genre as key
 * @author Joel R
 */
public class SongsCompGenre implements Comparable <String>
{
    private String name;
    private ArrayList<SongEntry> songs;
    // SongEntry data;

    /**
     * Default constructor for SongsCompGenre
     * @param song SongEntry object to be wrapped
     */
    public SongsCompGenre(SongEntry song)
    {
        //data = song;
        name = song.getGenre();
        songs = new ArrayList<SongEntry>();
    }

    /**
     * Adds SongEntry to ArrayList
     * @param e, SongEntry, song to be added to ArrayList
     */
    public void addSong(SongEntry e)
    {
        songs.add(e);
    }

    /**
     * Compares genre name to key
     * @param key, String, genre to compare to
     * @return int, a string comparison
     */
    public int compareTo(String key)
    {
        return name.compareTo(name);
    }

    /**
     *Determines if genre name is equal to key
     * @param key, String, genre to compare to
     * @return boolean, true if equal
     */
    public boolean equals(SongsCompGenre key)
    {
        return name.equals(key.name);
    }

    /**
     * Generates hashcode based off name of genre using hashCode()
     * @return int, hashCode
     */
    public int hashCode()
    {
        return name.hashCode();
    }

    /**
     * Access the genre name of object
     * @return String, name of genre
     */
    public String getName()
    {
        return name;
    }

    /**
     *Access the array for SongsCompGenre wrapper
     * @return ArrayList, SongsEntries in array
     */
    public ArrayList<SongEntry> getData()
    {
        return songs;
    }

    /**
     * Returns toString of ArrayList wrapped in SongsCompGenre
     * @return String, toString of ArrayList
     */
    public String toString()
    {
        return songs.toString();
    }
}