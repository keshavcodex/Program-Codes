package practices.CFC_classWork.recursion;

public class ratMaze {
    public static void ratInMazeWithoutReturnType(int sr, int sc, int er, int ec, String ans){
        if(sr == er && sc == ec){
            System.out.println(ans);
            return;
        }
        if (sc + 1 <= ec) {
            ratInMazeWithoutReturnType(sr, sc + 1, er, ec, ans+"H");
        }
        if (sr + 1 <= er) {
            ratInMazeWithoutReturnType(sr + 1, sc, er, ec, ans+"V");
        }
    }

    public static void ratInMaze(){
        ratInMazeWithoutReturnType(0,0,2,2,"");
    }

    public static void main(String[] args) {
        ratInMaze();
    }
}




