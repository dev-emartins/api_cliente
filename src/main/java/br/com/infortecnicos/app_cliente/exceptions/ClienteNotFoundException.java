package br.com.infortecnicos.app_cliente.exceptions;

public class ClienteNotFoundException extends RuntimeException {
    public ClienteNotFoundException(Long id) {
        super("Cliente com id: " + id + " não encontrado." );
    }
}

