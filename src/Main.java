public class Main {
    public static void main(String[] args) {
        Backend [] backends={new Java(),new Csharp(),new Python()};
        for (Backend back:backends){
            System.out.println(back.getClass());
            if(back instanceof Java){
                Java java=(Java)back;
                java.spring();
            }else if (back instanceof Csharp){
                Csharp csharp=(Csharp) back;
                csharp.dotNet();
            }else if (back instanceof Python){
                Python python=(Python) back;
                python.django();
            }
        }
    }
}