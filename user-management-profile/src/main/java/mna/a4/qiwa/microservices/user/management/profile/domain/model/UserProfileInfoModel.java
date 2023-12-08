package mna.a4.qiwa.microservices.user.management.profile.domain.model;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserProfileInfoModel  {

    private String userId;
    private Map<String, String> fullName;
    private String dob;
    private String mobileNumber;
    private Map<String, String> occupation;

    /**
    * This user id object will be used across the model with format 1* and 2* with length of 10
    * @return userId
    **/
    @JsonProperty("userId")
    public String getUserId() {
        return userId;
    }

    /**
     * Set userId
     **/
    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UserProfileInfoModel userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
    * Get fullName
    * @return fullName
    **/
    @JsonProperty("fullName")
    public Map<String, String> getFullName() {
        return fullName;
    }

    /**
     * Set fullName
     **/
    public void setFullName(Map<String, String> fullName) {
        this.fullName = fullName;
    }

    public UserProfileInfoModel fullName(Map<String, String> fullName) {
        this.fullName = fullName;
        return this;
    }
    public UserProfileInfoModel putFullNameItem(String key, String fullNameItem) {
        this.fullName.put(key, fullNameItem);
        return this;
    }

    /**
    * Get dob
    * @return dob
    **/
    @JsonProperty("dob")
    public String getDob() {
        return dob;
    }

    /**
     * Set dob
     **/
    public void setDob(String dob) {
        this.dob = dob;
    }

    public UserProfileInfoModel dob(String dob) {
        this.dob = dob;
        return this;
    }

    /**
    * Get mobileNumber
    * @return mobileNumber
    **/
    @JsonProperty("mobileNumber")
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * Set mobileNumber
     **/
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public UserProfileInfoModel mobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
        return this;
    }

    /**
    * Get occupation
    * @return occupation
    **/
    @JsonProperty("occupation")
    public Map<String, String> getOccupation() {
        return occupation;
    }

    /**
     * Set occupation
     **/
    public void setOccupation(Map<String, String> occupation) {
        this.occupation = occupation;
    }

    public UserProfileInfoModel occupation(Map<String, String> occupation) {
        this.occupation = occupation;
        return this;
    }
    public UserProfileInfoModel putOccupationItem(String key, String occupationItem) {
        this.occupation.put(key, occupationItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserProfileInfoModel {\n");

        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
        sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
        
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
    public static class UserProfileInfoModelQueryParam  {

        @jakarta.ws.rs.QueryParam("userId")
        private String userId;
        @jakarta.ws.rs.QueryParam("fullName")
        private Map<String, String> fullName = null;
        @jakarta.ws.rs.QueryParam("dob")
        private String dob;
        @jakarta.ws.rs.QueryParam("occupation")
        private Map<String, String> occupation = null;

        /**
        * This user id object will be used across the model with format 1* and 2* with length of 10
        * @return userId
        **/
        @JsonProperty("userId")
        public String getUserId() {
            return userId;
        }

        /**
         * Set userId
         **/
        public void setUserId(String userId) {
            this.userId = userId;
        }

        public UserProfileInfoModelQueryParam userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
        * Get fullName
        * @return fullName
        **/
        @JsonProperty("fullName")
        public Map<String, String> getFullName() {
            return fullName;
        }

        /**
         * Set fullName
         **/
        public void setFullName(Map<String, String> fullName) {
            this.fullName = fullName;
        }

        public UserProfileInfoModelQueryParam fullName(Map<String, String> fullName) {
            this.fullName = fullName;
            return this;
        }
        public UserProfileInfoModelQueryParam putFullNameItem(String key, String fullNameItem) {
            this.fullName.put(key, fullNameItem);
            return this;
        }

        /**
        * Get dob
        * @return dob
        **/
        @JsonProperty("dob")
        public String getDob() {
            return dob;
        }

        /**
         * Set dob
         **/
        public void setDob(String dob) {
            this.dob = dob;
        }

        public UserProfileInfoModelQueryParam dob(String dob) {
            this.dob = dob;
            return this;
        }

        /**
        * Get occupation
        * @return occupation
        **/
        @JsonProperty("occupation")
        public Map<String, String> getOccupation() {
            return occupation;
        }

        /**
         * Set occupation
         **/
        public void setOccupation(Map<String, String> occupation) {
            this.occupation = occupation;
        }

        public UserProfileInfoModelQueryParam occupation(Map<String, String> occupation) {
            this.occupation = occupation;
            return this;
        }
        public UserProfileInfoModelQueryParam putOccupationItem(String key, String occupationItem) {
            this.occupation.put(key, occupationItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserProfileInfoModelQueryParam {\n");

            sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
            sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
            sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
            sb.append("    occupation: ").append(toIndentedString(occupation)).append("\n");
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