module com.harish {
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.core;
    requires lombok;
    requires helper;
    opens org.example to com.fasterxml.jackson.databind;
}