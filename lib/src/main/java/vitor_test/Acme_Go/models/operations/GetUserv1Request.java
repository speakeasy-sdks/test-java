/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package vitor_test.Acme_Go.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import vitor_test.Acme_Go.utils.SpeakeasyMetadata;


public class GetUserv1Request {
    /**
     * Numeric ID of the user to get
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public GetUserv1Request withId(String id) {
        this.id = id;
        return this;
    }
    
    public GetUserv1Request(@JsonProperty("id") String id) {
        this.id = id;
  }
}
