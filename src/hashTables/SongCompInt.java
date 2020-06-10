package hashTables;
import cs1c.SongEntry;


/**
 * Wrapper class for SongEntry that implements Comparable
 * Uses SongID as key
 * @author Joel R
 * */
public class SongCompInt implements Comparable<Integer> {
    private SongEntry data;

    /**
     *Default constructor for SongCompInt
     * @param song SongEntry object, taken from lecture
     */
    public SongCompInt(SongEntry song)
    {
        data = song;
    }

    /**
     *Implements compare to based off ID in SongEntry object
     * @param key Integer to compare to
     * @return difference between ID and key
     */
    public int compareTo(Integer key)
    {
       return data.getID()-key;
    }

    /**
     * Determines if key is equal to object wrapped in SongCompInt
     * @param key Integer to compare to
     * @return boolean, true if key is equal to ID
     */
    public boolean equals(Integer key)
    {
        return data.getID() == key;
    }

    /**
     *Returns hashCode of SongCompInt object
     * @return int, hashCode of data object or ID
     */
    public int hashCode()
    {
        return data.getID();
    }


    /**
     *Returns object wrapped in SongCompInt
     * @return String, toString of SongEntry
     */
    public String toString()
    {
        return data.toString();
    }

}

