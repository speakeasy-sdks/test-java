# Filters

An array of filters are used to query requests.


## Fields

| Field                                         | Type                                          | Required                                      | Description                                   |
| --------------------------------------------- | --------------------------------------------- | --------------------------------------------- | --------------------------------------------- |
| `filters`                                     | List<[Filter](../../models/shared/Filter.md)> | :heavy_check_mark:                            | A list of filters to apply to the query.      |
| `limit`                                       | *Long*                                        | :heavy_check_mark:                            | The maximum number of results to return.      |
| `offset`                                      | *Long*                                        | :heavy_check_mark:                            | The offset to start the query from.           |