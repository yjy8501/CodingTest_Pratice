package CodingTest;

public class Muzi_Live {
	class Solution {
	    public int solution(int[] food_times, long k) {
	    	int sum = 0; // 음식 먹는 시간의 총합
	    	int answer = 0; // 답
	    	for(int i = 0;i<food_times.length;i++) { // 음식 먹는 시간 총합 계산
	    		sum+= food_times[i];
	    	}
	    	if(sum<=k) { // 총합이 정지시간보다 작거나 같으면 -1 리턴
	    		return -1;
	    	}
	    	while(k!=0) { // k가 0이 아닐때까지 반복
	    		int j;
	    		for(j=0;j<food_times.length;j++) { // food_times[j] 인덱스의 값과 k를 1씩 감소
	    			k-=1;
	    			food_times[j]-=1;
	    			if(food_times[j]==0) { // food_times[j] 인덱스 값이 0과 같으면
	    				j+=1; // j 1 증가
	    				if(j>=food_times.length) break;// j가 리스트 길이보다 길다면 반복문 탈출
	    			}
	    		}
	    		answer = j;// 답에 j 대입
	    		if(answer >= food_times.length) j = 0;// 답이 리스트 길이보다 길다면 j를 0으로 초기화
	    		answer = j+1; // 답에 j+1 대입
	    	}
	    	return answer; // 결과 출력
	    	
	   }
	}

		
}
