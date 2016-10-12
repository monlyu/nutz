package org.nutz.log.impl;

import org.nutz.log.Log;
import org.nutz.log.LogAdapter;
import org.nutz.plugin.Plugin;

/**
 * Created by hong on 10/12/16.
 */
public class AndroidLogAdapter implements LogAdapter, Plugin {

    @Override
    public Log getLogger(String className) {
        return null;
    }

    @Override
    public boolean canWork() {
        return false;
    }

}
