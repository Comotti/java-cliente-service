package br.com.projeto.cliente.errors;


public class ValidationErrorDetails extends ErrorDetails {
    private String field;
    private String fieldMessage;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getFieldMessage() {
        return fieldMessage;
    }

    public void setFieldMessage(String fieldMessage) {
        this.fieldMessage = fieldMessage;
    }

    public static final class Builder {
        private String title;
        private int status;
        private String datail;
        private long timestamp;
        private String developerMessage;
        private String field;
        private String fieldMessage;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder datail(String datail) {
            this.datail = datail;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }
        public Builder field(String field) {
            this.field = field;
            return this;
        }
        public Builder fieldMessage(String fieldMessage) {
            this.fieldMessage = fieldMessage;
            return this;
        }

        public ValidationErrorDetails build() {
            ValidationErrorDetails validationErrorDetails = new ValidationErrorDetails();
            validationErrorDetails.setDeveloperMessage(developerMessage);
            validationErrorDetails.setDatail(datail);
            validationErrorDetails.setTitle(title);
            validationErrorDetails.setStatus(status);
            validationErrorDetails.setTimestamp(timestamp);
            validationErrorDetails.setField(field);
            validationErrorDetails.setFieldMessage(fieldMessage);
            return validationErrorDetails;
        }
    }
}
