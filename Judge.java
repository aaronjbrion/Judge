public class Judge{
	public int findJudge(int townNumber, int[][] trust){
   int [] trustList = new int[townNumber + 1];
   for(int i = 0; i < trust.length; i++){
     int[] item = trust[i];
     trustList[item[0]]--;
     trustList[item[1]]++;
   	}
   for(int i = 1; i <= townNumber; i++){
     if(trustList[i] == townNumber - 1){
        return i;
     	}
   	}
   return -1;
	}

 public static void main(String[] args){   
   Judge judgeOutput = new Judge();
   int[][] firstSet = {{1,2}};
   int[][] secondSet = {{1,3},{2,3}};
   int[][] thirdSet = {{1,3},{2,3},{3,1}};
   int[][] fourthSet = {{1,2},{2,3}};
   int[][] fifthSet = {{1,3},{1,4},{2,3},{2,4},{4,3}};
   System.out.println(judgeOutput.findJudge(2, firstSet));
   System.out.println(judgeOutput.findJudge(3, secondSet));
   System.out.println(judgeOutput.findJudge(3, thirdSet));
   System.out.println(judgeOutput.findJudge(3, fourthSet));
   System.out.println(judgeOutput.findJudge(4, fifthSet));
 	}
}