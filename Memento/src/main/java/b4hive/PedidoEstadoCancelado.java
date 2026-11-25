package b4hive;

public final class PedidoEstadoCancelado implements EstadoPedido {
    private static final PedidoEstadoCancelado INSTANCE = new PedidoEstadoCancelado();

    private PedidoEstadoCancelado() {
    }

    public static PedidoEstadoCancelado getInstance() {
        return INSTANCE;
    }

    @Override
    public String getNomeEstado() {
        return "Cancelado";
    }
}
