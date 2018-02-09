import java.util.ArrayList;
import java.util.Arrays;

public class StringPermutations
{
    public static void main(String[] args)
    {
        String[] permutations = permutations("cat");
        System.out.println(Arrays.toString(permutations));

        String[] words = {"me", "hip", "bear"};
        String[][] allPermutations = allPermutations(words);
        System.out.println(Arrays.deepToString(allPermutations));
    }

    /**
     * Finds all possible combinations with the letters in a word
     * @param str
     * @return
     */
    public static String[] permutations(String str)
    {
        ArrayList<String> kek = new ArrayList<String>();

        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i; j < str.length(); j++)
            {
                String keke = str.substring(i,j+1);
                if(!kek.contains(keke)) // if the arraylist already contains the string
                {
                    kek.add(keke);
                }
            }
        }

        String[] kappa = new String[kek.size()];

        for (int i = 0; i < kek.size(); i++)
        {
            kappa[i] = kek.get(i);
        }

        return kappa;
    }

    /**
     * Returns a 2D string array that returns permutations of all the strings in each array
     * @param strings
     * @return
     */
    public static String[][] allPermutations(String[] strings)
    {
        String[][] kek = new String[strings.length][];

        for (int r = 0; r < kek.length; r++)
        {
            for (int j = r; j < r + 1; j++)
            {
                int n = strings[j].length(); // length of each string in the array
                kek[r] = new String[n * (n + 1) / 2]; // new array is the length of n

                String[] lol = permutations(strings[r]); // uses permutations method to find combinations in strings[r]

                kek[r] = lol;
            }
        }

        return kek;
    }
}
