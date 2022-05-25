package kz.chesschicken.cherrydrupe.function;

/**
 * An interface function with arguments as Object array.
 * @param <O> return type.
 * @author ChessChicken-KZ
 */
@SuppressWarnings("UnusedReturnValue")
public interface FunctionObjectArray<O> {
    O apply(Object... o);
}
