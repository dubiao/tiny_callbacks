package me.dujava.callbacks;

/**
 * Created by bill on 2017/9/22.
 */

public interface ThreeValueE<T1, T2, T3, E extends Throwable> extends OnError<E> {
    void onValue(T1 v1, T2 v2, T3 v3);
}
