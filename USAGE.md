<!-- Start SDK Example Usage -->


```java
package hello.world;

import vitor_test.Acme_Go.AcmeGo;
import vitor_test.Acme_Go.models.operations.CreateUserv1Response;
import vitor_test.Acme_Go.models.shared.UserInput;

public class Application {
    public static void main(String[] args) {
        try {
            AcmeGo sdk = AcmeGo.builder()
                .build();

            vitor_test.Acme_Go.models.shared.UserInput req = new UserInput("corrupti", "Micheal_Sporer@yahoo.com", "corrupti", "illum", "vel", "error");            

            CreateUserv1Response res = sdk.createUserv1(req);

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```
<!-- End SDK Example Usage -->