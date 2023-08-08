# Acme-Go

<!-- Start SDK Installation -->
## SDK Installation

### Gradle

```groovy
implementation 'vitor_test.Acme_Go:Acme-Go:1.1.0'
```
<!-- End SDK Installation -->

## SDK Example Usage
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

<!-- Start SDK Available Operations -->
## Available Resources and Operations

### [AcmeGo SDK](docs/sdks/acmego/README.md)

* [createUserv1](docs/sdks/acmego/README.md#createuserv1) - Create user
* [deleteUserv1](docs/sdks/acmego/README.md#deleteuserv1) - Delete a user by ID
* [getHealth](docs/sdks/acmego/README.md#gethealth) - Healthcheck
* [getUserv1](docs/sdks/acmego/README.md#getuserv1) - Get a user by ID
* [searchUsersv1](docs/sdks/acmego/README.md#searchusersv1) - Search users
* [updateUserv1](docs/sdks/acmego/README.md#updateuserv1)
<!-- End SDK Available Operations -->

### Maturity

This SDK is in beta, and there may be breaking changes between versions without a major version update. Therefore, we recommend pinning usage
to a specific package version. This way, you can install the same version each time without breaking changes unless you are intentionally
looking for the latest version.

### Contributions

While we value open-source contributions to this SDK, this library is generated programmatically.
Feel free to open a PR or a Github issue as a proof of concept and we'll do our best to include it in a future release!

### SDK Created by [Speakeasy](https://docs.speakeasyapi.dev/docs/using-speakeasy/client-sdks)
