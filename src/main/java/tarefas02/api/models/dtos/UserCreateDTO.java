package tarefas02.api.models.dtos;

import jakarta.validation.constraints.NotBlank; // Importação da anotação NotBlank para validação de campos não vazios
import jakarta.validation.constraints.Size; // Importação da anotação Size para validação de tamanho de campos
import lombok.AllArgsConstructor; // Importação da anotação AllArgsConstructor do Lombok para gerar construtor com todos os argumentos
import lombok.Data; // Importação da anotação Data do Lombok para gerar getters, setters, equals, hashCode e toString
import lombok.NoArgsConstructor; // Importação da anotação NoArgsConstructor do Lombok para gerar construtor sem argumentos

@AllArgsConstructor // Gera um construtor com todos os argumentos
@NoArgsConstructor // Gera um construtor sem argumentos
@Data // Gera getters, setters, equals, hashCode e toString


public class UserCreateDTO {       

    //Nome de usuário obrigatório na criação
    @NotBlank 
    @Size (min = 2, max = 100)
    private String username;

    //Senha obrigatória na criação
    @NotBlank
    @Size (min = 8, max = 60)
    private String password;
    
}
