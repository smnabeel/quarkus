package mna.a4.microservices.general.notification.otp.domain.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorModel  {

    private String errorCategory;
    private String errorCode;
    private Map<String, String> errorMessage = new HashMap<>();

    /**
    * Get errorCategory
    * @return errorCategory
    **/
    @JsonProperty("errorCategory")
    public String getErrorCategory() {
        return errorCategory;
    }

    /**
     * Set errorCategory
     **/
    public void setErrorCategory(String errorCategory) {
        this.errorCategory = errorCategory;
    }

    public ErrorModel errorCategory(String errorCategory) {
        this.errorCategory = errorCategory;
        return this;
    }

    /**
    * Get errorCode
    * @return errorCode
    **/
    @JsonProperty("errorCode")
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Set errorCode
     **/
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorModel errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
    * Get errorMessage
    * @return errorMessage
    **/
    @JsonProperty("errorMessage")
    public Map<String, String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Set errorMessage
     **/
    public void setErrorMessage(Map<String, String> errorMessage) {
        this.errorMessage = errorMessage;
    }

    public ErrorModel errorMessage(Map<String, String> errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public ErrorModel putErrorMessageItem(String key, String errorMessageItem) {
        this.errorMessage.put(key, errorMessageItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorModel {\n");

        sb.append("    errorCategory: ").append(toIndentedString(errorCategory)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ErrorModelQueryParam  {

        @jakarta.ws.rs.QueryParam("errorCategory")
        private String errorCategory;
        @jakarta.ws.rs.QueryParam("errorCode")
        private String errorCode;
        @jakarta.ws.rs.QueryParam("errorMessage")
        private Map<String, String> errorMessage = null;

        /**
        * Get errorCategory
        * @return errorCategory
        **/
        @JsonProperty("errorCategory")
        public String getErrorCategory() {
            return errorCategory;
        }

        /**
         * Set errorCategory
         **/
        public void setErrorCategory(String errorCategory) {
            this.errorCategory = errorCategory;
        }

        public ErrorModelQueryParam errorCategory(String errorCategory) {
            this.errorCategory = errorCategory;
            return this;
        }

        /**
        * Get errorCode
        * @return errorCode
        **/
        @JsonProperty("errorCode")
        public String getErrorCode() {
            return errorCode;
        }

        /**
         * Set errorCode
         **/
        public void setErrorCode(String errorCode) {
            this.errorCode = errorCode;
        }

        public ErrorModelQueryParam errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
        * Get errorMessage
        * @return errorMessage
        **/
        @JsonProperty("errorMessage")
        public Map<String, String> getErrorMessage() {
            return errorMessage;
        }

        /**
         * Set errorMessage
         **/
        public void setErrorMessage(Map<String, String> errorMessage) {
            this.errorMessage = errorMessage;
        }

        public ErrorModelQueryParam errorMessage(Map<String, String> errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public ErrorModelQueryParam putErrorMessageItem(String key, String errorMessageItem) {
            this.errorMessage.put(key, errorMessageItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ErrorModelQueryParam {\n");

            sb.append("    errorCategory: ").append(toIndentedString(errorCategory)).append("\n");
            sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
            sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
         * Convert the given object to string with each line indented by 4 spaces
         * (except the first line).
         */
        private static String toIndentedString(Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }
    }
}