import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class day2_part2 {

    public static void main(String[] args) throws IOException {
        System.out.println(new File("data.txt").getCanonicalPath());
        FileReader fl = new FileReader("data.txt");
        Scanner scan = new Scanner(fl);
        String line;
        int score = 0;

        while (scan.hasNextLine()) {
            line = scan.nextLine();
            score += calculateScore(line);
        }
        scan.close();
        System.out.println(score);
    }
    private static int calculateScore(String round) {
        int score = 0;
        char ch[] = round.toCharArray();
        char result = ch[2];
        char elf = ch[0];

        if (elf == 'B' && result == 'X') {
            score += 1;
        }else if (elf == 'C' && result == 'X') {
            score += 2;
        }else if (elf == 'A' && result == 'X') {
            score += 3;
        }else if (elf == 'A' && result == 'Y') {
            score += 4;
        }else if (elf == 'B' && result == 'Y') {
            score += 5;
        }else if (elf == 'C' && result == 'Y') {
            score += 6;
        }else if (elf == 'C' && result == 'Z') {
            score += 7;
        }else if (elf == 'A' && result == 'Z') {
            score += 8;
        }else if (elf == 'B' && result == 'Z') {
            score += 9;
        }
        return score;
    }
}
