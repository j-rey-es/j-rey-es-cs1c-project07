package hashTables;
import cs1c.SongEntry;

import java.util.ArrayList;


public class SongsCompGenre implements Comparable <String>
{
    private SongEntry data;
    private ArrayList<SongEntry> songs;

    public SongsCompGenre(SongEntry song)
    {
        data = song;
    }
    public void addSong(SongEntry e)
    {
        songs.add(e);
    }
    public SongEntry getSongEntry()
    {
        return data;

    }
    public ArrayList<SongEntry> getSongs()
    {
        return songs;
    }

    public int compareTo(String key)
    {
        return data.getGenre().compareTo(key);
    }

    public boolean equals(SongsCompGenre key)
    {
        return data.equals(key.data);
    }

    public int hashCode()
    {
        return data.getGenre().hashCode();
    }

    public String toString()
    {
        return data.toString();
    }
}