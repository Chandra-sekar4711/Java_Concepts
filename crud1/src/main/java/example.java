import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class example {
    static Map<Integer, String> map = new ConcurrentHashMap<>();

    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                map.put("key" + i, i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                map.put("key" + i, i);
            }
        });
        thread1.start();
        thread2.start();
        Thread.sleep(2000);
        System.out.println(map);
    }
}
