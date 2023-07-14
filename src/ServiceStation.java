public class ServiceStation implements Service {
    public void check(Transport transport) {
        if (transport != null) {
            System.out.println("Обслуживаем" + transport.getModelName());
            transport.service();
        }
    }
}