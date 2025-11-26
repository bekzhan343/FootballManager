package com.example.footballmanager.constants;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum ApiErrorMessage {

    API_NOT_FOUND_INFO("log{INFO NOT FOUND ID->%s}");
    public final String message;

    public String getMessage(Object... args) {
        return String.format(message,args);
    }
}
