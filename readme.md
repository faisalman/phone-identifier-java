# PhoneIdentifier.java

Phone number identifier (currently only support Indonesian number format)

## Example

```java
import com.faisalman.phoneidentifier.*;

public class Example {
    public static void main(String[] args) {
        System.out.println(Phone.identify("628552345678").provider.name()); // Indosat
        System.out.println(Phone.identify("0812 345 678").provider.name()); // Telkomsel
        System.out.println(Phone.identify("022911223344").provider.name()); // Esia
        System.out.println(Phone.identify("023187654321").area.code);       // 231
        System.out.println(Phone.identify("+62227654321").area.name);       // Bandung
        System.out.println(Phone.identify("021-765-4321").area.name);       // Jakarta
        System.out.println(Phone.identify("(061)7654321").area.name);       // Medan
    }
}
```

## License

MIT License

Copyright © 2013 Faisalman <<fyzlman@gmail.com>>