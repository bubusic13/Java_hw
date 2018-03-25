package thirdpart.position;

import java.util.ArrayList;
import java.util.Iterator;

public class PositionWraper implements Iterable<Position> {

    private ArrayList<Position> list;

    public PositionWraper(ArrayList<Position> list){
        this.list = list;
    }




    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Position> iterator() {
        return new PositionIterator();
    }

    class PositionIterator implements Iterator<Position>{

        private int currentIndex = 0;

        /**
         * Returns {@code true} if the iteration has more elements.
         * (In other words, returns {@code true} if {@link #next} would
         * return an element rather than throwing an exception.)
         *
         * @return {@code true} if the iteration has more elements
         */
        @Override
        public boolean hasNext() {
            return (currentIndex < list.size());
        }


        @Override
        public Position next() {
            Position position = list.get(currentIndex++);
            while(position.getPrice() >= 5){
                position = list.get(currentIndex++);
            }
                return position;
        }

        /**
         * Removes from the underlying collection the last element returned
         * by this iterator (optional operation).  This method can be called
         * only once per call to {@link #next}.  The behavior of an iterator
         * is unspecified if the underlying collection is modified while the
         * iteration is in progress in any way other than by calling this
         * method.
         *
         * @throws UnsupportedOperationException if the {@code remove}
         *                                       operation is not supported by this iterator
         * @throws IllegalStateException         if the {@code next} method has not
         *                                       yet been called, or the {@code remove} method has already
         *                                       been called after the last call to the {@code next}
         *                                       method
         * @implSpec The default implementation throws an instance of
         * {@link UnsupportedOperationException} and performs no other action.
         */
        @Override
        public void remove() {

        }
    }
}
