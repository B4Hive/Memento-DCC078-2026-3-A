package b4hive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Pedido {
    private EstadoPedido estado;
    private final List<EstadoPedido> historico = new ArrayList<>();

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = Objects.requireNonNull(estado, "Estado do pedido não pode ser nulo");
        historico.add(estado);
    }

    public void restaurarEstado(int indice) {
        if (indice < 0 || indice >= historico.size()) {
            throw new IllegalArgumentException("Índice inválido");
        }
        estado = historico.get(indice);
    }

    public List<EstadoPedido> getHistorico() {
        return Collections.unmodifiableList(historico);
    }
}
