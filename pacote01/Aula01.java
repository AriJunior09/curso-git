package pacote01;

public class Aula01 {

    public static void main(String[] args){
        
       
        System.out.println();
        System.out.println("git config --global user.name <nome> = Configura o nome que ficará associado aos Git commits"); 
        // Escreva o "Nome" entre aspas

        System.out.println();
        System.out.println("git config --global user.email <endereco-de-email> = Configura o nome que ficará associado aos Git commits");
        // Escreva o "E-mail" entre aspas

        System.out.println();
        System.out.println("git init <nome-do-projeto> = Cria um novo repositório local com o nome de projeto especificado");

        System.out.println();
        System.out.println("git clone <url> = Faz download de um projeto, incluindo toda a sua história");

        System.out.println();
        System.out.println("ls = para listar todas as pastas");
        
        System.out.println();
        System.out.println("cd + <nome da pasta> =  para entrar em uma pasta");

        System.out.println();
        System.out.println("clear = Limpa o terminal do git");
        
        System.out.println();
        System.out.println("git status = para listar todos os ficheiros modificados no projecto atual");
        
        System.out.println();
        System.out.println("git diff = Mostra as diferenças linha a linha dos ficheiros alterados (pre-stage)");
    
        System.out.println();
        System.out.println("git diff --staged = Mostra as diferenças linha a linha dos ficheiros preparados e alterados pre-stage");
        
        System.out.println();
        System.out.println("git add = Adiciona um ficheiro à área de preparação para que possa ser incluído em commits (staged)");

        System.out.println();
        System.out.println("git add . = prepara tudo para que possa ser incluído em commits (staged)");

        System.out.println();
        System.out.println("git reset = retira as modificações do staged");


        System.out.println(); // Para desfazer modificações não salvas:
        System.out.println("git reset         = Primeiro comando");
        System.out.println("git clean -df     = Segundo comando");
        System.out.println("git checkout -- . = Terceiro comando");


        System.out.println(); // Desfazer o último commit sem desfazer as modificações  nos arquivos:
        System.out.println("git reset --soft HEAD~1  = Desfaz o último commit sem apagar as alterações");

        System.out.println(); // Deletar Commits e tambem modificações nos arquivos:
        System.out.println("git reset --hard <codigo do commit>  = Deleta tudo do commi para frente");
        System.out.println("git reset --hard HEAD~1  = Volta o projeto para o estado do último commit");
                            // ATENÇÃO! AS AÇÕES ACIMA SÃO DESTRUTIVAS!  CUIDADO! 



        System.out.println(); // O que fazer quando abre o editor VIM
        // No exemplo abaixo é quando o usuário faz um commit sem escrever a mensagem, nesse momento é aberto o VIM,
        // Para resolver isso faça o passo-a-passo abaixo.
        System.out.println("Digite i           = Para Habilitar o modo de edição para adicionar a mensagem do commit");
        System.out.println("<ESC>  :wq  <ENTER> = Sair do VIM salvando as alterações");
        System.out.println("<ESC>  :q!  <ENTER> = Sair do VIM descartando as alterações");


        System.out.println();
        System.out.println("git log = mostra o histórico de versões");

        System.out.println();
        System.out.println("git log --oneline = mostra o histórico de versões resumido");
       
        System.out.println();
        System.out.println("git reset <ficheiro> = Remove o ficheiro da área de preparação (staged) sem o remover do sistema de ficheiros");
       
        System.out.println();
        System.out.println("git commit -m <mensagem descritiva> = Guarda as alterações preparadas permanentemente no histórico de versões");
        // Escreva a "mensagem" entre aspas

        System.out.println();
        System.out.println("git branch = Lista todos os branches locais no repositório atual");    

        System.out.println();
        System.out.println("git branch <nome-do-branch> = Cria um novo branch");

        System.out.println();
        System.out.println("git checkout <nome-do-branch> = Muda para o branch especificado e atualiza o diretório de trabalho");

        System.out.println();
        System.out.println("git merge <nome-do-branch> = Combina a história do branch especificado com o branch atual");

        System.out.println();
        System.out.println("git branch -d [nome-do-branch] = Remove o branch especificado");

        System.out.println();
        System.out.println("git push <remote> <branch> = Envia todos os commits do branch local para o GitHub");

        System.out.println();
        System.out.println("git pull origin = Envia todos os commits para o GitHub");



    }
    
}
