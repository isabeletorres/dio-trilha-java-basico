class Pedido {
    private int id;
    private String cliente;
    private double valorTotal;

    public Pedido(int id, String cliente, double valorTotal) {
        this.id = id;
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void exibirPedido(){
        System.out.println(
                "Pedido #" + getId()
                + " - Cliente:  " + getCliente()
                        + " - Total: R$" + String.format("%.2f", getValorTotal())
        );
    }

}
