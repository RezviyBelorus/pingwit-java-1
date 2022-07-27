package pingwit.lec_32_bean_scope;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scope")
//@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class ScopeRequestController {

    private final ScopeRequestExample scopeRequestExample;
    private final ScopeSessionExample scopeSessionExample;

    public ScopeRequestController(ScopeRequestExample scopeRequestExample, ScopeSessionExample scopeSessionExample) {
        this.scopeRequestExample = scopeRequestExample;
        this.scopeSessionExample = scopeSessionExample;
    }

    @GetMapping("/request")
    public String request() {
        String result = this.toString() + "===" + scopeRequestExample.toString();
        System.out.println(result);

        return result;
    }

    @GetMapping("/session")
    public String session() {
        String result = this.toString() + "===" + scopeSessionExample.toString();
        System.out.println(result);

        return result;
    }

    /*
    scopes:
    - singleton
    - prototype
    - request scope
    - session scope
    - application scope
     */
}
