package com.subOne.keycloak_dto;

import java.util.UUID;

public record UserInfo(String name, String surname, UUID userId, String email, Boolean email_verify) {
}
