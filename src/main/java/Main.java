import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new BillingModule());

        /*
         * Now that we've got the injector, we can build objects.
         */
        BillingService billingService = injector.getInstance(BillingService.class);
    }
}

