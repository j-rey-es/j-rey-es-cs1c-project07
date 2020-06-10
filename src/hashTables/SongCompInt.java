package hashTables;
import cs1c.SongEntry;



public class SongCompInt implements Comparable<Integer> {
    private SongEntry data;
    public SongCompInt(SongEntry song)
    {
        data = song;
    }

    public int compareTo(Integer key)
    {
       return data.getID()-key;
    }

    public boolean equals(Integer key)
    {
        return data.getID() == key;
    }

    public int hashCode()
    {
        return data.getID();
    }

    public String toString()
    {
        return data.toString();
    }

}

