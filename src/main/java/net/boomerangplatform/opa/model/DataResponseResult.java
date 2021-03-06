package net.boomerangplatform.opa.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class DataResponseResult {

  @JsonProperty("rules")
  private JsonNode rules;
  
  @JsonProperty("violations")
  private List<DataResponseResultViolation> violations;

  @JsonProperty("valid")
  private Boolean valid;

  public JsonNode getRules() {
    return rules;
  }

  public void setRules(JsonNode rules) {
    this.rules = rules;
  }

  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public List<DataResponseResultViolation> getViolations() {
    return violations;
  }

  public void setViolations(List<DataResponseResultViolation> violations) {
    this.violations = violations;
  }
}
