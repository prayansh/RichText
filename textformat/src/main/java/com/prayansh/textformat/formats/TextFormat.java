package com.prayansh.textformat.formats;

import com.prayansh.textformat.utils.ActionPair;
import com.prayansh.textformat.utils.ActionPriority;
import com.prayansh.textformat.actions.PrefixAction;
import com.prayansh.textformat.actions.SuffixAction;
import com.prayansh.textformat.interfaces.AbstractTextAction;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Prayansh on 16-07-19.
 * Standard implementation of TextFormat with adding prefix and suffix text.
 */
public class TextFormat implements Iterable<AbstractTextAction> {
    private List<ActionPair<Integer, AbstractTextAction>> actions;
    private int priorityCount;

    public TextFormat() {
        priorityCount = 0;
        actions = new ArrayList<>();
    }

    /**
     * Function to allow copying format from another TextFormat object
     *
     * @param other
     * @return
     */
    public TextFormat extend(TextFormat other) {
        actions.addAll(other.getActions());
        return this;
    }

    /**
     * Add Action with custom priority
     *
     * @param action
     * @param priority
     * @return
     */
    public TextFormat addAction(AbstractTextAction action, ActionPriority priority) {
        switch (priority) {
            case PREFIX:
            case AFTER:
            case SUFFIX:
                actions.add(new ActionPair<Integer, AbstractTextAction>(priority.getPriority(), action));
                break;
            case NORMAL:
                actions.add(new ActionPair<Integer, AbstractTextAction>(priorityCount++, action));
                break;
        }
        return this;
    }

    /**
     * Add Action with default priority
     *
     * @param action you want to perform
     * @return this
     */
    public TextFormat addAction(AbstractTextAction action) {
        return addAction(action, ActionPriority.NORMAL);
    }

    public TextFormat prefix(String prefix) {
        return addAction(new PrefixAction(prefix), ActionPriority.PREFIX);
    }

    public TextFormat suffix(String suffix) {
        return addAction(new SuffixAction(suffix), ActionPriority.SUFFIX);
    }

    public List<ActionPair<Integer, AbstractTextAction>> getActions() {
        return actions;
    }

    @Override
    public Iterator<AbstractTextAction> iterator() {
        return new ActionIterator();
    }

    private class ActionIterator implements Iterator<AbstractTextAction> {

        private final int index;

        public ActionIterator() {
            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < actions.size();
        }

        @Override
        public AbstractTextAction next() {
            return actions.get(index).value;
        }
    }
}
