public class Story {

    public void chapterOne(){
        System.out.println("A noite se aproxima, a lua já surge no céu, estrelas vão se acendendo, e sob a luz do crepúsculo ");
        System.out.println("você está prestes a entrar na fase final da sua missão. Você olha para o portal à sua frente, e ");
        System.out.println("sabe que a partir desse ponto, sua vida mudará para sempre.\n");
        System.out.println("Memórias do caminho percorrido para chegar até aqui invadem sua mente. Você se lembra de");
        System.out.println("todos os inimigos já derrotados para alcançar o covil do líder maligno. Olha para seu ");
        System.out.println("equipamento de combate, já danificado e desgastado depois de tantas lutas. Você está a um ");
        System.out.println("passo de encerrar para sempre esse mal.\n");
        System.out.println("Buscando uma injeção de ânimo, você se força a lembrar o que te trouxe até aqui.");
        System.out.println("[Escolha sua motivação para invadir a caverna do inimigo e derrotá-lo: VINGANÇA, GLÓRIA]\n");
    }
    public void firstChoice(String choice){
        if (choice.equals("Glória") || choice.equals("Gloria") || choice.equals("glória") || choice.equals("gloria") || choice.equals("GLÓRIA") || choice.equals("GLORIA")){
            System.out.println("GLÓRIA: Você já consegue visualizar na sua mente o povo da cidade te recebendo de braços ");
            System.out.println("abertos, bardos criando canções sobre seus feitos heróicos, nobres te presenteando com jóias e ");
            System.out.println("diversas riquezas, taberneiros se recusando a cobrar por suas bebedeiras e comilanças. Desde");
            System.out.println("já, você sente o amor do público, te louvando a cada passo que dá pelas ruas, depois de destruir");
            System.out.println("o vilão que tanto assombrou a paz de todos. Porém, você sabe que ainda falta o último ato dessa");
            System.out.println("história. Você se concentra na missão. A glória o aguarda, mas não antes da última batalha.\n");
        }else if (choice.equals("Vingança") || choice.equals("Vinganca") || choice.equals("vingança") || choice.equals("vinganca") || choice.equals("VINGANÇA") || choice.equals("VINGANCA")){
            System.out.println("VINGANÇA: Imagens daquela noite trágica invadem sua mente. Você nem precisa se esforçar ");
            System.out.println("para lembrar, pois essas memórias estão sempre presentes, mesmo que de pano de fundo,");
            System.out.println("quando você tem outros pensamentos em foco, elas nunca o deixaram. Elas são o combustível");
            System.out.println("que te fizeram chegar até aqui. E você sabe que não irá desistir até ter vingado a morte daqueles ");
            System.out.println("que foram - e pra sempre serão - sua fonte de amor e desejo de continuar vivo. O maldito líder ");
            System.out.println("finalmente pagará por tanto mal causado na vida de tantos (e principalmente na sua).\n");
        }
    }

    public void chapterTwo(){
        System.out.println("Inspirado pelo motivo que te trouxe até aqui, você sente seu coração ardendo em chamas, suas ");
        System.out.println("mãos formigarem em volta da sua arma. Você a segura com firmeza. Seu foco está renovado. ");
        System.out.println("Você avança pelo portal.\n");
        System.out.println("A escuridão te envolve. Uma iluminação muito fraca entra pelo portal às suas costas. À sua");
        System.out.println("frente, só é possível perceber que você se encontra em um corredor extenso. Você só pode ir à");
        System.out.println("frente, ou desistir.\n");
        System.out.println("[seguir em frente ou desistir]\n");
    }

    public void secondeChoice(String choice){
        if (choice.equals("Seguir") || choice.equals("seguir") || choice.equals("SEGUIR")){
            System.out.println("SEGUIR: você caminha, atento a todos os seus sentidos, por vários metros, até visualizar a frente");
            System.out.println("uma fonte de luz, que você imagina ser a chama de uma tocha, vindo de dentro de uma porta ");
            System.out.println("aberta.\n");
        }else if (choice.equals("Desistir") || choice.equals("desistir") || choice.equals("DESISTIR")){
            System.out.println("DESISTIR: o medo invade o seu coração e você sente que ainda não está à altura do desafio. ");
            System.out.println("Você se volta para a noite lá fora e corre em direção à segurança.\n");
            System.exit(0);

        }
    }

    public void chapterThree(){
        System.out.println("Você se pergunta se dentro dessa sala pode haver inimigos, ou alguma armadilha, e pondera");
        System.out.println("sobre como passar pela porta.\n");
        System.out.println("[andando cuidadosamente, correndo, saltando]\n");
    }

