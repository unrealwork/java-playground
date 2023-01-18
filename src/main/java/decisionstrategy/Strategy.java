package decision;

import java.util.function.Function;

public interface Strategy<T, R> extends Function<T, R> {
}
