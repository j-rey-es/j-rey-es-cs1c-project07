package hashTables;

import cs1c.SongEntry;

public class TableGenerator {
    public FHhashQPwFind<Integer,SongCompInt> populateIDtable(SongEntry[] songEntries)
    {
        FHhashQPwFind<Integer,SongCompInt>  hashSongID =  new FHhashQPwFind<Integer,SongCompInt>();
        for (int i = 0; i < songEntries.length; i++)
        {
            SongCompInt song = new SongCompInt(songEntries[i]);
            hashSongID.insert(song);
        }
        return hashSongID;
    }

    public FHhashQPwFind<String,SongsCompGenre> populateGenreTable(SongEntry[] songEntries)
    {
        FHhashQPwFind<String,SongsCompGenre> hashSongGenre =  new FHhashQPwFind<String,SongsCompGenre>();
        for (int i = 0; i < songEntries.length; i++)
        {
            SongsCompGenre song = new SongsCompGenre(songEntries[i]);
            hashSongGenre.insert(song);
        }
        return hashSongGenre;
    }

}
