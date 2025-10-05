# Java

## História:
- Criado em 1991;
- Projeto Green na Sun Microsystems(Oracle);
- Oak, antigo nome que já estava registrado, e mudaram pra Java pois era a o nome da onde vinnha o café que a equipe consumia;
- Hot Java, era um navegador modular extensível, implementado em Java e suportatava Applets Java(não mais suportado
- Pioneiro em aplicações dinamocas aplicadas em suas paginas web
- Utilizado em Aplicativos moveis nativos para indroid, sistemas empresariais robustos e escaláveis, aplicações Web, Sistemas embarcados etc;
- Mascote Java: <img width="200" height="245" alt="image" src="https://github.com/user-attachments/assets/ebc90ac7-5fa4-45f8-9bf3-6695e84da201" />
- Duke, criado por Joe Palrang inspirado em Star Trek;


## Vantagens de Aprendizado:
- Popularidade e demando no mercado;
- Aplicações em IA e Análise de Dados(Weka, DL4J, Mahout);
- Integração com Plataformas de Redes Sociais, como WhatsApp, FaceBook e outras(Meta for Developers);
  - Para enviar mensagens automatizadas pelo WhatsApp Business ou acessar e manipular dados do Facebook usando a Graph API do FaceBook(frameworks);
  - Dá para utilizar também o SpringSocial e ver twitter, LinkedIn e Facebook e etc...
- Portabilidade e plataforma Neutra: utilizando a sua maquina virtual(JVM), podendo escrever o código uma vez e executar em qualquer lugar que tenha suporte a JVM;
- Robustez e segurança: Confiavel e capaz de lidar com grandes volumes de dados e processos complexos sem comprometer seu desempenho, além disso tem sitemas de permissões para diferentes aplicações;
- Programação orientada a objetos;
- Grande comunidade e recursos de aprendizado;
- Grande Variedade de aplicações: como desenvolvimento Android, até sistemas de gerenciamento de banco de dados e muito mais;
- Uso em tecnologias de Hacking Ético e Segurança Cibernética. Ex.: Burp Suite, OWASP Zap;
- Uso de Java em IOTs e Cartões. "Coisas" inteligentes em casa, e Java Card;

## Conceitos Importantes:
- **Framework**: É a base de um sistema que já vem com estruturas já construídas, que define como um software deve ser estruturado e fornace um conjunto de ferramentas e componentes prontos pra ajudar a construir um programa ou aplicativo de forma mais rápida e organizada, sem ter que reinventar a roda a cada novo projeto;
- **API - Application Programming Inteface**: Interface de Programação de Aplicações, ela á como um guia de um quebra cabeça, e mostra a imagem final do que você quer montar e dá instruções sobre quais peças se encaixam. Ela mostra como os programas podem interagir entre si, e mostrando comandos que permitem essa cominucação;
- **Bibliotecas**: São como os conjuntos de peças do quebra cabeça que já estão pré-montados, são conjuntos prontos que te ajudam montar o quebra cabeça mais rápidamente no software, elas geralmente realizam tarefas comuns e você não precisa reescrever tudo do zero;
- **Módulos em Java**: São como seções que você pode trabalhar em uma de cada vez escolhendo os temas ou peças, e no final será reunido tudo num mesmo projeto. Ela ajuda organizar partes especificar do programa sem afetar o código todo;
- **Case Sensitive**: Minúsculo é dferente de Maiúsculo;
- **JVM**: Maquina virtual Java, é como se fosse um tradutor de auto nível para baixo nível;
  - **Portabilidade do código Java**: Permite que se possa usar vários tipos de SOs;
  - **Compatibilidade da JVM**: Embora o Código Java seja portátil, a JVM em si precisa ser especifica para cada sistema operacional(Windows, Mac, Linux, Android, etc) ou dispositivo;
 
## Compilação Java:
- **Compilação**: Transformação do código Java(alto-nível) para linguagem de maquina ou binário(baixo-nível);
- **Bytecode**: É um códido intermediário entre o código Java e o binário. Ele é gerado ao compilar o Java. Ele é um código universal que diferentes tecnologias de computador podem entender, e JVM é quem vai executar;
- **Multiplataforma**: Desde que você tenha uma JVM você pode interpretar seu código Java em varios SOs diferentes e hardwares vão compreender;
- **Arquivo .class**: É um arquivo gerado pelo compilador que contém o bytecode, que a JVM usa para executar o seu programa;

## Garbage Collector (coletor de lixo):
- **Acúmulo de lixo**: Num código de mais baixo nível o objeto destruído é necessário da um "Free" para que ele desocupe a memória;
- **Garbage Collector**: É como se fosse um ajudante que faz esse papel sem que o programador tenha que fazer esse processo nas linhas de código;
  - **É Automático**: Ele é automático então o programador naão tem que se preocupar com isso;
  - **JVM + GC**: a JVM faz o trabalho pesado fazendo com que todo o código seja executado corretamente, a limpeza é feita automaticamente pelo CG;
- **Exemplo**: Num programa que precisa executar configurações iniciais, uma vez que elas são aplicadas elas não precisam mais ser executadas no programa, então o GC tabalha na limpeza do programa relacionadas a essas variáveis e objetos
- **Conseiderações**: Se o programa tiver muita coisa utilizando a memória e principalmente coisa desnecessária ele pode travar e parar de funcionar, pois vai acabar o espaço destinado a aplicação. O GC do Java é extremamente eficiente;

## JRE & JDK:
- **JRE - Java Runtime Enviroment**: É uma caixa de ferramenta que contém tudo o que um programa Java precisa para ser executado, e contem a JVM, e todas as bibliotecas que o programa precisa pra funcionar corretamente
- **JDK - Java Development Kit**: Que é o Kit de desenvolvimento Java, que é uma caixa de ferramentas avançadas que contém tudo que você precisa para construir seu programa Java do zero. Além de todas as coisas que o JRE, O JDK também contém ferramentas extras que os programadores usam pra escrever e testar seus programas Java;
- **Diferença**: Se você vai apenas executar um programa feito, você precisa apenas do JRE, se você vai construir um programa, você precisa do JDK;

## Uso de IDE:
- **IDE - Integrated Developmente Enviroment(Ambiente integrado de Desenvolvimento)**: Trata-se de um software que reúne várias ferramentas em um só lugar. Por exemplo, uam IDE como o Eclipse, STS ou Intellij IDEA, oferece recursos como edição de código, compilação depuração, e até mesmo controle de versão, tudo em um único ambiente.
- **Sublime Text x Spring Tools**: No inicio do curso será usado o Sublime, a medida que for avançando será utilizada o STS que é insperado no Eclipse e otimizada para projetos Spring Boot.

## Versões do Java:
- **LTS - Long- Term Support**: Suporte de longo prazo; 
- **Não-LTS**: São versões mais novas, lançadas a cada 6 meses dom recursos modernos;
  - O Suporte é curto, pois são substituídas por outra versão.
- **LTS Gratuitas**: São distribuições baseadas em OpenJDK, mantidas por empresas como Amazon e Eclipse Fondation.
  - Oferecem suporte prolongado (5 anos ou mais) gratuitamente;
  - Usadas por empresas que preferem evitar custos, mas ainda querem estabilidade.
- **LTS Pagas**: O Oracle JDK oferece os mesmos recursos do OpenJDK e e pelo menos 8 anos de suporte;
  - Inclui suporte técnico pago ideal para empresas que precisam de garantias profissionais.
- **Conclusões**:
  - Todas as versões funcionam da mesma forma e executam o mesmo código Java;
  - A diferença está no tempo de suporte e na necessidade (ou não) de pagar pelo suporte técnico;
  - O OpenJDK é gratuito e amplamente usado, enquanto a Oracle JDK é paga para quem precisa de assistência especializada;
  - O OpenJDK é a implementação gratuita e aberta do Java, usada mundialmente;
  - A versão paga (Oracle JDK) é baseada no OpenJDK;
  - O OpenJDK é mantido pela comunidade e por empresas, incluindo a própria Oracle;
  - Oracle JDK e OpenJDK são praticamente idênticos — a principal diferença está no suporte e na licença;

 ## Recursos:
 - [JDK 22](https://openjdk.org/);
 - [JFX 22.0.x](https://openjfx.io/);
 - [Sublime Text](https://www.sublimetext.com/);

## Configurando ambiente Java:
- Com os arquivos baixados, crie uma pasta no C:/Java e lá guarde as pastas JDK 22 e JFX
- Após isso configure-as nas variaveis de ambiente:
  - Uma nova chamada JAVA_HOME com o caminho completo do JDK: <img width="403" height="23" alt="image" src="https://github.com/user-attachments/assets/095bea81-194b-4a20-a93a-64562d7f156e" />
  - Uma no Path com a pasta bin de JDK: <img width="276" height="24" alt="image" src="https://github.com/user-attachments/assets/3fa3bcb6-a6b3-4a46-ac44-9ed0eaa2d539" />
  - Outra nova chamada PATH_TO_FX com o caminho da lib dentro de JFX: <img width="524" height="17" alt="image" src="https://github.com/user-attachments/assets/dd44627a-7537-4435-9956-314babb44635" />
- Agora teste no cmd com ```java -version```: <img width="605" height="105" alt="image" src="https://github.com/user-attachments/assets/8b5738bc-7180-44b8-b68f-13035a0732f9" />
- E o ```javac -version``` para conseguirmos programar: <img width="348" height="35" alt="image" src="https://github.com/user-attachments/assets/9b597dd4-3ece-4cb8-a5ff-581851bee6b0" />

## Fonte:
- https://www.udemy.com/course/curso-de-java-para-iniciantes-com-projetos/learn/lecture/45273057?start=0#overview
