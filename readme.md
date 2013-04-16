# Operatorify.java

Indonesian phone number identifier

## Example

```java
import com.faisalman.operatorify.*;

public class Example {
    public static void main(String[] args) {
        System.out.println(Operatorify.identify("6285523456").operator.name());  // Indosat
        System.out.println(Operatorify.identify("0812345678").operator.name());  // Telkomsel
        System.out.println(Operatorify.identify("0229112233").operator.name());  // Esia
        System.out.println(Operatorify.identify("0231654321").areaCode);         // 0231
        System.out.println(Operatorify.identify("0227654321").region.name());    // Bandung
        System.out.println(Operatorify.identify("0217654321").region.name());    // Jakarta
    }
}
```

## License

MIT License

Copyright © 2013 Faisalman <<fyzlman@gmail.com>>
