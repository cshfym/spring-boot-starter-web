package com.opm.server.models

class ErrorResponse {

    String errorCode
    String message

    ErrorResponse(String errorCode, String message) {
        this.errorCode = errorCode
        this.message = message
    }
}
