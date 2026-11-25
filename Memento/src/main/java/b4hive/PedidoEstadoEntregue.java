package b4hive;

public final class PedidoEstadoEntregue implements EstadoPedido {
    private static final PedidoEstadoEntregue INSTANCE = new PedidoEstadoEntregue();

    private PedidoEstadoEntregue() {
    }

    public static PedidoEstadoEntregue getInstance() {
        return INSTANCE;
    }

    @Override
    public String getNomeEstado() {
        return "Entregue";
    }
}
