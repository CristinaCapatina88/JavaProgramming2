package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String  [] words = {"Java","C#", "Adam","Adam","Adam"};


        for (String each : words) {//each element during each execution
              int count = 0;

            for (String element : words) {//comparing each elem and count
                if (element.equals(each)) {
                    count++;
                }
            }
            if(count==1){//finfing the unique
                System.out.println(each);
        }

        }



    }
}
