package mna.a4.microservices.user.management.authentication.domain.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserAuthenticationPostModel  {

    private String username;
    private String password;

    /**
    * Get username
    * @return username
    **/
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    /**
     * Set username
     **/
    public void setUsername(String username) {
        this.username = username;
    }

    public UserAuthenticationPostModel username(String username) {
        this.username = username;
        return this;
    }

    /**
    * Get password
    * @return password
    **/
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    /**
     * Set password
     **/
    public void setPassword(String password) {
        this.password = password;
    }

    public UserAuthenticationPostModel password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAuthenticationPostModel {\n");

        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        
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
    public static class UserAuthenticationPostModelQueryParam  {

        @jakarta.ws.rs.QueryParam("username")
        private String username;
        @jakarta.ws.rs.QueryParam("password")
        private String password;

        /**
        * Get username
        * @return username
        **/
        @JsonProperty("username")
        public String getUsername() {
            return username;
        }

        /**
         * Set username
         **/
        public void setUsername(String username) {
            this.username = username;
        }

        public UserAuthenticationPostModelQueryParam username(String username) {
            this.username = username;
            return this;
        }

        /**
        * Get password
        * @return password
        **/
        @JsonProperty("password")
        public String getPassword() {
            return password;
        }

        /**
         * Set password
         **/
        public void setPassword(String password) {
            this.password = password;
        }

        public UserAuthenticationPostModelQueryParam password(String password) {
            this.password = password;
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class UserAuthenticationPostModelQueryParam {\n");

            sb.append("    username: ").append(toIndentedString(username)).append("\n");
            sb.append("    password: ").append(toIndentedString(password)).append("\n");
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