public enum EstadoUsuario {
    NUEVO,
    ACTIVO,
    BLOQUEADO,
    PROHIBIDO;
    private String estado;

    private void estadoUsuario(String estado) {
        throw new UnsupportedOperationException();
    }

    public String getEstado() {
        return this.estado;
    }
}