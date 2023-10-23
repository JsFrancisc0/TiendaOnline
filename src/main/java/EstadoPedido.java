public enum EstadoPedido {
    NUEVO,
    CREADO,
    DESPACHADO,
    RECIBIDO,
    CERRADO;
    private String estado;

    private void estadoPedido(String estado) {
        throw new UnsupportedOperationException();
    }

    public String getEstado() {
        return this.estado;
    }
}