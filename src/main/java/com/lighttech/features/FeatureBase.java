package com.lighttech.features;

public class FeatureBase {
    public FeatureBase() {
        System.out.println(String.format("Hello from %s!", this.getClass().getSimpleName()));
    }

    protected void report(String msg) {
        String message = String.format("[%s] %s",
                this.getClass().getSimpleName(),
                msg);

        System.out.println(message);
    }

    protected void reportError(String error) {
        String errorMsg = String.format("[%s] [Error=%s] %s",
                this.getClass().getSimpleName(),
                error);

        System.out.println(errorMsg);
    }

    protected void reportError(String error, Exception e) {
        String errorMsg = String.format("[%s] [Error=%s] [%s:%s]",
                this.getClass().getSimpleName(),
                error,
                e.getClass().getSimpleName(), e.getMessage());

        System.out.println(errorMsg);
    }

    protected void reportError(String error, String fields) {
        String errorMsg = String.format("[%s] [Error=%s] %s",
                this.getClass().getSimpleName(),
                error, fields);

        System.out.println(errorMsg);
    }

    protected void reportError(String error, String fields, Exception e) {
        String errorMsg = String.format("[%s] [Error=%s] %s [%s:%s]",
                this.getClass().getSimpleName(),
                error,
                fields,
                e.getClass().getSimpleName(), e.getMessage());

        System.out.println(errorMsg);
    }
}
