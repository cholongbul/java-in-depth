package effactivejava.generic;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * packageName : effactivejava.generic
 * fileName : Favorites
 * author : ohjm
 * date : 2022/03/07 * description :
 * ===========================================================
 * DATE AUTHOR NOTE
 * -----------------------------------------------------------
 * 2022/03/07 ohjm 최초 생성
 */
public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();
    public <T> void putFavorite(Class<T> type, T instance) {
        favorites.put(Objects.requireNonNull(type), instance);
    }

    public <T> T getFavorite(Class<T> type) {
        return type.cast(favorites.get(type));
    }
}
