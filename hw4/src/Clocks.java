public class Clocks {

    int numOfComb;

    public Clocks(){
        numOfComb = 0;
    }

    public void calculateNum(){

        for(int i=0; i < 24; i++){
            for(int j=0; j < 60; j++){
                if(i/10 == j%10 && i%10 == j/10){
                    numOfComb++;
                }
            }
        }
        System.out.println(numOfComb);
    }
}
