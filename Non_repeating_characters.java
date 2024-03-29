public class Non_repeating_characters  {
    public static void main(String[] args) {
                // Initializing variables.
                String str = "Rajkanya";
                int[] freq = new int[256];
        
                // Calculating frequency of each character.
                for (int i = 0; i < str.length(); i++) {
                    freq[str.charAt(i)]++;
                }
        
                System.out.print("The non repeating characters are: ");
                for (int i = 0; i < 256; i++) {
                    if (freq[i] == 1) {// Finding unique characters and printing them.
                        System.out.print((char) i + " ");
                    }
                }
            }
        }
        
        
    

