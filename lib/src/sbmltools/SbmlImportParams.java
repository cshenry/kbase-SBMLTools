
package sbmltools;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * <p>Original spec-file type: SbmlImportParams</p>
 * 
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "assembly_input_ref",
    "workspace_name",
    "url",
    "min_length"
})
public class SbmlImportParams {

    @JsonProperty("assembly_input_ref")
    private String assemblyInputRef;
    @JsonProperty("workspace_name")
    private String workspaceName;
    @JsonProperty("url")
    private String url;
    @JsonProperty("min_length")
    private Long minLength;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("assembly_input_ref")
    public String getAssemblyInputRef() {
        return assemblyInputRef;
    }

    @JsonProperty("assembly_input_ref")
    public void setAssemblyInputRef(String assemblyInputRef) {
        this.assemblyInputRef = assemblyInputRef;
    }

    public SbmlImportParams withAssemblyInputRef(String assemblyInputRef) {
        this.assemblyInputRef = assemblyInputRef;
        return this;
    }

    @JsonProperty("workspace_name")
    public String getWorkspaceName() {
        return workspaceName;
    }

    @JsonProperty("workspace_name")
    public void setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
    }

    public SbmlImportParams withWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public SbmlImportParams withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("min_length")
    public Long getMinLength() {
        return minLength;
    }

    @JsonProperty("min_length")
    public void setMinLength(Long minLength) {
        this.minLength = minLength;
    }

    public SbmlImportParams withMinLength(Long minLength) {
        this.minLength = minLength;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return ((((((((((("SbmlImportParams"+" [assemblyInputRef=")+ assemblyInputRef)+", workspaceName=")+ workspaceName)+", url=")+ url)+", minLength=")+ minLength)+", additionalProperties=")+ additionalProperties)+"]");
    }

}
