package com.gep.Foro_Challenge.subject;

public record SubjectDTO(
        Long user_id,
        String course,
        String title,
        String message,
        Boolean enable
) {
}
