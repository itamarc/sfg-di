package guru.springframewk.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PT")
@Service("i18nService")
public class I18nPTGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Alô Mundo - PT";
    }
}