    public void thirdChoice(String choice){
        if (choice.equals("Andando") || choice.equals("andando") || choice.equals("ANDANDO")){
            System.out.println("ANDANDO: Você toma cuidado e vai caminhando vagarosamente em direção à luz. Quando você ");
            System.out.println("pisa exatamente embaixo da porta, você sente o chão ceder levemente, como se tivesse pisado");
            System.out.println("em uma pedra solta. Você ouve um ruído de mecanismos se movimentando, e uma escotilha se");
            System.out.println("abre no teto atrás de você, no corredor. Flechas voam da escotilha em sua direção, e você salta ");
            System.out.println("para dentro da sala, porém uma delas te acerta na perna.\n");
        }else if (choice.equals("Correndo") || choice.equals("correndo") || choice.equals("CORRENDO")){
            System.out.println("CORRENDO: Você respira fundo e desata a correr em direção à sala. Quando passa pela porta,");
            System.out.println("sente que pisou em uma pedra solta, mas não dá muita importância e segue para dentro da sala, ");
            System.out.println("olhando ao redor à procura de inimigos. Não tem ninguém, mas você ouve sons de flechas");
            System.out.println("batendo na pedra atrás de você, e quando se vira, vê várias flechas no chão. Espiando pela ");
            System.out.println("porta, você entende que pisou em uma armadilha que soltou flechas de uma escotilha aberta no");
            System.out.println("teto, mas por sorte você entrou correndo e conseguiu escapar desse ataque surpresa.\n");
        }else if (choice.equals("Saltando") || choice.equals("saltando") || choice.equals("SALTANDO")){
            System.out.println("SALTANDO: Você se concentra e pula em direção à luz, saltando de antes da porta até o interior ");
            System.out.println("da sala.\n");
        }
    }

    public void chapterFour(){
        System.out.println("Você se encontra sozinho em uma sala quadrada, contendo uma porta em cada parede. Uma ");
        System.out.println("delas foi aquela pela qual você entrou, que estava aberta, e as outras três estão fechadas. A ");
        System.out.println("porta à sua frente é a maior das quatro, com inscrições em seu entorno em uma língua que você");
        System.out.println("não sabe ler, mas reconhece como sendo a língua antiga utilizada pelo inimigo. Você se aproxima");
        System.out.println("da porta e percebe que ela está trancada por duas fechaduras douradas, e você entende que");
        System.out.println("enfrentar o líder.\n");
        System.out.println("Você se dirige para a porta à direita.\n");
        System.out.println("PORTA DIREITA: Você se aproxima, tentando ouvir o que acontece porta adentro, mas não");
        System.out.println("escuta nada. Segura com mais força sua arma com uma mão, enquanto empurra a porta com a");
        System.out.println("outra. Ao entrar, você se depara com uma sala espaçosa, com vários equipamentos de batalha ");
        System.out.println("pendurados nas paredes e dispostos em armários e mesas. Você imagina que este seja o arsenal");
        System.out.println("do inimigo, onde estão guardados os equipamentos que seus soldados utilizam quando saem");
        System.out.println("para espalhar o terror nas cidades e vilas da região.\n");
        System.out.println("Enquanto seu olhar percorre a sala, você ouve a porta se fechando e gira rapidamente para olhar ");
        System.out.println("para trás. Ali, de pé entre você e a porta fechada, bloqueando o caminho do seu destino, está um ");
        System.out.println("dos capitães do inimigo. Um orque horrendo, de armadura, capacete e espada em punho, em ");
        System.out.println("posição de combate. Ele avança em sua direção.\n");
    }


    public void chapterFourPt2(String choice){
        System.out.println("Após derrotar o Armeiro, você percebe que seus equipamentos estão muito danificados, e olha ");
        System.out.println("em volta, encarando todas aquelas peças de armaduras resistentes e em ótimo estado.");
        if (choice.equals("Pegar") || choice.equals("pegar") || choice.equals("PEGAR")){
            System.out.println("“Você resolve usar os equipamentos do");
            System.out.println("inimigo contra ele, e trocar algumas peças suas, que estavam danificadas, pelas peças de");
            System.out.println("armaduras existentes na sala. De armadura nova, você se sente mais protegido para os desafios ");
            System.out.println("à sua frente. +5 de defesa");
        }else {
            System.out.println("Você decide que não precisa utilizar nada que venha das mãos do inimigo.");
        }
        System.out.println("Em uma mesa, você encontra uma chave dourada, e sabe que aquela chave abre uma das ");
        System.out.println("fechaduras da porta do líder inimigo. Você pega a chave e guarda numa pequena bolsa que leva ");
        System.out.println("presa ao cinto.\n");
    }

