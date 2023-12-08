package mna.a4.microservices.general.notification.otp.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserOtpPatchModel  {

    private String otpCode;

    /**
    * Get otpCode
    * @return otpCode
    **/
    @JsonProperty("otpCode")
    public String getOtpCode() {
        return otpCode;
    }

    /**
     * Set otpCode
     **/
    public void setOtpCode(String otpCode) {
        this.otpCode = otpCode;
    }

    public UserOtpPatchModel otpCode(String otpCode) {
        this.otpCode = otpCode;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserOtpPatchModel {\n");

        sb.append("    otpCode: ").append(toIndentedString(otpCode)).append("\n");
        
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
    public static class UserOtpPatchModelQueryParam  {

        @jakarta.ws.rs.QueryParam("otpCode")
        private String otpCode;

        /**
        * Get otpCode
        * @return otpCode
        **/
        @JsonProperty("otpCode")
        public String getOtpCode() {
            return otpCode;
        }

        /**
         * Set otpCode
         **/
        public void setOtpCode(String otpCode) {
            this.otpCode = otpCode;
        }

        public UserOtpPatchModelQueryParam otpCode(String otpCode) {
            this.otpCode = otpCode;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserOtpPatchModelQueryParam {\n");

            sb.append("    otpCode: ").append(toIndentedString(otpCode)).append("\n");
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