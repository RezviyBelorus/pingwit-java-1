package pingwit.lec_32_bean_scope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.annotation.RequestScope;

import java.util.concurrent.atomic.AtomicInteger;

@Component
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
@RequestScope
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ScopeRequestExample {

    private final AtomicInteger counter = new AtomicInteger();

    @Override
    public String toString() {
        int i = counter.incrementAndGet();
        return String.valueOf(i);
    }

}
