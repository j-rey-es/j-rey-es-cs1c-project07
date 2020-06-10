package hashTables;

public class FHhashQPwFind<KeyType, E extends Comparable<KeyType> >
        extends FHhashQP<E>
{
    public E find(KeyType key)
    {
        return mArray[findPosKey(key)].data;

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

        return int;
    }
}
