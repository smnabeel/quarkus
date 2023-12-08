package mna.a4.microservices.user.management.authentication.infrastructure.otp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserOtpPostModel  {

    private Boolean generateOtp;
    private Boolean resendOtp;

    /**
    * Get generateOtp
    * @return generateOtp
    **/
    @JsonProperty("generateOtp")
    public Boolean getGenerateOtp() {
        return generateOtp;
    }

    /**
     * Set generateOtp
     **/
    public void setGenerateOtp(Boolean generateOtp) {
        this.generateOtp = generateOtp;
    }

    public UserOtpPostModel generateOtp(Boolean generateOtp) {
        this.generateOtp = generateOtp;
        return this;
    }

    /**
    * Get resendOtp
    * @return resendOtp
    **/
    @JsonProperty("resendOtp")
    public Boolean getResendOtp() {
        return resendOtp;
    }

    /**
     * Set resendOtp
     **/
    public void setResendOtp(Boolean resendOtp) {
        this.resendOtp = resendOtp;
    }

    public UserOtpPostModel resendOtp(Boolean resendOtp) {
        this.resendOtp = resendOtp;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserOtpPostModel {\n");

        sb.append("    generateOtp: ").append(toIndentedString(generateOtp)).append("\n");
        sb.append("    resendOtp: ").append(toIndentedString(resendOtp)).append("\n");
        
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
    public static class UserOtpPostModelQueryParam  {

        @jakarta.ws.rs.QueryParam("generateOtp")
        private Boolean generateOtp;
        @jakarta.ws.rs.QueryParam("resendOtp")
        private Boolean resendOtp;

        /**
        * Get generateOtp
        * @return generateOtp
        **/
        @JsonProperty("generateOtp")
        public Boolean getGenerateOtp() {
            return generateOtp;
        }

        /**
         * Set generateOtp
         **/
        public void setGenerateOtp(Boolean generateOtp) {
            this.generateOtp = generateOtp;
        }

        public UserOtpPostModelQueryParam generateOtp(Boolean generateOtp) {
            this.generateOtp = generateOtp;
            return this;
        }

        /**
        * Get resendOtp
        * @return resendOtp
        **/
        @JsonProperty("resendOtp")
        public Boolean getResendOtp() {
            return resendOtp;
        }

        /**
         * Set resendOtp
         **/
        public void setResendOtp(Boolean resendOtp) {
            this.resendOtp = resendOtp;
        }

        public UserOtpPostModelQueryParam resendOtp(Boolean resendOtp) {
            this.resendOtp = resendOtp;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserOtpPostModelQueryParam {\n");

            sb.append("    generateOtp: ").append(toIndentedString(generateOtp)).append("\n");
            sb.append("    resendOtp: ").append(toIndentedString(resendOtp)).append("\n");
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