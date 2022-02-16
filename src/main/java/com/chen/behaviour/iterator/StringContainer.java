package com.chen.behaviour.iterator;

/**
 * 字符串容器
 *
 * @author chenzihan
 * @date 2022/02/16
 */
public class StringContainer implements Container<String> {
    private String[] strings;

    @Override
    public Iterator<String> getIterator() {
        return new StringIterator();
    }

    public StringContainer(String[] strings) {
        this.strings = strings;
    }

    private class StringIterator implements Iterator<String> {
        int index;

        @Override
        public boolean hasNext() {
            return index < strings.length;
        }

        @Override
        public String next() {
            if (hasNext()) {
                return strings[index++];
            }
            return null;
        }
    }
}
