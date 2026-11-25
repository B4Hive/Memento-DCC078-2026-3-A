package b4hive;

public final class PedidoEstadoPronto implements EstadoPedido {
    private static final PedidoEstadoPronto INSTANCE = new PedidoEstadoPronto();

    private PedidoEstadoPronto() {
    }

    public static PedidoEstadoPronto getInstance() {
        return INSTANCE;
    }

    @Override
    public String getNomeEstado() {
        return "Pronto";
    }
}
