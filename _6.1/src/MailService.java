import java.util.*;
import java.util.function.Consumer;

public class MailService<T> implements Consumer<Sendable<T>> {

    private final Map<String, List<T>> map = new HashMap<>() {
        @Override
        public List<T> get(Object key) {
            return super.get(key) == null ? new ArrayList<>() : super.get(key);
        }
    };

    @Override
    public void accept(Sendable<T> mail) {
        map.computeIfAbsent(mail.getTo(), k -> new ArrayList<>()).add(mail.getContent());
    }

    public Map<String, List<T>> getMailBox() {
        return map;
    }
}
