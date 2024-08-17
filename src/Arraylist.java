import java.util.ArrayList;

public class Arraylist {
    ArrayList<Integer> array= new ArrayList<>();
    public void addArray(Integer i){
        array.add(i);
    }
    public void info(){
        System.out.println(array.toString());
    }
    public void delete(int index){
        int count=0;
        try {
            for (int in:array) {
                if(array.indexOf(in)==index){
                    array.remove(index);
                    count++;
                }
            }if(count>0){
                System.out.println("uspeshno udaleno");
            }else throw new Exception();
        }catch (Exception exx){
            System.out.println("Index null");
        }
    }
    public void setArrayIndex(int index,int element){
        array.set(index,element);
    }
    public boolean proverka(int element){
        return array.contains(element);
    }
}

