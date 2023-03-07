package practical13;

import static practical13.Constants.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BigOrSmallGame {
	public int gamePlay(int count,int score) {
		Scanner scanner=new Scanner(System.in);
		RandomNumberGenerator random=new RandomNumberGenerator();
		int firstNum=0; //一つ目の数字
		int secondNum=0; //二つ目の数字
		Player player=new Player();
		System.out.println(String.format("残りプレイ回数: %d", count));
		System.out.println(String.format("スコア: %d",score));

		firstNum=random.generateRandom();
		secondNum=random.generateRandom();
		System.out.println(String.format("現在の数値: %d", firstNum));
		boolean isInput=false;
		do{
			try {
				System.out.println("次の数値は Big or Small?(Big: 0 Small: 1)");
				player.setPlayer(scanner.nextInt());
				if(player.getInt()!=0 && player.getInt()!=1) {
					System.out.println("0または1で入力してください。");
				}else {
					isInput=true;
				}
			}catch(InputMismatchException e) {
				System.out.println("不正な入力です。");
				scanner.next();
				}
		}while(isInput==false);

		System.out.println(String.format("あなたの予測： %s",player.getStr()));
			int result;
			if(firstNum==secondNum) {
				System.out.println(String.format("現在の数字: %d 次の数字: %d DRAW",firstNum,secondNum));
				return DRAW;
			}else if(firstNum<secondNum) {
				System.out.println(String.format("現在の数字: %d 次の数字: %d Big",firstNum,secondNum));
				result=BIG;
			}else {
				System.out.println(String.format("現在の数字: %d 次の数字: %d Small",firstNum,secondNum));
				result=SMALL;
			}
			if(player.getInt()==result) {
				System.out.println("当たり！");
				return WIN;
			}else{
				return LOSE;
			}

		}
	}