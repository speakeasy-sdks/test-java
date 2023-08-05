/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package vitor_test.Acme_Go.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters - An array of filters are used to query requests.
 */

public class Filters {
    /**
     * A list of filters to apply to the query.
     */
    @JsonProperty("filters")
    public Filter[] filters;

    public Filters withFilters(Filter[] filters) {
        this.filters = filters;
        return this;
    }
    
    /**
     * The maximum number of results to return.
     */
    @JsonProperty("limit")
    public Long limit;

    public Filters withLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    
    /**
     * The offset to start the query from.
     */
    @JsonProperty("offset")
    public Long offset;

    public Filters withOffset(Long offset) {
        this.offset = offset;
        return this;
    }
    
    public Filters(@JsonProperty("filters") Filter[] filters, @JsonProperty("limit") Long limit, @JsonProperty("offset") Long offset) {
        this.filters = filters;
        this.limit = limit;
        this.offset = offset;
  }
}