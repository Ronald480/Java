public class revisit {
    public static void main(String[] args) {
//        // Scanner for name input
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("Please enter your full name: ");
//        String username = userInput.nextLine();
//        String greeting = "Hello " + username + ", welcome to Java";
//
//        // Scanner for number input
//        System.out.println("Please enter a number: ");
//        int newNumber;
//        while (true) {
//            try {
//                newNumber = userInput.nextInt();
//                break; // Exit the loop if input is valid
//            } catch (Exception e) {
//                System.out.println("Invalid input. Please enter a valid number: ");
//                userInput.next(); // Clear the invalid input
//            }
//        }
//        userInput.close(); // Close the scanner after all inputs are read
//
//        // Ternary operator to determine school number
//        int schoolNumber = (newNumber == 1) ? 1 : 1480;
//
//        // Output the greeting and school number
//        System.out.println(greeting + ", your school number is: " + schoolNumber);
//
//        //HASHSET AND HASHMAPS
//        Set<String> stdNames = new HashSet<>();
//        stdNames.add("Ronald");
//        stdNames.add("Adu");
//        stdNames.add("Mensah");
//        System.out.println(stdNames);
//
//        Map <String , String> stdHalls = new HashMap<>();
//        stdHalls.put("Ronald Adu-Mensah", "R&M");
//        stdHalls.put("Charles Cornah Buckle" , "Government Hill");
//        stdHalls.put("Ibrahim Dassana" , "Gold Hall");
//        System.out.println(stdHalls);
//
//        //ITERATION USING FOR LOOP
//        for(Map.Entry<String , String> stdHallsEntries: stdHalls.entrySet()){
//            System.out.println("Key: "+stdHallsEntries.getKey()+",  Value: "+stdHallsEntries.getValue());
//        }

//        //MAPS WITH ARRAYLISTS
//        Map<String , ArrayList<Integer>> stdMap = new HashMap<>();
//
//        ArrayList<Integer> NiiArr = new ArrayList<>(Arrays.asList(78, 68, 82));
//        ArrayList<Integer> FelicityArr = new ArrayList<>(Arrays.asList(80, 73));
//        ArrayList<Integer> EveleynArr = new ArrayList<>(Arrays.asList(72, 81, 75));
//        ArrayList<Integer> SamuelisArr = new ArrayList<>(Arrays.asList(83, 76, 65, 93));
//        ArrayList<Integer> BertinaArr = new ArrayList<>(Arrays.asList(85, 70, 77));
//
//        stdMap.put("Nii" , NiiArr);
//        stdMap.put("Felicity" , FelicityArr);
//        stdMap.put("Evelyn" , EveleynArr);
//        stdMap.put("Samuelis" , SamuelisArr);
//        stdMap.put("Bertina" , BertinaArr);
//
//        System.out.println(stdMap);
//        stdMap.remove("Felicity",FelicityArr);
//        system.out.print(stdMap);
        //WORKING WITH CLASSES AND OBJECTS
//        rectangularBox Box1 = new rectangularBox(1,2,3);
//        System.out.println("Volume of the box is: "+Box1.findVolume());
//        System.out.println("Area of the box is: "+Box1.findArea());

//         unistd std1 = new unistd("Ronald Adu-Mensah", 901221862, "Computer Science and Engineering", "R&M Hostel", 2003, 68.07);
//         unistd std2 = new unistd("Vanessa Adu-Mensah", 901331863,69.07);
//        System.out.println("STUDENT One's CREDENTIALS: ");
//        System.out.println(std1.Name);
//        System.out.println(std1.yearOfBirth);
//        System.out.println(std1.indexNumber);
//        System.out.println(std1.cwa);
//        System.out.println(std1.Department);
//        System.out.println(std1.hallOfResidence);
//        System.out.println("YEAR OF BIRTH FOR BOTH STUDENTS: ");
//        System.out.println(std1.getstdAge(2003));
//        System.out.println(std2.getstdAge(1997));
        double [][] roy = {
                 {1.1,1.2,1.3},
                 {2.1,2.2,2.3},
                 {3.1,3.2,3.3}
        };
        double average = findAverage(roy);
        System.out.println("The average of the numbers is: "+ average);

    }
        public static double findAverage(double[][] roy) {
        double sum = 0;
        int totalelements = 0;
        for(int i = 0; i< roy.length; i++){
            for(int j = 0; j< roy[i].length; j++)
            sum += roy[i][j];
            totalelements++;
        }
            return sum / totalelements;
        }

    public static void printContent(double[][] roy) {
        for(int i = 0; i<roy.length; i++){
            for(int j = 0; j< roy.length; j++) {
                System.out.println(roy[i][j]);
            }
        }
    }
}
