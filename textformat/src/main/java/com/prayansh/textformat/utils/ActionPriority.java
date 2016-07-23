package com.prayansh.textformat.utils;

/**
 * Created by Prayansh on 16-07-23.
 */
public enum ActionPriority {
    PREFIX(-255), SUFFIX(254), NORMAL(0), AFTER(255);
    private int priority;

    ActionPriority(int i) {
        priority = i;
    }

    public int getPriority() {
        return priority;
    }
}
