# Comandos Git

Este repositório contém exemplos de comandos Git que podem ser úteis durante o desenvolvimento de projetos.

## Configurações Iniciais

- `git config --global user.name <nome>`:
  - Configura o nome associado aos commits do Git.
- `git config --global user.email <endereco-de-email>`:
  - Configura o email associado aos commits do Git.

## Inicialização de um Repositório

- `git init <nome-do-projeto>`:
  - Cria um novo repositório local com o nome especificado para o projeto.

## Clonagem e Download de Projetos

- `git clone <url>`:
  - Faz o download de um projeto Git, incluindo toda a sua história.

## Navegação e Manipulação de Arquivos e Pastas

- `ls`:
  - Lista todas as pastas.
- `cd <nome da pasta>`:
  - Entra em uma pasta.
- `clear`:
  - Limpa o terminal do Git.

## Verificação e Preparação de Alterações

- `git status`:
  - Lista todos os arquivos modificados no projeto atual.
- `git diff`:
  - Mostra as diferenças linha a linha dos arquivos alterados (pré-stage).
- `git diff --staged`:
  - Mostra as diferenças linha a linha dos arquivos preparados e alterados pré-stage.
- `git add <ficheiro>`:
  - Adiciona um arquivo à área de preparação para que possa ser incluído em commits (staged).
- `git add .`:
  - Prepara todos os arquivos para que possam ser incluídos em commits (staged).
- `git reset`:
  - Retira as modificações do staged.

## Desfazendo Alterações

Para desfazer modificações não salvas:
- `git reset`:
  - Primeiro comando.
- `git clean -df`:
  - Segundo comando.
- `git checkout -- .`:
  - Terceiro comando.

Para desfazer o último commit sem desfazer as modificações nos arquivos:
- `git reset --soft HEAD~1`:
  - Desfaz o último commit sem apagar as alterações.

Para deletar commits e também modificações nos arquivos:
- `git reset --hard <codigo do commit>`:
  - Deleta tudo do commit para frente.
- `git reset --hard HEAD~1`:
  - Volta o projeto para o estado do último commit.

## Visualização de Histórico

- `git log`:
  - Mostra o histórico de versões.
- `git log --oneline`:
  - Mostra o histórico de versões resumido.

## Commit de Alterações

- `git commit -m <mensagem descritiva>`:
  - Guarda as alterações preparadas permanentemente no histórico de versões.

## Manipulação de Branches

- `git branch`:
  - Lista todos os branches locais no repositório atual.
- `git branch <nome-do-branch>`:
  - Cria um novo branch.
- `git checkout <nome-do-branch>`:
  - Muda para o branch especificado e atualiza o diretório de trabalho.
- `git merge <nome-do-branch>`:
  - Combina a história do branch especificado com o branch atual.
- `git branch -d [nome-do-branch]`:
  - Remove o branch especificado.

## Integração com Repositórios Remotos

- `git push <remote> <branch>`:
  - Envia todos os commits do branch local para o GitHub.
- `git pull origin`:
  - Atualiza o repositório local com as alterações do GitHub.

---

Este README fornece uma visão geral dos comandos Git presentes neste repositório. Sinta-se à vontade para contribuir com mais exemplos ou melhorias. Se precisar de mais informações, consulte a documentação oficial do Git.
