/*
 * Kubernetes
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1.8.11
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.kubernetes.client.models;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.IntOrString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TCPSocketAction describes an action based on opening a socket
 */
@ApiModel(description = "TCPSocketAction describes an action based on opening a socket")

public class V1TCPSocketAction {
  @SerializedName("host")
  private String host = null;

  @SerializedName("port")
  private IntOrString port = null;

  public V1TCPSocketAction host(String host) {
    this.host = host;
    return this;
  }

   /**
   * Optional: Host name to connect to, defaults to the pod IP.
   * @return host
  **/
  @ApiModelProperty(value = "Optional: Host name to connect to, defaults to the pod IP.")
  public String getHost() {
    return host;
  }

  public void setHost(String host) {
    this.host = host;
  }

  public V1TCPSocketAction port(IntOrString port) {
    this.port = port;
    return this;
  }

   /**
   * Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
   * @return port
  **/
  @ApiModelProperty(required = true, value = "Number or name of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.")
  public IntOrString getPort() {
    return port;
  }

  public void setPort(IntOrString port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1TCPSocketAction v1TCPSocketAction = (V1TCPSocketAction) o;
    return Objects.equals(this.host, v1TCPSocketAction.host) &&
        Objects.equals(this.port, v1TCPSocketAction.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(host, port);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1TCPSocketAction {\n");
    
    sb.append("    host: ").append(toIndentedString(host)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

