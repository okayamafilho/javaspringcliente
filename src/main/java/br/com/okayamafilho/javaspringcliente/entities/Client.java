package br.com.seuprojeto.clientapi.entities;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cpf;
    private Double income;
    private LocalDate birthDate;
    private Integer children;

    public Client() {}

    public Client(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
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
        return children;
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    }

    public void setIncome(Double income) { 
        this.income = income; 
    }

    public void setBirthDate(LocalDate birthDate) { 
        this.birthDate = birthDate; 
    }

    public void setChildren(Integer children) { 
        this.children = children; 
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Client)) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
