package com.example.footballmanager.constants;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ApiLogMessage {

    METHOD_NAME_INFO("log{CURRENT METHOD NAME -> {}}");

    private final String value;
}
