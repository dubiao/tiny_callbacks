package me.dujava.callbacks;

/**
 * Created by bill on 2017/9/22.
 */

public interface TwoValueE<T1, T2, E extends Throwable> extends OnError<E> {
    void onValue(T1 v1, T2 v2);
}
