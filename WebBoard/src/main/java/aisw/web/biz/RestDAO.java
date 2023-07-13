package aisw.web.biz;

import java.util.List;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RestDAO {
	
	// 뉴스리스트
    public List<BoardVO> getNewsList() throws JsonMappingException, JsonProcessingException {
        
    	// 뉴스 정보 받아로 url 입력
        String url = "http://localhost:8080/api/news";
        
        // RestTemplate 으로 JSON 결과값 받아오기
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, null, String.class);
        
        // 결과값 중 JSON 데이터만 가져오기
        String responseBody = null;
        if(response.getStatusCode().is2xxSuccessful()) {
        	responseBody = response.getBody();
        	System.out.println(responseBody);
        } else {
        	System.err.println("fail : " + response.getStatusCode());
        }
        
        // JSON 데이터를 VO로 mapping 하기(상대방 JSON에 맞는 VO를 생성해야 함)
        List<BoardVO> newsList = null;
        ObjectMapper mapper = new ObjectMapper();
        newsList = mapper.readValue(responseBody, new TypeReference<List<BoardVO>>() {});
        
    	return newsList;
    }

}
