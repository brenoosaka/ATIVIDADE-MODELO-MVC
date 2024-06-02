# ATIVIDADE-MODELO-MVC
EXERCICIO EM JAVA DE UM PROGRAMA BASEADO NO MODELO MVC
Faça a atividade separando as classes em Model,View e Controller

 Crie um pacote para cada camada. 

Agenda : Você foi contratado para implementar um aplicativo de agenda eletrônica. Se
necessário você pode criar mais atributos e métodos do que o solicitado, contanto que faça
sentido. Não se esqueça de criar os métodos get e set para todos os atributos.

(A) Crie uma classe Contato que possui os seguintes atributos: nome (String), email (String),
telefone (int ou long int).

(B) Crie outra classe, chamada Agenda, que possui uma lista de contatos e um atributo para
armazenar o tamanho da Agenda (número de contatos cadastrados).

(C) Na classe Agenda crie os seguintes métodos:
 Adicionar contato - adiciona um contato à lista e atualize o tamanho da lista.
 Remover contato - excluir um contato da lista e atualiza o tamanho da Agenda.
Retorne ao usuário se a exclusão foi bem sucedida ou não (contato encontrado ou
não).
 Buscar contato por nome - busca um contato pelo nome e retorna o contato encon-
trado (instância da classe Contato).
 Buscar contato por email - busca um contato pelo email e retorna o contato encon-
trado (instância da classe Contato).
 Buscar contato por telefone - busca um contato pelo nome e retorna o contato en-
contrado (instância da classe Contato).

(D) Na classe main apresente um menu para o usuário com as seguintes opções:
1 Adicionar contato
2 Remover contato - caso o usuário não seja encontrado o usuário deve ser informado
3 Buscar contato por nome - caso o usuário não seja encontrado o usuário deve ser
informado
4 Buscar contato por email - caso o usuário não seja encontrado o usuário deve ser
informado
5 Buscar contato por telefone - caso o usuário não seja encontrado o usuário deve ser
informado
6 Consultar tamanho da Agenda - caso o usuário não seja encontrado o usuário deve
ser informado
7 Finalizar o programa só deve encerrar quando o usuário selecionar esta opção.
