package hashTables;

import java.util.NoSuchElementException;

public class FHhashQPwFind<KeyType, E extends Comparable<KeyType> >
        extends FHhashQP<E>
{
    public E find(KeyType key)
    {
        if(mArray[findPosKey(key)].state == ACTIVE)
            return mArray[findPosKey(key)].data;
        else throw new NoSuchElementException();

    }

    public int myHashKey(KeyType key)
    {
        int hashKey;
        hashKey = key.hashCode() % mTableSize;
        if(hashKey < 0)
            hashKey +=mTableSize;
        return hashKey;
    }

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
