package me.dujava.callbacks;

/**
 * Created by bill on 2017/9/22.
 */

public interface OneValueE<T, E extends Throwable> extends OnError<E> {
    void onValue(T v);
}
