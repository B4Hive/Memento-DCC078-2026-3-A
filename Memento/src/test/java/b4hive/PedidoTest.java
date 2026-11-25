package b4hive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PedidoTest {

    @Test
    void deveArmazenarHistoricoDeEstados() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        pedido.setEstado(PedidoEstadoPronto.getInstance());

        assertEquals(3, pedido.getHistorico().size());
        assertEquals("Pronto", pedido.getEstado().getNomeEstado());
    }

    @Test
    void deveRestaurarEstadoAnterior() {
        Pedido pedido = new Pedido();
        pedido.setEstado(PedidoEstadoRecebido.getInstance());
        pedido.setEstado(PedidoEstadoEmPreparo.getInstance());
        pedido.setEstado(PedidoEstadoPronto.getInstance());

        pedido.restaurarEstado(1);

        assertEquals("Em preparo", pedido.getEstado().getNomeEstado());
    }

    @Test
    void deveRejeitarIndiceInvalido() {
        Pedido pedido = new Pedido();

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> pedido.restaurarEstado(0));

        assertEquals("Índice inválido", exception.getMessage());
    }
}
