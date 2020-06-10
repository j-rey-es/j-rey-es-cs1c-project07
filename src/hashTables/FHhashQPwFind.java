package hashTables;

import java.util.NoSuchElementException;

/**
 * Hash table with quadratic probing based off FHhashQP
 * Adds additional find based off key
 * @author Joel R
 * @param <KeyType>, generic parameter to find based off
 * @param <E>, generic item that is returned from hash table
 */
public class FHhashQPwFind<KeyType, E extends Comparable<KeyType> >
        extends FHhashQP<E>
{
    /**
     * Finds object in hash table based on key
     * @param key KeyType that implements Comparable
     * @return Object within hash table
     */
    public E find(KeyType key)
    {
        if(mArray[findPosKey(key)].state == ACTIVE)
            return mArray[findPosKey(key)].data;
        else throw new NoSuchElementException();

    }

    /**
     * Creates hash key of based on key rather than object
     * @param key KeyType that implements Comparable
     * @return
     */
    public int myHashKey(KeyType key)
    {
        int hashKey;
        hashKey = key.hashCode() % mTableSize;
        if(hashKey < 0)
            hashKey +=mTableSize;
        return hashKey;
    }

    /**
     * Finds position of key in hash table based on key rather than object
     * @param key KeyType that implements Comparable
     * @return
     */

    public int findPosKey(KeyType key){
        int kthOddNum = 1;
        int index = myHashKey(key);
        while ( mArray[index].state != EMPTY
                && mArray[index].data.compareTo(key) !=0 )
        {
            index += kthOddNum;
            kthOddNum += 2;
            if ( index >= mTableSize )
                index -= mTableSize;
        }
        return index;
    }
}
