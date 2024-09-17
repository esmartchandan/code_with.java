// import java.util.HashMap;
// import java.util.Map;
// import java.util.Random;
// import java.util.Scanner;

// public class SnakeAndLadder {

//     // Board size
//     private static final int WIN_POINT = 100;

//     // Snakes and ladders
//     private static final Map<Integer, Integer> snakes = new HashMap<>();
//     private static final Map<Integer, Integer> ladders = new HashMap<>();

//     static {
//         // Snakes
//         snakes.put(99, 54);
//         snakes.put(70, 55);
//         snakes.put(52, 42);
//         snakes.put(25, 2);
//         snakes.put(95, 72);

//         // Ladders
//         ladders.put(6, 25);
//         ladders.put(11, 40);
//         ladders.put(60, 85);
//         ladders.put(46, 90);
//         ladders.put(17, 69);
//     }

//     // Player position
//     private int playerPosition = 0;

//     // Roll dice
//     private int rollDice() {
//         Random rand = new Random();
//         return rand.nextInt(6) + 1;
//     }

//     // Check for snakes or ladders
//     private int checkSnakeOrLadder(int position) {
//         if (snakes.containsKey(position)) {
//             System.out.println("Oops! Snake found at " + position + ", going down to " + snakes.get(position));
//             return snakes.get(position);
//         } else if (ladders.containsKey(position)) {
//             System.out.println("Yay! Ladder found at " + position + ", going up to " + ladders.get(position));
//             return ladders.get(position);
//         }
//         return position;
//     }

//     // Play game
//     private void play() {
//         Scanner scanner = new Scanner(System.in);
//         while (playerPosition < WIN_POINT) {
//             System.out.println("Press 'r' to roll the dice");
//             String input = scanner.nextLine();
//             if (input.equals("r")) {
//                 int diceValue = rollDice();
//                 System.out.println("Dice rolled: " + diceValue);
//                 playerPosition += diceValue;

//                 if (playerPosition > WIN_POINT) {
//                     playerPosition -= diceValue; // If the player exceeds 100, stay in the same place
//                     System.out.println("You need an exact dice roll to reach " + WIN_POINT);
//                 } else {
//                     playerPosition = checkSnakeOrLadder(playerPosition);
//                     System.out.println("Player is now at position: " + playerPosition);
//                 }

//                 if (playerPosition == WIN_POINT) {
//                     System.out.println("Congratulations! You have won the game.");
//                     break;
//                 }
//             } else {
//                 System.out.println("Invalid input. Please press 'r' to roll the dice.");
//             }
//         }
//         scanner.close();
//     }

//     public static void main(String[] args) {
//         SnakeAndLadder game = new SnakeAndLadder();
//         game.play();
//     }
// }







import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SnakeAndLadderUI extends JFrame {
    private static final int WIN_POINT = 100;
    private static final Map<Integer, Integer> snakes = new HashMap<>();
    private static final Map<Integer, Integer> ladders = new HashMap<>();
    private int playerPosition = 1;
    private JLabel playerLabel;
    private JLabel diceLabel;
    private JButton rollDiceButton;

    static {
        // Initialize Snakes
        snakes.put(99, 54);
        snakes.put(70, 55);
        snakes.put(52, 42);
        snakes.put(25, 2);
        snakes.put(95, 72);

        // Initialize Ladders
        ladders.put(6, 25);
        ladders.put(11, 40);
        ladders.put(60, 85);
        ladders.put(46, 90);
        ladders.put(17, 69);
    }

    public SnakeAndLadderUI() {
        setTitle("Snake and Ladder");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // UI Components
        JPanel boardPanel = new BoardPanel();
        boardPanel.setPreferredSize(new Dimension(500, 500));
        
        JPanel controlPanel = new JPanel();
        diceLabel = new JLabel("Dice Roll: ");
        playerLabel = new JLabel("Player Position: 1");
        rollDiceButton = new JButton("Roll Dice");
        rollDiceButton.addActionListener(new RollDiceListener());

        controlPanel.add(diceLabel);
        controlPanel.add(playerLabel);
        controlPanel.add(rollDiceButton);

        add(boardPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // Panel for the game board
    private class BoardPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBoard(g);
            drawSnakesAndLadders(g);
            drawPlayer(g);
        }

        private void drawBoard(Graphics g) {
            int tileSize = 50;
            int tileNum = 1;

            for (int row = 9; row >= 0; row--) {
                for (int col = 0; col < 10; col++) {
                    int x = col * tileSize;
                    int y = row * tileSize;
                    g.drawRect(x, y, tileSize, tileSize);
                    g.drawString(String.valueOf(tileNum), x + 20, y + 30);
                    tileNum++;
                }
            }
        }

        private void drawSnakesAndLadders(Graphics g) {
            // Draw ladders (green lines)
            g.setColor(Color.GREEN);
            drawLadder(g, 6, 25);
            drawLadder(g, 11, 40);
            drawLadder(g, 60, 85);
            drawLadder(g, 46, 90);
            drawLadder(g, 17, 69);

            // Draw snakes (red lines)
            g.setColor(Color.RED);
            drawSnake(g, 99, 54);
            drawSnake(g, 70, 55);
            drawSnake(g, 52, 42);
            drawSnake(g, 25, 2);
            drawSnake(g, 95, 72);
        }

        private void drawSnake(Graphics g, int head, int tail) {
            Point headPos = getPosition(head);
            Point tailPos = getPosition(tail);
            g.drawLine(headPos.x, headPos.y, tailPos.x, tailPos.y);
        }

        private void drawLadder(Graphics g, int bottom, int top) {
            Point bottomPos = getPosition(bottom);
            Point topPos = getPosition(top);
            g.drawLine(bottomPos.x, bottomPos.y, topPos.x, topPos.y);
        }

        private void drawPlayer(Graphics g) {
            Point playerPos = getPosition(playerPosition);
            g.setColor(Color.BLUE);
            g.fillOval(playerPos.x - 10, playerPos.y - 10, 20, 20);
        }

        private Point getPosition(int position) {
            int row = 9 - (position - 1) / 10;
            int col = (position - 1) % 10;
            if (row % 2 == 0) {
                col = 9 - col; // Reverse direction for even rows
            }
            return new Point(col * 50 + 25, row * 50 + 25); // Center the player in the tile
        }
    }

    // Event listener for rolling the dice
    private class RollDiceListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Random rand = new Random();
            int diceValue = rand.nextInt(6) + 1;
            diceLabel.setText("Dice Roll: " + diceValue);

            // Update player position
            playerPosition += diceValue;
            if (playerPosition > WIN_POINT) {
                playerPosition -= diceValue; // Stay in place if beyond 100
            } else {
                // Check if snake or ladder exists at new position
                if (snakes.containsKey(playerPosition)) {
                    playerPosition = snakes.get(playerPosition);
                    JOptionPane.showMessageDialog(null, "Oops! Snake bite!");
                } else if (ladders.containsKey(playerPosition)) {
                    playerPosition = ladders.get(playerPosition);
                    JOptionPane.showMessageDialog(null, "Yay! You climbed a ladder!");
                }
            }

            playerLabel.setText("Player Position: " + playerPosition);

            // Check for win
            if (playerPosition == WIN_POINT) {
                JOptionPane.showMessageDialog(null, "Congratulations! You have won the game!");
                rollDiceButton.setEnabled(false); // Disable dice roll after winning
            }

           
            repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SnakeAndLadderUI());
    }
}
