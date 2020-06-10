package hashTables;

import cs1c.SongEntry;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class TableGenerator {

    private ArrayList<String> genreNames = new ArrayList<String>();
    private FHhashQPwFind<Integer,SongCompInt> hashSongID =  new FHhashQPwFind<Integer,SongCompInt>();
    private FHhashQPwFind<String,SongsCompGenre> hashSongGenre =  new FHhashQPwFind<String,SongsCompGenre>();


    public FHhashQPwFind<Integer,SongCompInt> populateIDtable(SongEntry[] songEntries)
    {


        for (int i = 0; i < songEntries.length; i++)
        {
            SongCompInt song = new SongCompInt(songEntries[i]);
            hashSongID.insert(song);
        }
        return hashSongID;
    }

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
    public ArrayList<String> getGenreNames()
    {
        return genreNames;
    }

}
