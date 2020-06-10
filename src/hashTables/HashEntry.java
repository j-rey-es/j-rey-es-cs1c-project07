package hashTables;

/**
 * HashEnty taken from lecture, contains state flags
 * @param <E> generic data object to be stored in hash table
 */

// HashEntry class for use by FHhashQP -----------------------
public class HashEntry<E>
{
   public E data;
   public int state;
   
   public HashEntry( E x, int st )
   {
      data = x;
      state = st;
   }

   public HashEntry()
   {
      this(null, FHhashQP.EMPTY);
   }
}
