package me.dujava.callbacks;

/**
 * Created by bill on 2017/9/22.
 */

public interface TwoValue <T1, T2> {
    void onValue(T1 v1, T2 v2);
}
