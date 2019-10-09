package no.bouvet.sandvika.ai;

import java.util.List;

import no.bouvet.sandvika.ai.response.Klassifikasjon;

public interface NeoplastikkApi
{
    Klassifikasjon klassifiserCelle(List<Double> celleData);
}
