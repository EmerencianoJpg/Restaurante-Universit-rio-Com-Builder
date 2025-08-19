
package Builder;

import ru.CardapioDados;

public class CardapioDadosBuilder {
    private String diaSemana;
    private String prato;
    private String bebida;
    private String sobremesa;

    public CardapioDadosBuilder comDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
        return this;
    }

    public CardapioDadosBuilder comPrato(String prato) {
        this.prato = prato;
        return this;
    }

    public CardapioDadosBuilder comBebida(String bebida) {
        this.bebida = bebida;
        return this;
    }

    public CardapioDadosBuilder comSobremesa(String sobremesa) {
        this.sobremesa = sobremesa;
        return this;
    }

    public CardapioDados build() {
        return new CardapioDados(diaSemana, prato, bebida, sobremesa);
    }
}

/*

Justificativas para escolha do padrão Builder:

Objetos com muitos atributos: Quando uma classe tem muitos atributos e a maioria deles é opcional ou configurável, criar construtores com muitos 
parâmetros pode tornar o código difícil de ler e usar. O padrão Builder ajuda a lidar com essa complexidade, permitindo que você defina apenas 
os atributos necessários.

Legibilidade do código: O padrão Builder melhora a legibilidade do código, tornando-o mais claro e compreensível. Os métodos encadeados permitem 
configurar cada atributo de maneira explícita, tornando óbvio o que está sendo definido.

Evita construtores telescópicos: Construtores telescópicos são uma antipattern em que você cria vários construtores com diferentes combinações de 
parâmetros. Isso pode levar a uma interface do usuário confusa e difícil de manter. O Builder elimina a necessidade de construtores telescópicos.

Flexibilidade: Com o padrão Builder, você pode criar diferentes configurações de objetos com facilidade, o que é útil quando você precisa criar 
objetos complexos com várias variações.


Breve descrição do padrão Builder:

O padrão Builder é um padrão de projeto de criação que separa a construção de um objeto complexo de sua representação. Ele fornece uma interface 
clara para construir um objeto passo a passo. Normalmente, consiste em uma classe principal que possui um construtor privado e uma classe interna 
(Builder) que permite configurar os atributos do objeto de maneira flexível.


Gabarito, propriedades e componentes do padrão Builder:

Classe principal (Produto): A classe principal representa o objeto a ser construído. Ela geralmente tem atributos que podem ser configurados durante 
a construção.

Classe Builder: A classe Builder é uma classe interna que fornece métodos para configurar os atributos do objeto. Ela permite que você encadeie 
chamadas de métodos para definir os valores dos atributos.

Métodos de configuração (comX): São métodos na classe Builder que permitem definir os valores dos atributos do objeto. Eles são geralmente 
nomeados de forma descritiva, como comNome, comIdade, etc.

Método de construção (build): É um método na classe Builder que cria uma instância do objeto com os valores configurados e retorna essa instância.


Uso do padrão Builder:

Crie uma classe que representa o objeto a ser construído, com atributos que podem ser configurados.

Crie uma classe interna (Builder) dentro da classe principal.

Na classe Builder, forneça métodos para configurar cada atributo do objeto.

Implemente um método build na classe Builder que cria e retorna uma instância do objeto com os valores configurados.

Os usuários da classe podem criar objetos complexos usando a classe Builder, encadeando chamadas de métodos para configurar os atributos desejados.

O construtor da classe principal deve ser privado para garantir que os objetos sejam criados apenas usando a classe Builder.

A classe principal pode ter um construtor vazio ou mínimo para definir os valores padrão dos atributos.

O padrão Builder é especialmente útil quando você tem muitos atributos opcionais, e a ordem de configuração não é relevante.


*/