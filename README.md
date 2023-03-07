# BigOrSmall
The game that guess the number "Big Or Small".

## 内容
Big Or Small ゲーム<br>
コンソール上で動作するプログラム、Javaにて制作<br>
仕様は以下の通り
- プレイヤーは、初めに表示された数字より次に表示される数字が大きいか小さいかを予想し、コンソールに入力する
- ゲームを10回行い、最終スコアをlog.txtに記録する
- 正解の場合
  - スコアが100点加算
  - 連続正解した場合、(連続正解数-1)×100点スコアが追加で加算
  - 残りゲーム回数が1減る
- 不正解の場合
  - 残りゲーム回数が1減る
  - 連続正解数をリセット
- 初めの数字と次の数字が同じ数字だった場合
  - 残りゲーム回数は変動しない
  - 連続正解数も変動しない
