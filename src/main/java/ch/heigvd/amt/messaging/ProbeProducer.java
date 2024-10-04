package ch.heigvd.amt.messaging;

import io.quarkus.scheduler.Scheduled;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProbeProducer {

    @Scheduled(every = "1s")
    public void checkProbes() {
        System.out.println("Checking probes...");
    }

}
