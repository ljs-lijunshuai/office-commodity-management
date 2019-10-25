package com.mr.util;

/**
 * Created by lijunshuai on 2019/9/10.
 */
public class ThreadUtil extends Thread {
    @Override
    public void run() {
        super.run();
    }

    public static Thread newThread() {
        ThreadUtil thread = new ThreadUtil();
        return thread;
    }

}
