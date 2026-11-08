void main() {
    int[][] quarters = {{100,150,70}, {88,92,103}, {75,45,90},{65,95,15}};
    String[] quartersNumber = {"Q1", "Q2", "Q3","Q4"};
    String[] shoes = {"Nike" , "Adidas" , "Reebok" };

    int total = 0;
    int average=0;
    int maximum = quarters[0][0];
    int minimum = quarters[0][0];

    System.out.println("Ultimate Shoe Sales");
    System.out.println("****************************************************************************");
    System.out.println("Quarters            Nike           Adidas         Reebok");
    System.out.println("****************************************************************************");

    System.out.printf("%-20s", " ");
    for (int i = 0; i < shoes.length; i++) {
        System.out.printf("%-15s", shoes[i]);
    }
    System.out.println();
    for (int quarterNumber = 0; quarterNumber < quarters.length; quarterNumber++) {
        System.out.printf("%-20s", quartersNumber[quarterNumber]);
        for (int shoe = 0; shoe < quarters[quarterNumber].length; shoe++) {
            System.out.printf("%-15d",quarters[quarterNumber][shoe]);

            total += quarters[quarterNumber][shoe];
            if(quarters[quarterNumber][shoe]> average){
                average=quarters[quarterNumber][shoe];
            }
            if (quarters[quarterNumber][shoe] > maximum) {
                maximum = quarters[quarterNumber][shoe];
            }
            if (quarters[quarterNumber][shoe] < minimum) {
                minimum = quarters[quarterNumber][shoe];
            }

        }
        System.out.println();

    }
    System.out.println("*****************************************************************************");
    System.out.println("Total :"+ total);
    System.out.println("Average:" + average);
    System.out.println("Minimu quarters:" + minimum);
    System.out.println("Maximum quarters:" + maximum);
    System.out.println("*****************************************************************************");
}