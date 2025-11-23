package br.com.infortecnicos.app_cliente.mappers;

import br.com.infortecnicos.app_cliente.dtos.ClienteRequestDTO;
import br.com.infortecnicos.app_cliente.dtos.ClienteResponseDTO;
import br.com.infortecnicos.app_cliente.models.Cliente;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {

    public Cliente toEntity(ClienteRequestDTO dto) {
        Cliente cliente = new Cliente();
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
        return cliente;
    }

    public void updateEntity(ClienteRequestDTO dto, Cliente cliente){
        cliente.setNome(dto.getNome());
        cliente.setEmail(dto.getEmail());
    }

    public ClienteResponseDTO toDTO(Cliente cliente) {
        return new ClienteResponseDTO(cliente.getId(), cliente.getNome(), cliente.getEmail());
    }
}