    public void chapterFive(){
        System.out.println("PORTA ESQUERDA: Você retorna à sala anterior e se dirige à porta da esquerda. Você se ");
        System.out.println("aproxima, tentando ouvir o que acontece porta adentro, mas não escuta nada. Segura com mais ");
        System.out.println("força sua arma com uma mão, enquanto empurra a porta com a outra. Ao entrar, você se depara ");
        System.out.println("com uma sala parecida com a do arsenal, mas em vez de armaduras, existem vários potes e ");
        System.out.println("garrafas de vidro com conteúdos misteriosos e de cores diversas, e você entende que o capitão ");
        System.out.println("que vive ali, realiza experimentos com diversos ingredientes, criando poções utilizadas pelos ");
        System.out.println("soldados para aterrorizar a região.");
        System.out.println("No fundo da sala, olhando em sua direção, está outro dos capitães do inimigo. Um orque ");
        System.out.println("horrendo, de armadura, cajado em punho, em posição de combate. Ele avança em sua direção.\n");
    }

    public void chapterFivePt2(String choice){
        System.out.println("Após derrotar o Alquimista, você olha em volta, tentando reconhecer alguma poção do estoque ");
        System.out.println("do inimigo. Em uma mesa, você reconhece uma pequena garrafa de vidro contendo um líquido");
        System.out.println("evemente rosado, pega a garrafa e pondera se deve beber um gole.");
        if (choice.equals("Beber") || choice.equals("beber") || choice.equals("BEBER")){
            System.out.println("Você se sente revigorado para seguir adiante! - RECUPEROU 100% DA VIDA");
        }else {
            System.out.println("Você fica receoso de beber algo produzido pelo inimigo.");
        }
        System.out.println("Ao lado da porta, você vê uma chave dourada em cima de uma mesa, e sabe que aquela chave");
        System.out.println("abre a outra fechadura da porta do líder inimigo. Você pega a chave e guarda na pequena bolsa ");
        System.out.println("que leva presa ao cinto.\n");
    }

    public void chapterSix(String choice){
        System.out.println("De volta à sala das portas, você se dirige à porta final. Coloca as chaves nas fechaduras, e a ");
        System.out.println("porta se abre. Seu coração acelera, memórias de toda a sua vida passam pela sua mente, e você");
        System.out.println("percebe que está muito próximo do seu objetivo final. Segura sua arma com mais firmeza, foca");
        System.out.println("no combate que você sabe que irá se seguir, e adentra a porta.\n");
        System.out.println("Lá dentro, você vê o líder sentado em uma poltrona dourada, com duas fogueiras de cada lado, e ");
        System.out.println("prisioneiros acorrentados às paredes.\n");
        System.out.println("Ele percebe sua chegada e se levanta com um salto, apanhando seu machado de guerra de ");
        System.out.println("lâmina dupla.");
        if (choice.equals("Atacar") || choice.equals("atacar") || choice.equals("ATACAR")){
            System.out.println("Você ataca primeiro.\n");
        }else {
            System.out.println("Você é atacado pelo líder\n");
        }
    }


    public void finalChapter(String choice){
        System.out.println("Você conseguiu!");
        if (choice.equals("Glória") || choice.equals("Gloria") || choice.equals("glória") || choice.equals("gloria") || choice.equals("GLÓRIA") || choice.equals("GLORIA")){
            System.out.println("GLÓRIA: O êxtase em que você se encontra não cabe dentro de si. Você se ajoelha e grita de");
            System.out.println("alegria. A glória o aguarda, você a conquistou.\n");
        }else if (choice.equals("Vingança") || choice.equals("Vinganca") || choice.equals("vingança") || choice.equals("vinganca") || choice.equals("VINGANÇA") || choice.equals("VINGANCA")){
            System.out.println("VINGANÇA: Você obteve sua vingança. Você se ajoelha e cai no choro, invadido por uma ");
            System.out.println("sensação de alívio e felicidade. Você se vingou, tudo que sempre quis, está feito. Agora você");
            System.out.println("pode seguir sua vida\n");
        }
        System.out.println("Você se levanta, olha para os prisioneiros, vai de um em um e os liberta, e todos vocês saem em ");
        System.out.println("direção à noite, retornando à cidade. Seu dever está cumprido.\n");
        System.out.println("FIM DE JOGO");
    }




}
