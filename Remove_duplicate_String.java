public class Remove_duplicate_String {
        public static void main(String[] args) {
            String input = "hello";
            String result = removeDuplicates(input);
            System.out.println(result); // Output: helo
        }
    
        public static String removeDuplicates(String input) {
            StringBuilder output = new StringBuilder();
    
            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                boolean duplicate = false;
    
                // Check if the current character is already present in the output string
                for (int j = 0; j < output.length(); j++) {
                    if (output.charAt(j) == currentChar) {
                        duplicate = true;
                        break;
                    }
                }
    
                // If the current character is not a duplicate, add it to the output string
                if (!duplicate) {
                    output.append(currentChar);
                }
            }
    
            return output.toString();
        }
    }
    

