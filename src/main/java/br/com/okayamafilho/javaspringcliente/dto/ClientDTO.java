package br.com.okayamafilho.javaspringcliente.dto;

import java.time.LocalDate;

import br.com.okayamafilho.javaspringcliente.entities.Client;
import jakarta.validation.constraints.*;

public class ClientDTO {

    private Long id;

    //Nome não pode ser vazio 
    @NotBlank(message = "Campo nome não pode ser vazio")
    @Size(min = 3, max = 80, message = "Nome deve ter de 3 a 80 caracteres")
    private String name;

    @NotBlank(message = "Campo CPF não pode ser vazio")
    @Size(min = 11, max = 11, message = "CPF deve ter 11 caracteres")
    private String cpf;

    @NotNull(message = "Campo Renda não pode ser zeros")
    @PositiveOrZero(message = "Renda deve ser positiva")
    private Double income;

    @NotNull(message = "Campo Data aniversário obrigatório")
    @PastOrPresent(message = "Data aniversário não pode ser data futura")
    private LocalDate birthDate;

    @PositiveOrZero(message = "Quantidade de filhos ou filhas não pode ser negativa")
    private Integer children;

    public ClientDTO() {}

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        cpf = entity.getCpf();
        income = entity.getIncome();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() { 
        return id; 
    }

    public String getName() { 
        return name; 
    }

    public String getCpf() { 
        return cpf; 
    }

    public Double getIncome() { 
        return income; 
    }

    public LocalDate getBirthDate() {
         return birthDate; 
    }

    public Integer getChildren() { 
        return children; }
}
