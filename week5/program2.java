public class program2 {
  static String findDuplicateTeam(String[] teamNames) {
    for (int i = 0; i < teamNames.length; j++) {
      for (int j = i + 1; j < teamNames.length; j++) {
        if (teamNames[i].equals(teamNames[j])) {
          return teamNames[i];
        }
      }
    }
    return "No duplicate team Fielder";
  }

  public static void main(String[] args) {
    String[] arr = { "janith", "gp", "sri" };
    System.out.println(findDuplicateTeam(arr));
  }

}