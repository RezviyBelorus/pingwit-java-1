package pingwit.lec_32_bean_scope;

import org.springframework.stereotype.Component;

@Component
public class SingletonExample {

   private static SingletonExample singletonExample = null;

    public static SingletonExample createInstance() {
        if (singletonExample == null) {
            singletonExample = new SingletonExample();
        }

        return singletonExample;
    }

}
