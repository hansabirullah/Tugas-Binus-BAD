public class F4T2_MenaraHanoi {
    public static void main(String[] args) {
        int gedung = 6;
        towerhanoi(gedung,'A','B','C','d',
                'e', 'f');
    }
    public static void towerhanoi(int topN, char from,
                                  char inter1, char inter2, char inter3,
                                  char inter4, char to){
        if (topN==1){
            System.out.println("gedung 1 dari "+from+" ke "+to);
        } else{
            towerhanoi(topN-1, from, to, inter1, inter2, inter3, inter4);
            System.out.println("Gedung "+ topN+" dari "+from
            +" ke "+to);
            towerhanoi(topN-1,inter1,inter2, inter3, inter4, from,to);
        }
    }
}
