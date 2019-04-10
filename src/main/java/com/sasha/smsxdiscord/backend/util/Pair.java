package com.sasha.smsxdiscord.backend.util;


import java.util.Objects;


/**
 * An immutable, semantic-free ordered pair of nullable values. Avoid using it in public APIs.
 */
public final class Pair<A, B> {

    /**
     * Creates a new pair containing the given elements in order.
     */
    public static <A, B> Pair<A, B> of(A first, B second) {
        return new Pair<>(first, second);
    }

    /**
     * The first element of the pair.
     */

    public A first;

    /**
     * The second element of the pair.
     */

    public B second;

    /**
     * Constructor.  It is usually easier to call {@link #of}.
     */
    public Pair(A first, B second) {
        this.first = first;
        this.second = second;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Pair)) {
            return false;
        }
        Pair<?, ?> p = (Pair<?, ?>) o;
        return Objects.equals(first, p.first) && Objects.equals(second, p.second);
    }

    @Override
    public int hashCode() {
        int hash1 = first == null ? 0 : first.hashCode();
        int hash2 = second == null ? 0 : second.hashCode();
        return 31 * hash1 + hash2;
    }
}
