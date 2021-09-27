public class Lab02 { //Zachariah Friesen 100783192
    public static double[] map(double[] list, UnaryFunction f){ //arguements for map function
        for (int i = 0; i < list.length; i++){ //runs through array and applies function f to each double
            list[i] = f.exec(list[i]);
        }
        return list; //returns new array
    }
    public static void main(String[] args){
        double[] doubles = {1.0,2.0,3.0,4.0,5.0}; //original array
        UnaryFunction Doubler = (double x) -> {return x*2;};
        double[] output = map(doubles, Doubler); //map is called with original array and unary function
        System.out.print("{");
        for (int i = 0; i < output.length; i++){ //for loop prints out array
            if (i+1 == output.length){
                System.out.print(output[i]);
            }else {
                System.out.print(output[i] + ",");
            }
        }
        System.out.print("}");
        System.out.println(" ");
        Song sed = new Song("The Ramones", "I Wanna be Sedated", 148);
        Song one = new Song("Daft Punk", "One More Time", 322);

        Song.collectionName = "Randy's Collection";
        System.out.println("Collection: " + Song.collectionName);

        System.out.println(sed); // this will invoke the toString() function on the Song instance 'sed'
        System.out.println(one);
    }

}