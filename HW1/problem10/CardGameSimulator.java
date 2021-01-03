public class CardGameSimulator {
    private static final Player[] players = new Player[2];

    public static void simulateCardGame(String inputA, String inputB) {

        players[0] = new Player("A", inputA);
        players[1] = new Player("B", inputB);

        //players[0].naming("A");
        //players[1].naming("B");

        //players[0].sortCard(inputA);
        //players[1].sortCard(inputB);

        int[] numberA = new int[10];
        int[] numberB = new int[10];
        char[] shapeA = new char[10];
        char[] shapeB = new char[10];

        for(int i = 0; i < 10; i++) {
            numberA[i] = inputA.charAt(3*i) - '0';
            numberB[i] = inputB.charAt(3*i) - '0';
            shapeA[i] = inputA.charAt(3*i+1);
            shapeB[i] = inputB.charAt(3*i+1);
        }

        //Turn of A
        int maxNumber = 0;
        int temp1 = 10;
        int temp2 = 10;
        int temp3 = 10;
        int temp4 = 10;

        for(int i = 0; i < 10; i++) {
            maxNumber = Math.max(numberA[i], maxNumber);
        }
        for(int i = 0; i < 10; i++) {
            if(maxNumber == numberA[i]) {
                if(temp1 == 10) temp1 = i;
                else temp2 = i;
            }
        }

        if(shapeA[temp1] == 'O') {
            players[0].playCard(players[0].putCard(temp1));
            temp3 = temp1;
            temp4 = numberA[temp1];
            numberA[temp1] = -1;
        }
        else if(shapeA[temp1] == 'X' && temp2 == 10) {
            players[0].playCard(players[0].putCard(temp1));
            temp3 = temp1;
            temp4 = numberA[temp1];
            numberA[temp1] = -1;
        }
        else if(shapeA[temp1] == 'X' && temp2 != 10) {
            players[0].playCard(players[0].putCard(temp2));
            temp3 = temp2;
            temp4 = numberA[temp2];
            numberA[temp2] = -1;
        }


        int temp;
        int temp5;

        do {
            maxNumber = -1;
            temp = 10;
            temp5 = 10;

            //Turn of B
            for(int i = 0; i < 10; i++) {
                if(numberB[i] == temp4) {
                    temp = i;
                }
                else if(shapeB[i] == shapeA[temp3]) {
                    maxNumber = Math.max(numberB[i], maxNumber);
                }
            }

            for(int i = 0; i < 10; i++) {
                if(maxNumber == numberB[i] && shapeB[i] == shapeA[temp3]) {
                    temp5 = i;
                }
            }

            if(maxNumber == -1 && temp == 10) {
                printLoseMessage(players[1]);
                break;
            }

            temp1 = 10;
            temp2 = 10;
            temp3 = 10;
            temp4 = 10;

            if(temp != 10) {
                players[1].playCard(players[1].putCard(temp));
                temp3 = temp;
                temp4 = numberB[temp];
                numberB[temp] = -1;
            }
            else {
                for(int i = 0; i < 10; i ++) {
                    if(maxNumber == numberB[i]) {
                        if(temp1 == 10) temp1 = i;
                        else temp2 = i;
                    }
                }

                if(temp5 != 10 && (shapeB[temp1] == shapeB[temp5] || shapeB[temp2] == shapeB[temp5])) {
                    players[1].playCard(players[1].putCard(temp5));
                    temp3 = temp5;
                    temp4 = numberB[temp5];
                    numberB[temp5] = -1;
                }
                else if(shapeB[temp1] == 'O') {
                    players[1].playCard(players[1].putCard(temp1));
                    temp3 = temp1;
                    temp4 = numberB[temp1];
                    numberB[temp1] = -1;
                }
                else if(shapeB[temp1] == 'X' && temp2 == 10) {
                    players[1].playCard(players[1].putCard(temp1));
                    temp3 = temp1;
                    temp4 = numberB[temp1];
                    numberB[temp1] = -1;
                }
                else if(shapeB[temp1] == 'X' && temp2 != 10) {
                    players[1].playCard(players[1].putCard(temp2));
                    temp3 = temp2;
                    temp4 = numberB[temp2];
                    numberB[temp2] = -1;
                }
            }

            maxNumber = -1;
            temp = 10;
            temp5 = 10;

            //Turn of A
            for(int i = 0; i < 10; i++) {
                if(numberA[i] == temp4) {
                    temp = i;
                }
                else if(shapeA[i] == shapeB[temp3]) {
                    maxNumber = Math.max(numberA[i], maxNumber);
                }
            }

            for(int i = 0; i < 10; i++) {
                if(maxNumber == numberA[i] && shapeA[i] == shapeB[temp3]) {
                    temp5 = i;
                }
            }

            if(maxNumber == -1 && temp == 10) {
                printLoseMessage(players[0]);
                break;
            }

            temp1 = 10;
            temp2 = 10;
            temp3 = 10;
            temp4 = 10;

            if(temp != 10) {
                players[0].playCard(players[0].putCard(temp));
                temp3 = temp;
                temp4 = numberA[temp];
                numberA[temp] = -1;
            }
            else {
                for(int i = 0; i < 10; i ++) {
                    if(maxNumber == numberA[i]) {
                        if(temp1 == 10) temp1 = i;
                        else temp2 = i;
                    }
                }
                if(temp5 != 10 && (shapeA[temp1] == shapeA[temp5] || shapeA[temp2] == shapeA[temp5])) {
                    players[0].playCard(players[0].putCard(temp5));
                    temp3 = temp5;
                    temp4 = numberA[temp5];
                    numberA[temp5] = -1;
                }
                else if(shapeA[temp1] == 'O') {
                    players[0].playCard(players[0].putCard(temp1));
                    temp3 = temp1;
                    temp4 = numberA[temp1];
                    numberA[temp1] = -1;
                }
                else if(shapeA[temp1] == 'X' && temp2 == 10) {
                    players[0].playCard(players[0].putCard(temp1));
                    temp3 = temp1;
                    temp4 = numberA[temp1];
                    numberA[temp1] = -1;
                }
                else if(shapeA[temp1] == 'X' && temp2 != 10) {
                    players[0].playCard(players[0].putCard(temp2));
                    temp3 = temp2;
                    temp4 = numberA[temp2];
                    numberA[temp2] = -1;
                }
            }

        } while(true);

    }

    private static void printLoseMessage(Player player) {
        System.out.printf("Player %s loses the game!\n", player);
    }
}


class Player {
    private String name;
    private Card[] deck = new Card[10];

    Player(String name, String input) {
        this.name = name;

        for(int i = 0; i < 10; i++) {
            deck[i] = new Card();
        }

        for(int i = 0; i < 10; i++) {
            deck[i].cardInfo(input, i);
        }
    }

    /*public void naming(String name) {
        this.name = name;
    }*/

    /*public void sortCard(String input) {
        for(int i = 0; i < 10; i++) {
            deck[i].cardInfo(input, i);
        }
    }*/

    public Card putCard(int i) {
        return deck[i];
    }

    public void playCard(Card card) {
        System.out.printf("Player %s: %s\n", name, card);
    }

    @Override
    public String toString() {
        return name;
    }
}


class Card {
    private int number;
    private char shape;

    public void cardInfo(String card, int i) {
        number = card.charAt(3*i) - '0';
        shape = card.charAt(3*i+1);
    }

    @Override
    public String toString() {
        return "" + number + shape;
    }
}

