import java.io.*;

public class Day01 {

  static int part1() throws Exception {
    String filename = "Day01.txt";
    try (var inStream = Day01.class.getResourceAsStream(filename)) {
      if (inStream == null) {
        throw new RuntimeException(String.format("Could not read from %s", filename));
      }

      int floor = 0;
      var br = new BufferedReader(new InputStreamReader(inStream));
      for (int current = br.read(); current != -1; current = br.read()) {
        var c = (char) current;
        switch (c) {
          case '(' -> floor++;
          case ')' -> floor--;
          default -> throw new RuntimeException(String.format("Unexpected character found: %c", c));
        }
      }
      return floor;
    }
  }

  static int part2() throws Exception {
    String filename = "Day01.txt";
    try (var inStream = Day01.class.getResourceAsStream(filename)) {
      if (inStream == null) {
        throw new RuntimeException(String.format("Could not read from %s", filename));
      }

      int floor = 0, pos = 1;
      var br = new BufferedReader(new InputStreamReader(inStream));
      for (int current = br.read(); current != -1; current = br.read()) {
        var c = (char) current;
        switch (c) {
          case '(' -> floor++;
          case ')' -> floor--;
          default -> throw new RuntimeException(String.format("Unexpected character found: %c", c));
        }
        if (floor < 0) break;
        pos++;
      }
      return pos;
    }
  }
}
