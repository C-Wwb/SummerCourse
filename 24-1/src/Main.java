import java.util.Collection;

public class Main
{

}
interface MyList<E> extends Collection<E>
{
    public void add(int index, E e);
    public E get (int index);
    public int indexOf(Object e);//return the index of the last matching element in this list
    //return -1 if no match

    public int lastIndexOf(E e);//删除一个指定元素，并且把其他元素前移，返回指定元素下标
    public E remove(int index);
    public E set(int index, E e);

    @Override//在list最后添加元素
    public default boolean add(E e)
    {
        add(size(), e);
        return true;
    }

    @Override
    public default boolean isEmpty()
    {
        return size() == 0;
    }

    @Override
    public default boolean remove(Object e)//删除第一次出现的元素，将其余元素向左移，如果元素移除，返回true
    {
        if (indexOf(e) >= 0)
        {
            remove(indexOf(e));
            return true;
        }
        else
        {
            return false;
        }
    }

    public default boolean containAll(Collection<?> c)
    {
        return true;
    }

    @Override
    public default boolean addAll(Collection<? extends E> c)
    {
        return true;
    }

    @Override
    public default boolean removeAll(Collection<?> c)
    {
        return true;
    }

    @Override
    public default Object[] toArray()
    {
        return null;
    }

    @Override
    public default <T> T[] toArray(T[] array)
    {
        return null;
    }
}
