# AcmeGo SDK

## Overview

User API for Speakeasy template service: The Rest Template API is an API used for instrucitonal purposes.

### Available Operations

* [createUserv1](#createuserv1) - Create user
* [deleteUserv1](#deleteuserv1) - Delete a user by ID
* [getHealth](#gethealth) - Healthcheck
* [getUserv1](#getuserv1) - Get a user by ID
* [searchUsersv1](#searchusersv1) - Search users
* [updateUserv1](#updateuserv1)

## createUserv1

Create user

### Example Usage

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

            vitor_test.Acme_Go.models.shared.UserInput req = new UserInput("deserunt", "Hunter.Gulgowski96@yahoo.com", "tempora", "suscipit", "molestiae", "minus");            

            CreateUserv1Response res = sdk.acmeGo.createUserv1(req);

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                      | Type                                                                           | Required                                                                       | Description                                                                    |
| ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ | ------------------------------------------------------------------------------ |
| `request`                                                                      | [vitor_test.Acme_Go.models.shared.UserInput](../../models/shared/UserInput.md) | :heavy_check_mark:                                                             | The request object to use for the request.                                     |


### Response

**[vitor_test.Acme_Go.models.operations.CreateUserv1Response](../../models/operations/CreateUserv1Response.md)**


## deleteUserv1

Delete a user by ID

### Example Usage

```java
package hello.world;

import vitor_test.Acme_Go.AcmeGo;
import vitor_test.Acme_Go.models.operations.DeleteUserv1Request;
import vitor_test.Acme_Go.models.operations.DeleteUserv1Response;

public class Application {
    public static void main(String[] args) {
        try {
            AcmeGo sdk = AcmeGo.builder()
                .build();

            DeleteUserv1Request req = new DeleteUserv1Request("placeat");            

            DeleteUserv1Response res = sdk.acmeGo.deleteUserv1(req);

            if (res.success != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [vitor_test.Acme_Go.models.operations.DeleteUserv1Request](../../models/operations/DeleteUserv1Request.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[vitor_test.Acme_Go.models.operations.DeleteUserv1Response](../../models/operations/DeleteUserv1Response.md)**


## getHealth

Healthcheck

### Example Usage

```java
package hello.world;

import vitor_test.Acme_Go.AcmeGo;
import vitor_test.Acme_Go.models.operations.GetHealthResponse;

public class Application {
    public static void main(String[] args) {
        try {
            AcmeGo sdk = AcmeGo.builder()
                .build();

            GetHealthResponse res = sdk.acmeGo.getHealth();

            if (res.statusCode == 200) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```


### Response

**[vitor_test.Acme_Go.models.operations.GetHealthResponse](../../models/operations/GetHealthResponse.md)**


## getUserv1

Get a user by ID

### Example Usage

```java
package hello.world;

import vitor_test.Acme_Go.AcmeGo;
import vitor_test.Acme_Go.models.operations.GetUserv1Request;
import vitor_test.Acme_Go.models.operations.GetUserv1Response;

public class Application {
    public static void main(String[] args) {
        try {
            AcmeGo sdk = AcmeGo.builder()
                .build();

            GetUserv1Request req = new GetUserv1Request("voluptatum");            

            GetUserv1Response res = sdk.acmeGo.getUserv1(req);

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                            | Type                                                                                                 | Required                                                                                             | Description                                                                                          |
| ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| `request`                                                                                            | [vitor_test.Acme_Go.models.operations.GetUserv1Request](../../models/operations/GetUserv1Request.md) | :heavy_check_mark:                                                                                   | The request object to use for the request.                                                           |


### Response

**[vitor_test.Acme_Go.models.operations.GetUserv1Response](../../models/operations/GetUserv1Response.md)**


## searchUsersv1

Search users

### Example Usage

```java
package hello.world;

import vitor_test.Acme_Go.AcmeGo;
import vitor_test.Acme_Go.models.operations.SearchUsersv1Response;
import vitor_test.Acme_Go.models.shared.Filter;
import vitor_test.Acme_Go.models.shared.Filters;

public class Application {
    public static void main(String[] args) {
        try {
            AcmeGo sdk = AcmeGo.builder()
                .build();

            vitor_test.Acme_Go.models.shared.Filters req = new Filters(                new vitor_test.Acme_Go.models.shared.Filter[]{{
                                add(new Filter("temporibus", "ab", "quis") {{
                                    field = "excepturi";
                                    matchtype = "nisi";
                                    value = "recusandae";
                                }}),
                                add(new Filter("ipsam", "repellendus", "sapiente") {{
                                    field = "veritatis";
                                    matchtype = "deserunt";
                                    value = "perferendis";
                                }}),
                            }}, 778157L, 140350L);            

            SearchUsersv1Response res = sdk.acmeGo.searchUsersv1(req);

            if (res.users != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                  | Type                                                                       | Required                                                                   | Description                                                                |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- | -------------------------------------------------------------------------- |
| `request`                                                                  | [vitor_test.Acme_Go.models.shared.Filters](../../models/shared/Filters.md) | :heavy_check_mark:                                                         | The request object to use for the request.                                 |


### Response

**[vitor_test.Acme_Go.models.operations.SearchUsersv1Response](../../models/operations/SearchUsersv1Response.md)**


## updateUserv1

### Example Usage

```java
package hello.world;

import vitor_test.Acme_Go.AcmeGo;
import vitor_test.Acme_Go.models.operations.UpdateUserv1Request;
import vitor_test.Acme_Go.models.operations.UpdateUserv1Response;
import vitor_test.Acme_Go.models.shared.UserInput;

public class Application {
    public static void main(String[] args) {
        try {
            AcmeGo sdk = AcmeGo.builder()
                .build();

            UpdateUserv1Request req = new UpdateUserv1Request(                new UserInput("at", "Wilford_Krajcik46@hotmail.com", "totam", "porro", "dolorum", "dicta");, "nam");            

            UpdateUserv1Response res = sdk.acmeGo.updateUserv1(req);

            if (res.user != null) {
                // handle response
            }
        } catch (Exception e) {
            // handle exception
        }
    }
}
```

### Parameters

| Parameter                                                                                                  | Type                                                                                                       | Required                                                                                                   | Description                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------- |
| `request`                                                                                                  | [vitor_test.Acme_Go.models.operations.UpdateUserv1Request](../../models/operations/UpdateUserv1Request.md) | :heavy_check_mark:                                                                                         | The request object to use for the request.                                                                 |


### Response

**[vitor_test.Acme_Go.models.operations.UpdateUserv1Response](../../models/operations/UpdateUserv1Response.md)**

