# PhoneIdentifier.java

Phone number identifier (currently only support Indonesian number format)

## Example

```java
import com.faisalman.phoneidentifier.*;

public class Example {
    public static void main(String[] args) {
        System.out.println(PhoneIdentifier.identify("6285523456").provider.name()); // Indosat
        System.out.println(PhoneIdentifier.identify("0812345678").provider.name()); // Telkomsel
        System.out.println(PhoneIdentifier.identify("0229112233").provider.name()); // Esia
        System.out.println(PhoneIdentifier.identify("0231654321").area.code);       // 231
        System.out.println(PhoneIdentifier.identify("0227654321").area.name);       // Bandung
        System.out.println(PhoneIdentifier.identify("0217654321").area.name);       // Jakarta
    }
}
```

## License

MIT License

Copyright © 2013 Faisalman <<fyzlman@gmail.com>>