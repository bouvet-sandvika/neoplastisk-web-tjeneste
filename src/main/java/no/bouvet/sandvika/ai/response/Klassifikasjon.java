package no.bouvet.sandvika.ai.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Klassifikasjon
{
    private SvulstType svulstType;
}
