package me.dujava.callbacks;

/**
 * Created by bill on 2017/9/22.
 */

public interface FourValueE<T1, T2, T3, T4, E extends Throwable> extends OnError<E> {
    void onValue(T1 v1, T2 v2, T3 v3, T4 v4);
}
