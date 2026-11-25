package b4hive;

public final class PedidoEstadoRecebido implements EstadoPedido {
    private static final PedidoEstadoRecebido INSTANCE = new PedidoEstadoRecebido();

    private PedidoEstadoRecebido() {
    }

    public static PedidoEstadoRecebido getInstance() {
        return INSTANCE;
    }

    @Override
    public String getNomeEstado() {
        return "Recebido";
    }
}
