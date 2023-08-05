/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package vitor_test.Acme_Go.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class SearchUsersv1Response {
    
    public String contentType;

    public SearchUsersv1Response withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public SearchUsersv1Response withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public SearchUsersv1Response withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public vitor_test.Acme_Go.models.shared.Users users;

    public SearchUsersv1Response withUsers(vitor_test.Acme_Go.models.shared.Users users) {
        this.users = users;
        return this;
    }
    
    public SearchUsersv1Response(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
