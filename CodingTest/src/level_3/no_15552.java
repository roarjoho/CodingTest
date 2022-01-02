package level_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class no_15552 {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	//1. 입출력 객체 생성
	BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bWriter = new BufferedWriter(new OutputStreamWriter(System.out));
	
	//2. 반복횟수 입력받음
	int testCase = Integer.parseInt(bReader.readLine());
	
	//3. 입력값
	StringTokenizer strToken;
	
	//4. 반복문 실행하여 입력값의 연산결과 출력하기
	for (int i = 0; i < testCase; i++) {
		
		strToken = new StringTokenizer(bReader.readLine()," ");
		bWriter.write(Integer.parseInt(strToken.nextToken()) + Integer.parseInt(strToken.nextToken())+"\n");
	}
	bReader.close();
	bWriter.flush();
	bWriter.close();
	
}
}
