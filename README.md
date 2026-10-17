# Programação Orientada a Objetos em Java — Exercícios

Listas de exercícios, atividades e provas da disciplina de **Programação Orientada a Objetos (P3)** do curso de Ciência da Computação da UNICAP. O repositório vai da revisão de estruturas básicas até herança, polimorfismo, classes abstratas, interfaces, coleções e exceções.

## Conteúdo

| Pasta | Tema | Exemplos de classes |
|---|---|---|
| `EstruturasBasicasListas/` | Revisão de estruturas básicas (listas 3 a 5) | `Lista3`, `Lista4`, `Lista5` |
| `Atividade7/` | Classes, objetos e associação | `Lutador`/`Luta`, `Medico`/`Paciente`, `Post` |
| `Atividade8/` | Composição e agregação | `CarrinhoDeCompras`/`Item`, `ContaBancaria`, `BancoDeDados` |
| `Atividade9/` | Coleções de objetos | `Pedidos`/`ItemPedidos`, `Funcionario`, `Alunos` |
| `Atividade Extra/` | Herança e pilha de objetos | `Caixa`, `CaixaFragil`, `PilhaDeCaixas` |
| `Atividade11/` | Herança a partir de diagrama UML | `Funcionario` → `Professor`, `Coordenador`, `Diretor`, `Secretario` |
| `Atividade12/` | Classe abstrata e polimorfismo | `ItemBiblioteca` → `Livro`, `DVD`, `Revista`; `Locacao` |
| `Atividade13/` | Coleções: `List`, `Set` e `Map` | `TesteHashSetCPF`, `TesteMapaAluno`, `ConjuntoDePalavras` |
| `Atividade14/` | Exceções personalizadas | `SaldoInsuficienteException`, `DimensoesInvalidasException` |
| `Atividade15/` | Interfaces e desacoplamento | `ModoVenda`, `NotificacaoVenda`, `VendaOnline`, `VendaLojaFisica` |
| `Banco/` | Sistema bancário com herança | `Conta` → `ContaCorrente`, `ContaPoupanca`; `Cliente` |
| `Prova3/` | Prova: interface e exceção | `IOperacoes`, `Usuario` → `Aluno`, `Professor`, `Coordenador` |

## Como executar um exercício

Cada pasta é independente. Por exemplo:

```bash
cd Banco
javac *.java
java TesteOperacoes
```

Nas pastas que usam `package` (como `Atividade15/Questão1`), compile a partir da raiz do repositório:

```bash
javac Atividade15/Questão1/*.java
java Atividade15.Questão1.<ClassePrincipal>
```

## Tecnologias

Java

---

Feito por [João Pedro Pimenta](https://www.linkedin.com/in/joao-pedro-pimenta/) durante a graduação em Ciência da Computação na UNICAP.
