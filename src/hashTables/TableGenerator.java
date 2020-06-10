package hashTables;

import cs1c.SongEntry;
import java.util.ArrayList;
import java.util.NoSuchElementException;


/**
 * Generates HashTable using FHHashQPwFind and Integer or String comparable object
 * @author Joel R
 */
public class TableGenerator {
    private ArrayList<String> genreNames = new ArrayList<String>();
    private FHhashQPwFind<Integer,SongCompInt> hashSongID =  new FHhashQPwFind<Integer,SongCompInt>();
    private FHhashQPwFind<String,SongsCompGenre> hashSongGenre =  new FHhashQPwFind<String,SongsCompGenre>();

    /**
     * Populates hash table of songEntries using SongCompInt wrapper
     * @param songEntries, array of SongEntry objects
     * @return Hash table of SongCompInt using Int key
     */
    public FHhashQPwFind<Integer,SongCompInt> populateIDtable(SongEntry[] songEntries)
    {
        for (int i = 0; i < songEntries.length; i++)
        {
            SongCompInt song = new SongCompInt(songEntries[i]);
            hashSongID.insert(song);
        }
        return hashSongID;
    }

    /**
     * Populates hash table of songEntries using SongCompGenre wrapper
     * @param songEntries, array of SongEntry objects
     * @return Hash table of SongCompGenre using String key
     */
    public FHhashQPwFind<String,SongsCompGenre> populateGenreTable(SongEntry[] songEntries)
    {
        for (int i = 0; i < songEntries.length; i++)
        {
            try
            {
                SongsCompGenre songGenre = hashSongGenre.find(songEntries[i].getGenre());
                songGenre.getData().add(songEntries[i]);
            }
            catch (NoSuchElementException e)
            {
                SongsCompGenre song = new SongsCompGenre(songEntries[i]);
                hashSongGenre.insert(song);
                genreNames.add(songEntries[i].getGenre());
            }
        }
        return hashSongGenre;
    }

    /**
     * Accesses ArrayList containing genre names
     * @return ArrayList of genre names
     */
    public ArrayList<String> getGenreNames()
    {
        return genreNames;
    }

}
