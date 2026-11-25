package b4hive;

public final class PedidoEstadoEmPreparo implements EstadoPedido {
    private static final PedidoEstadoEmPreparo INSTANCE = new PedidoEstadoEmPreparo();

    private PedidoEstadoEmPreparo() {
    }

    public static PedidoEstadoEmPreparo getInstance() {
        return INSTANCE;
    }

    @Override
    public String getNomeEstado() {
        return "Em preparo";
    }
}
