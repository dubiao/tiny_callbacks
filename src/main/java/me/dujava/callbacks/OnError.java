package me.dujava.callbacks;

/**
 * Created by bill on 2017/10/19.
 */

public interface OnError<T extends Throwable> {
    void onError(T e);
}
