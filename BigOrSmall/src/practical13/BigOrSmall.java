package practical13;

import static java.nio.file.StandardOpenOption.*;
import static practical13.Constants.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
public class BigOrSmall {
	public static void main(String[] args) {
		BigOrSmall bigOrSmall=new BigOrSmall();
		int score=bigOrSmall.play();
		System.out.println("GAME OVER");
		System.out.println(String.format("スコア: %d", score));

		//ログをoutput.txtに記録
		try{
			ZonedDateTime zonedDateTime = ZonedDateTime.now();
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss Z");
			String date=dateTimeFormatter.format(zonedDateTime);
			List<String> log=new ArrayList<>();
			log.add(String.format("スコア: %d %s",score,date));
			Path  path=Paths.get("src\\practical13\\log.txt").toAbsolutePath();
			Files.write(path,log,APPEND);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public int play() {
		BigOrSmallGame bigOrSmallGame=new BigOrSmallGame();
		int score=0;
		int continuity=0;
		int count=10;
		int result=0;
		System.out.println("Big or Smallをプレイします。");
		do {
			result=bigOrSmallGame.gamePlay(count,score);
			 if(result==WIN) {
				score+=100;
				continuity+=1;
				score+=100*(continuity-1);
				count-=1;
			}else if(result==LOSE) {
				continuity=0;
				count-=1;
			}
			System.out.println("");
		}while(count>0);
		return score;
	}
}
