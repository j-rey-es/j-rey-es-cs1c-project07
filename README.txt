project folder:
j-rey-es-cs1c-project07/

Brief description of submitted files

src/cs1c/MillionSongDataSubset.json
    -Taken from lecture
    -JSON database of songs

src/cs1c/SongEntry.java
    -Taken from lecture
    -Song Entry object
    -Contains information about songs such as ID, genre, run time

src/cs1c/TimeConverter.java
    -Taken from lecture
    -Utility to convert time

src/hashTables/FHhashQP.java
    -Taken from lecture
    -Hash Table that uses Quadratic Probing for collision resolution

src/hashTables/FHhashQPwFind.java
    -Extends FHhashQP
    -Implements find based off a given key

src/hashTables/HashEntry.java
    -Taken from lecture
    -Wrapper class to allow for state attribute in hash table entries

src/hashTables/MyTunes.java
    -Main
    -Reads from MillionSongDataSubset and populates hash tables
    -Uses find and given search key to find song entry objects

src/hashTables/SongCompInt.java
    -Wrapper object for SongEntry.java
    -Uses songID as key for comparable

src/hashTables/SongCompGenre.java
    -Wrapper object for SongEntry.java
    -Uses genre as key for comparable

src/hashTables/TableGenerator.java
    -Creates FHhashQPFind hash tables using wrapper class that implements comparable

