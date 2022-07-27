package pingwit.lec_32_bean_scope;

import org.springframework.stereotype.Service;

@Service
public class ServiceExample_2 {

    private final SingletonExample singletonExample;
    private final PrototypeExample prototypeExample;

    public ServiceExample_2(SingletonExample singletonExample, PrototypeExample prototypeExample) {
        this.singletonExample = singletonExample;
        this.prototypeExample = prototypeExample;
        //this.prototypeExample = new PrototypeExample();

    }

}
