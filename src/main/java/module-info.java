module com.harish {
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
    requires lombok;
    opens org.example to com.fasterxml.jackson.databind;
}