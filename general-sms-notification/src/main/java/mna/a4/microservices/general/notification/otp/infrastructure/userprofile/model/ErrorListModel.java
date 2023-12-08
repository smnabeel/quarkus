package mna.a4.microservices.general.notification.otp.infrastructure.userprofile.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorListModel  {

    private List<ErrorModel> errorModelList;

    /**
    * Get errorModelList
    * @return errorModelList
    **/
    @JsonProperty("errorModelList")
    public List<ErrorModel> getErrorModelList() {
        return errorModelList;
    }

    /**
     * Set errorModelList
     **/
    public void setErrorModelList(List<ErrorModel> errorModelList) {
        this.errorModelList = errorModelList;
    }

    public ErrorListModel errorModelList(List<ErrorModel> errorModelList) {
        this.errorModelList = errorModelList;
        return this;
    }
    public ErrorListModel addErrorModelListItem(ErrorModel errorModelListItem) {
        this.errorModelList.add(errorModelListItem);
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorListModel {\n");

        sb.append("    errorModelList: ").append(toIndentedString(errorModelList)).append("\n");
        
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
    public static class ErrorListModelQueryParam  {

        @jakarta.ws.rs.QueryParam("errorModelList")
        private List<ErrorModel> errorModelList = null;

        /**
        * Get errorModelList
        * @return errorModelList
        **/
        @JsonProperty("errorModelList")
        public List<ErrorModel> getErrorModelList() {
            return errorModelList;
        }

        /**
         * Set errorModelList
         **/
        public void setErrorModelList(List<ErrorModel> errorModelList) {
            this.errorModelList = errorModelList;
        }

        public ErrorListModelQueryParam errorModelList(List<ErrorModel> errorModelList) {
            this.errorModelList = errorModelList;
            return this;
        }
        public ErrorListModelQueryParam addErrorModelListItem(ErrorModel errorModelListItem) {
            this.errorModelList.add(errorModelListItem);
            return this;
        }

        /**
         * Create a string representation of this pojo.
         **/
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ErrorListModelQueryParam {\n");

            sb.append("    errorModelList: ").append(toIndentedString(errorModelList)).append("\n");
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