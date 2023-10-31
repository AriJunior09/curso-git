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
