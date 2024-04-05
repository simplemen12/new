package problem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class PgManager {
   
   // Map<String, HashMap<String, String>> subjects  = new HashMap<>();
    Map<String, String> users = new HashMap<>();
    String loggedInId = null;
    private static int idCounter = 1;
    private HashMap<String, Double> subjectPercentages = new HashMap<>();
    HashMap<String, ArrayList<String>> problemsBySubject = new HashMap<>();
    String loggedInUserType = null;
    
   
    HashMap<String, String> problemExplain = new HashMap<>();
    HashMap<String, String> problemSubject = new HashMap<>();
    HashMap<String, String> tmp = new HashMap<>();
 // 대단원 이름을 키로 소단원과 문제를 저장할 Map
    Map<String, Map<String, String>> bigUnits = new HashMap<>();
    Map<String, Map<String, String>> bigUnitAnswers = new HashMap<>();
    Map<String, Map<String, String>> bigUnitExplanations = new HashMap<>();
    
    HashMap<String, Double> subjectRatios = new HashMap<>();
    Map<String, HashMap<String, String>> subjects  = new HashMap<>();
    
    //해사영어 국제협약
    HashMap<String, String> problems = new HashMap<>(); // HashMap<String, String>으로 변경
    HashMap<String, String> problemAnswers = new HashMap<>();
    HashMap<String, String> userAnswers = new HashMap<>();
    
    //해사영어 항해운용
    HashMap<String, String> problems1 = new HashMap<>(); // HashMap<String, String>으로 변경
    HashMap<String, String> problemAnswers1 = new HashMap<>();
    HashMap<String, String> userAnswers1 = new HashMap<>();
    
    //해사영어 smcp
    HashMap<String, String> problems2 = new HashMap<>(); // HashMap<String, String>으로 변경
    HashMap<String, String> problemAnswers2 = new HashMap<>();
    HashMap<String, String> userAnswers2 = new HashMap<>();
    
    //일일복습
    HashMap<String, String> problems3 = new HashMap<>(); // HashMap<String, String>으로 변경
    HashMap<String, String> problemAnswers3 = new HashMap<>();
    HashMap<String, String> userAnswers3 = new HashMap<>();
    
    
    
  

    
 
    
    public void createProblems() {
        int totalProblems = 20;  

        for (String subject : subjectPercentages.keySet()) {
            int numProblems = (int) Math.round(totalProblems * subjectPercentages.get(subject));  // 해당 과목의 문제 수
            for (int i = 0; i < numProblems; i++) {
                // 문제를 출제하는 코드를 여기에 작성합니다.
                // 이 부분은 문제 출제 방식에 따라 다르게 구현해야 합니다.
            }
        }
    }
    
    
    public void WorkbookRegister123(Scanner scan) {
        try {
            if (loggedInUserType == null || !loggedInUserType.equals("admin")) {
                System.out.println("관리자의 권한이 없습니다.");
                return;
            }
            
            System.out.println("문장 단위로 ox문제를 기입해주세요.");
            String input = scan.nextLine();
            while (!input.endsWith(",")) {
                System.out.println("문장의 끝에 ','를 붙여주세요.");
                input += " " + scan.nextLine();
            }

            // 과목을 선택하지 않고 문제를 입력받은 후 문제를 저장
            String[] split = input.split(",");
            if (split.length < 2) {
                System.out.println("올바른 형식으로 입력해주세요.");
                return;
            }
            
            String problemId = "Q" + idCounter++;
            String problem = split[0].trim();
            String answer = split[1].trim();

            problems.put(problemId, problem); // 문제 내용 저장
            problemAnswers.put(problemId, answer); // 정답 저장
        } catch (Exception e) {
            System.out.println("문제 등록 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

      
              

    


    public void WorkbookRegister12(Scanner scan) {
        if(loggedInUserType == null || !loggedInUserType.equals("admin")) {
            System.out.println("관리자의 권한이 없습니다.");
            return;
        }
        try {
            System.out.println("문장 단위로 ox문제를 기입해주세요 .");
            String input = scan.nextLine();
            while (!input.endsWith(".")) {
                System.out.println("문장의 끝에 '.'를 붙여주세요.");
                input += " " + scan.nextLine();
            }

            System.out.println("다음 중 등록할 과목을 선택해주세요:");
            int index = 1;
            for (String subject : subjects.keySet()) {
                System.out.println(index + ". " + subject);
                index++;
            }

            String subjectSelection = scan.nextLine();
            int selectedSubjectIndex = Integer.parseInt(subjectSelection);
            List<String> subjectList = new ArrayList<>(subjects.keySet());
            if (selectedSubjectIndex >= 1 && selectedSubjectIndex <= subjectList.size()) {
                String selectedSubject = subjectList.get(selectedSubjectIndex - 1);
                String[] split = input.split(",");
                String problemId = "Q" + idCounter++;
                String problem = split[0].trim();
                String explains = split[1].trim();
                String answer = split[2].trim();

                problems.put(problemId, problem); // 문제 내용 저장
                problemAnswers.put(problemId, answer); // 정답 저장
                problemExplain.put(problemId, explains); // 해설 저장
                problemSubject.put(problemId, selectedSubject); // 단원 저장
                if (!problemsBySubject.containsKey(selectedSubject)) {
                    problemsBySubject.put(selectedSubject, new ArrayList<>());
                }
                problemsBySubject.get(selectedSubject).add(problemId);
                System.out.println("문제가 등록되었습니다. 문제 ID: " + problemId);
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("단원 번호는 숫자로 입력해주세요.");
        }
    }

    public void WorkbookRegister1(Scanner scan) {
        if(loggedInUserType == null || !loggedInUserType.equals("admin")) {
            System.out.println("관리자의 권한이 없습니다.");
            return;
        }
        try {
            System.out.println("문장 단위로 ox문제를 기입해주세요 .");
            String input = scan.nextLine();
            while (!input.endsWith(".")) {
                System.out.println("문장의 끝에 '.'를 붙여주세요.");
                input += " " + scan.nextLine();
            }

            System.out.println("문제를 등록한 과목 이름을 입력해주세요.");
            String subject = scan.nextLine();
           // System.out.println("문제를 등록한 단원을 입력해주세요."); 
           // String chapter = "단원" + scan.nextLine();

            if(subjects.containsKey(subject) ) { //&&&& subjects.get(subject).containsKey(chapter)
                String[] split = input.split(",");
                String problemId = "Q" + idCounter++;
                String problem = split[0].trim();
                String explains = split[1].trim();
                String answer = split[2].trim();

                problems.put(problemId, problem); // 문제 내용 저장
                problemAnswers.put(problemId, answer); // 정답 저장
                problemExplain.put(problemId, explains); // 해설 저장
                problemSubject.put(problemId, subject); //단원 저장-----------------
                if (!problemsBySubject.containsKey(subject)) {
                    problemsBySubject.put(subject, new ArrayList<>());
                }
                problemsBySubject.get(subject).add(problemId);
               // subjects.get(subject).put(chapter, problemId);
                System.out.println("문제가 등록되었습니다. 문제 ID: " + problemId);
            } else {
                System.out.println("과목 또는 단원이 올바르지 않습니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("단원 번호는 숫자로 입력해주세요.");
        }
    }
    
    public void signUp(Scanner scan) {
        System.out.println("[회원가입] 아이디 입력 >");
        String id = scan.nextLine();
        
        System.out.println("[회원가입] 비밀번호 입력 >");
        String password = scan.nextLine();
        
        System.out.println("관리자 계정이면 'admin', 일반 사용자 계정이면 'user'를 입력해주세요.");
        String usertype = scan.nextLine();
        
        if(usertype.equals("admin") || usertype.equals("user")){
           users.put(id, password + ","+usertype);
           System.out.println("┌───────────────────┐\r\n"
                    + "      회원가입 완료!\r\n"
                    + "└───────────────────┘\r\n"
                    + "");

        }
        else {
           System.out.println("사용자 유형을 제대로 입력해주세요.");
        }
        if(usertype.equals("admin")) {
           this.loggedInUserType = "admin";
        }
        else {
           this.loggedInUserType = "user";
        }
        System.out.println("회원가입이 완료되었습니다.");
           
        
     }

 
    public void 해사영어국제협약m(Scanner scan) {
        String fileNameProblems = "해사영어_국제협약_problems" + System.currentTimeMillis() + ".txt";
        String fileNameAnswers = "해사영어-국제협약-답안_answers" + System.currentTimeMillis() + ".txt";

        try {
            FileWriter fwProblems = new FileWriter(fileNameProblems);
            FileWriter fwAnswers = new FileWriter(fileNameAnswers);

            // 모든 문제 ID를 리스트에 저장
            List<String> allProblemIds = new ArrayList<>(problems.keySet());
            Collections.shuffle(allProblemIds);

            int numProblems = Math.min(50, allProblemIds.size()); // 문제가 저장된 수만큼 랜덤하게 저장
            for (int i = 0; i < numProblems; i++) {
                String problemId = allProblemIds.get(i);
                String problem = problems.get(problemId);
                String answer = problemAnswers.get(problemId);
                
                
                System.out.println("문제 Id : " + problemId);
                System.out.println("문제 : " + problem);

                // 사용자 답변 받기
                String userAnswer = "";
                while (!(userAnswer.equals("O") || userAnswer.equals("X"))) {
                    System.out.println("답을 입력하세요: (O/X)");
                    userAnswer = scan.nextLine().toUpperCase();
                    if (!(userAnswer.equals("O") || userAnswer.equals("X"))) {
                        System.out.println("답변은 'O' 또는 'X'로 입력해주세요.");
                    }
                }
                userAnswers.put(problemId, userAnswer);

                // 문제와 답안을 파일에 쓰기
                fwProblems.write("문제 ID: " + problemId + "\n");
                
                fwProblems.write("문제: " + problem + "\n\n");

                fwAnswers.write("문제 ID: " + problemId + "\n");
                fwAnswers.write("정답: " + answer + "\n");
                fwAnswers.write("사용자 답변: " + userAnswer + "\n\n");
            }

            fwProblems.close();
            fwAnswers.close();

            System.out.println("문제를 다 풀었습니다.");
            System.out.println("문제, 답안, 해설 파일에 쓰기가 완료되었습니다.");
            System.out.println("문제 파일명: " + fileNameProblems);
            System.out.println("답안 파일명: " + fileNameAnswers);

        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
    
    public void 해사영어항해운용m(Scanner scan) {
        String fileNameProblems = "해사영어_항해운용" + System.currentTimeMillis() + ".txt";
        String fileNameAnswers = "해사영어_항해운용_답안" + System.currentTimeMillis() + ".txt";

        try {
            FileWriter fwProblems = new FileWriter(fileNameProblems);
            FileWriter fwAnswers = new FileWriter(fileNameAnswers);

            // 모든 문제 ID를 리스트에 저장
            List<String> allProblemIds = new ArrayList<>(problems1.keySet());
            Collections.shuffle(allProblemIds);

            int numProblems = Math.min(25, allProblemIds.size()); // 문제가 저장된 수만큼 랜덤하게 저장
            for (int i = 0; i < numProblems; i++) {
                String problemId = allProblemIds.get(i);
                String problem = problems1.get(problemId);
                String answer = problemAnswers1.get(problemId);
                
                
                System.out.println("문제 Id : " + problemId);
                System.out.println("문제 : " + problem);

                // 사용자 답변 받기
                String userAnswer = "";
                while (!(userAnswer.equals("O") || userAnswer.equals("X"))) {
                    System.out.println("답을 입력하세요: (O/X)");
                    userAnswer = scan.nextLine().toUpperCase();
                    if (!(userAnswer.equals("O") || userAnswer.equals("X"))) {
                        System.out.println("답변은 'O' 또는 'X'로 입력해주세요.");
                    }
                }
                userAnswers1.put(problemId, userAnswer);

                // 문제와 답안을 파일에 쓰기
                fwProblems.write("문제 ID: " + problemId + "\n");
               
                fwProblems.write("문제: " + problem + "\n\n");

                fwAnswers.write("문제 ID: " + problemId + "\n");
                fwAnswers.write("정답: " + answer + "\n");
                fwAnswers.write("사용자 답변: " + userAnswer + "\n\n");
            }

            fwProblems.close();
            fwAnswers.close();

            System.out.println("문제를 다 풀었습니다.");
            System.out.println("문제, 답안, 해설 파일에 쓰기가 완료되었습니다.");
            System.out.println("문제 파일명: " + fileNameProblems);
            System.out.println("답안 파일명: " + fileNameAnswers);

        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
    
    public void 해사영어smcpm(Scanner scan) {
        String fileNameProblems = "해사영어[smcp]문제" + System.currentTimeMillis() + ".txt";
        String fileNameAnswers = "해사영어[smcp]답안" + System.currentTimeMillis() + ".txt";

        try {
            FileWriter fwProblems = new FileWriter(fileNameProblems);
            FileWriter fwAnswers = new FileWriter(fileNameAnswers);

            // 모든 문제 ID를 리스트에 저장
            List<String> allProblemIds = new ArrayList<>(problems2.keySet());
            Collections.shuffle(allProblemIds);

            int numProblems = Math.min(25, allProblemIds.size()); // 문제가 저장된 수만큼 랜덤하게 저장
            for (int i = 0; i < numProblems; i++) {
                String problemId = allProblemIds.get(i);
                String problem = problems2.get(problemId);
                String answer = problemAnswers2.get(problemId);
                
                
                System.out.println("문제 Id : " + problemId);
                System.out.println("문제 : " + problem);

                // 사용자 답변 받기
                String userAnswer = "";
                while (!(userAnswer.equals("O") || userAnswer.equals("X"))) {
                    System.out.println("답을 입력하세요: (O/X)");
                    userAnswer = scan.nextLine().toUpperCase();
                    if (!(userAnswer.equals("O") || userAnswer.equals("X"))) {
                        System.out.println("답변은 'O' 또는 'X'로 입력해주세요.");
                    }
                }
                userAnswers2.put(problemId, userAnswer);

                // 문제와 답안을 파일에 쓰기
                fwProblems.write("문제 ID: " + problemId + "\n");
               
                fwProblems.write("문제: " + problem + "\n\n");

                fwAnswers.write("문제 ID: " + problemId + "\n");
                fwAnswers.write("정답: " + answer + "\n");
                fwAnswers.write("사용자 답변: " + userAnswer + "\n\n");
            }

            fwProblems.close();
            fwAnswers.close();

            System.out.println("문제를 다 풀었습니다.");
            System.out.println("문제, 답안, 해설 파일에 쓰기가 완료되었습니다.");
            System.out.println("문제 파일명: " + fileNameProblems);
            System.out.println("답안 파일명: " + fileNameAnswers);

        } catch (IOException e) {
            System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
        }
    }

  

   //ox문제 검색 메서드
   public void Search(Scanner scan) {
      //1. 입력된 문제 검색 및 출력
      //2. 풀이한 문제 검색 및 출력
      //3. 변형한 문제 검색 및 출력
      String problemId = "";
       while (problemId.isEmpty()) {
           scan.nextLine();  // 버퍼에 남아있는 개행 문자를 처리
           System.out.println("검색하고자 하는 문제의 ID를 입력해주세요 ");
           problemId = scan.nextLine().trim();
           if (problemId.isEmpty()) {
               System.out.println("문제 ID를 입력하지 않으셨습니다. 다시 입력해주세요.");
           }
       }

       if(problems.containsKey(problemId)){
           System.out.println("문제 Id : "+problemId);
           System.out.println("문제 : "+problems.get(problemId)); 
           for(String sub : subjects.keySet()) {
               for(String chap : subjects.get(sub).keySet()) {
                  String chapProblemId = subjects.get(sub).get(chap);
                  // 단원에 등록된 문제 ID와 일치하는 경우
                   if(chapProblemId != null && chapProblemId.equals(problemId)) { 
                       System.out.println("과목 : "+sub+" / 단원 : "+chap);
                       return;
                   }
               }
           }
       } else {
           System.out.println("해당 Id의 문제를 찾을 수 없습니다.");
       }
   }
   
  

   
   
   
   
   
   public void Resert1() {
       int total = 0;
       int correct = 0;

       for (String problemId : userAnswers3.keySet()) {
           String correctAnswer = problemAnswers3.get(problemId);
           String userAnswer = userAnswers3.get(problemId);
           String expalains = problemExplain.get(problemId);
//contains포함
           if (correctAnswer != null && correctAnswer.toUpperCase().equals(userAnswer) && correctAnswer.toUpperCase().contains(userAnswer)) {
               correct++;
               tmp.put(problemId, expalains);
           }
           total++;
       }

       System.out.println("총 문제 수: " + total);
       System.out.println("정답 수: " + correct);
       System.out.println("해설: " + tmp);
   }
   
  

  

  
  
  

   
   public void 해사영어국제협약() {
	    String fileName = "해사영어[국제협약].txt";

	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] split = line.split(","); // 쉼표(,)로 데이터를 분리합니다.
	           
	            String problemId = "Q" + idCounter++;
	         
	            
	            String problem = split[0].trim(); // 문제 내용을 추출합니다.
	          
	            String answer = split[1].trim(); // 정답을 추출합니다.
	            
	            

	            // 문제 ID를 키로 하여 문제, 해설, 정답을 저장합니다.
	            problems.put(problemId, problem);
	            problemAnswers.put(problemId, answer);
	          
                        
                     

	           
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
   public void 해사영어항해운용() {
	    String fileName = "해사영어[항해운용].txt";

	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] split = line.split(","); // 쉼표(,)로 데이터를 분리합니다.
	           
	            String problemId = "Q" + idCounter++;
	         
	            
	            String problem = split[0].trim(); // 문제 내용을 추출합니다.
	          
	            String answer = split[1].trim(); // 정답을 추출합니다.
	            
	            

	            // 문제 ID를 키로 하여 문제, 해설, 정답을 저장합니다.
	            problems1.put(problemId, problem);
	            problemAnswers1.put(problemId, answer);
	          
                      
                   

	           
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

   
   public void 해사영어smcp() {
	    String fileName = "해사영어[smcp].txt";

	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] split = line.split(","); // 쉼표(,)로 데이터를 분리합니다.
	           
	            String problemId = "Q" + idCounter++;
	         
	            
	            String problem = split[0].trim(); // 문제 내용을 추출합니다.
	          
	            String answer = split[1].trim(); // 정답을 추출합니다.
	            
	            

	            // 문제 ID를 키로 하여 문제, 해설, 정답을 저장합니다.
	            problems2.put(problemId, problem);
	            problemAnswers2.put(problemId, answer);
	          
                       
                    

	           
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}

   //---------------------------------------------------------------- 추가부분
   
   public void 일일복습() {
	    String fileName = "일일복습.txt";

	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            String[] split = line.split(","); // 쉼표(,)로 데이터를 분리합니다.
	            if (split.length < 2) {
	                // split 배열의 길이가 2보다 작으면 유효한 데이터가 아니므로 건너뜁니다.
	                continue;
	            }
	           
	            String problemId = "Q" + idCounter++;
	         
	            
	            String problem = split[0].trim(); // 문제 내용을 추출합니다.
	          
	            String answer = split[1].trim(); // 정답을 추출합니다.
	            
	            

	            // 문제 ID를 키로 하여 문제, 해설, 정답을 저장합니다.
	            problems3.put(problemId, problem);
	            problemAnswers3.put(problemId, answer);
	          
	                  
	                   

	           
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


   
   public void 일일복습m(Scanner scan) {
       String fileNameProblems = "일일복습 문제" + System.currentTimeMillis() + ".txt";
       String fileNameAnswers = "일일복습 답안" + System.currentTimeMillis() + ".txt";

       try {
           FileWriter fwProblems = new FileWriter(fileNameProblems);
           FileWriter fwAnswers = new FileWriter(fileNameAnswers);

           // 모든 문제 ID를 리스트에 저장
           List<String> allProblemIds = new ArrayList<>(problems3.keySet());
           Collections.shuffle(allProblemIds);

           int numProblems = Math.min(allProblemIds.size(), allProblemIds.size()); // 문제가 저장된 수만큼 랜덤하게 저장
           for (int i = 0; i < numProblems; i++) {
               String problemId = allProblemIds.get(i);
               String problem = problems3.get(problemId);
               String answer = problemAnswers3.get(problemId);
               
               
               System.out.println("문제 Id : " + problemId);
               System.out.println("문제 : " + problem);

               // 사용자 답변 받기
               String userAnswer = "";
              // while (!(userAnswer.equals("O") || userAnswer.equals("X"))) {
                 //  System.out.println("답을 입력하세요: (O/X)");
                //   userAnswer = scan.nextLine().toUpperCase();
               //    if (!(userAnswer.equals("O") || userAnswer.equals("X"))) {
               //        System.out.println("답변은 'O' 또는 'X'로 입력해주세요.");
               //    }
              // }
               userAnswers3.put(problemId, userAnswer);

               // 문제와 답안을 파일에 쓰기
               fwProblems.write("문제 ID: " + problemId + "\n");
              
               fwProblems.write("문제: " + problem + "\n\n");

               fwAnswers.write("문제 ID: " + problemId + "\n");
               fwAnswers.write("정답: " + answer + "\n");
              // fwAnswers.write("사용자 답변: " + userAnswer + "\n\n");
           }

           fwProblems.close();
           fwAnswers.close();

           System.out.println("문제를 다 풀었습니다.");
           System.out.println("문제, 답안, 해설 파일에 쓰기가 완료되었습니다.");
           System.out.println("문제 파일명: " + fileNameProblems);
           System.out.println("답안 파일명: " + fileNameAnswers);

       } catch (IOException e) {
           System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
       }
   }
   
   public void 일일복습3m(Scanner scan) {
	    String fileNameProblems = "일일복습2 문제" + System.currentTimeMillis() + ".txt";
	    String fileNameAnswers = "일일복습2 답안" + System.currentTimeMillis() + ".txt";

	    try {
	        FileWriter fwProblems = new FileWriter(fileNameProblems);
	        FileWriter fwAnswers = new FileWriter(fileNameAnswers);

	        Set<String> selectedProblemIds = new HashSet<>(); // 이미 선택된 문제 ID를 추적하는 Set

	        int numProblemsToSelect = Math.min(100, problems3.size()); // 문제가 저장된 수만큼 랜덤하게 저장
	        int numProblemsSelected = 0;

	        while (numProblemsSelected < numProblemsToSelect) {
	            // 모든 문제 ID를 리스트에 저장
	            List<String> allProblemIds = new ArrayList<>(problems3.keySet());
	            Collections.shuffle(allProblemIds);

	            for (String problemId : allProblemIds) {
	                if (!selectedProblemIds.contains(problemId)) { // 이미 선택된 문제가 아닌 경우에만 선택
	                    String problem = problems3.get(problemId);
	                    String answer = problemAnswers3.get(problemId);

	                    System.out.println("문제 Id : " + problemId);
	                    System.out.println("문제 : " + problem);

	                    // 사용자 답변 받기
	                    String userAnswer = "";
	                    while (true) {
	                        System.out.println("답을 입력하세요:");
	                        userAnswer = scan.nextLine();

	                        // 사용자 답변이 정답을 포함하거나 정확히 일치하는 경우 모르면 e enter의 약자
	                        if (userAnswer.contains(answer) || userAnswer.equals(answer) || userAnswer.equals("e")) {
	                            break;
	                        }
	                    }
	                    userAnswers3.put(problemId, userAnswer);

	                    // 문제와 답안을 파일에 쓰기
	                    fwProblems.write("문제 ID: " + problemId + "\n");
	                    fwProblems.write("문제: " + problem + "\n\n");

	                    fwAnswers.write("문제 ID: " + problemId + "\n");
	                    fwAnswers.write("정답: " + answer + "\n");
	                    fwAnswers.write("사용자 답변: " + userAnswer + "\n\n");

	                    selectedProblemIds.add(problemId); // 선택한 문제 ID를 Set에 추가
	                    numProblemsSelected++; // 선택한 문제 수 증가

	                    if (numProblemsSelected >= numProblemsToSelect) {
	                        break; // 목표 문제 수를 달성하면 루프 종료
	                    }
	                }
	            }
	        }

	        fwProblems.close();
	        fwAnswers.close();

	        System.out.println("문제를 다 풀었습니다.");
	        System.out.println("문제, 답안, 해설 파일에 쓰기가 완료되었습니다.");
	        System.out.println("문제 파일명: " + fileNameProblems);
	        System.out.println("답안 파일명: " + fileNameAnswers);

	    } catch (IOException e) {
	        System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
	    }
	}

   public void 일일복습4m(Scanner scan) {
	    String fileNameProblems = "일일복습2 문제" + System.currentTimeMillis() + ".txt";
	    String fileNameAnswers = "일일복습2 답안" + System.currentTimeMillis() + ".txt";

	    try {
	        FileWriter fwProblems = new FileWriter(fileNameProblems);
	        FileWriter fwAnswers = new FileWriter(fileNameAnswers);

	        Set<String> selectedProblemIds = new HashSet<>(); // 이미 선택된 문제 ID를 추적하는 Set

	        int numProblemsToSelect = Math.min(100, problems3.size()); // 문제가 저장된 수만큼 랜덤하게 저장
	        int numProblemsSelected = 0;

	        while (numProblemsSelected < numProblemsToSelect) {
	            // 모든 문제 ID를 리스트에 저장
	            List<String> allProblemIds = new ArrayList<>(problems3.keySet());
	            Collections.shuffle(allProblemIds);

	            for (String problemId : allProblemIds) {
	                if (!selectedProblemIds.contains(problemId)) { // 이미 선택된 문제가 아닌 경우에만 선택
	                    String problem = problems3.get(problemId);
	                    String answer = problemAnswers3.get(problemId);

	                    System.out.println("문제 Id : " + problemId);
	                    System.out.println("문제 : " + problem);

	                    // 사용자 답변 받기
	                    String userAnswer = "";
	                    while (true) {
	                        System.out.println("답을 입력하세요:");
	                        userAnswer = scan.nextLine();

	                        // 사용자 답변이 정답을 포함하거나 정확히 일치하는 경우 모르면 e enter의 약자
	                        if (userAnswer.contains(answer) || userAnswer.equals(answer) || userAnswer.equals("e")) {
	                            break;
	                        }
	                    }
	                    userAnswers3.put(problemId, userAnswer);

	                    // 문제와 답안을 파일에 쓰기
	                    fwProblems.write(String.join(",", "문제 ID: " + problemId, "문제: " + problem) + "\n");
	                    fwAnswers.write(String.join(",", "문제 ID: " + problemId, "정답: " + answer, "사용자 답변: " + userAnswer) + "\n");

	                    selectedProblemIds.add(problemId); // 선택한 문제 ID를 Set에 추가
	                    numProblemsSelected++; // 선택한 문제 수 증가

	                    if (numProblemsSelected >= numProblemsToSelect) {
	                        break; // 목표 문제 수를 달성하면 루프 종료
	                    }
	                }
	            }
	        }

	        fwProblems.close();
	        fwAnswers.close();

	        System.out.println("문제를 다 풀었습니다.");
	        System.out.println("문제, 답안, 해설 파일에 쓰기가 완료되었습니다.");
	        System.out.println("문제 파일명: " + fileNameProblems);
	        System.out.println("답안 파일명: " + fileNameAnswers);

	    } catch (IOException e) {
	        System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
	    }
	}

   public void 일일복습2m(Scanner scan) {
	    String fileNameProblems = "일일복습2 문제" + System.currentTimeMillis() + ".txt";
	    String fileNameAnswers = "일일복습2 답안" + System.currentTimeMillis() + ".txt";

	    try {
	        FileWriter fwProblems = new FileWriter(fileNameProblems);
	        FileWriter fwAnswers = new FileWriter(fileNameAnswers);

	        // 모든 문제 ID를 리스트에 저장
	        List<String> allProblemIds = new ArrayList<>(problems3.keySet());
	        Collections.shuffle(allProblemIds);

	        int numProblems = Math.min(100, allProblemIds.size()); // 문제가 저장된 수만큼 랜덤하게 저장
	        for (int i = 0; i < numProblems; i++) {
	            String problemId = allProblemIds.get(i);
	            String problem = problems3.get(problemId);
	            String answer = problemAnswers3.get(problemId);

	            System.out.println("문제 Id : " + problemId);
	            System.out.println("문제 : " + problem);

	            // 사용자 답변 받기
	            String userAnswer = "";
	            while (true) {
	                System.out.println("답을 입력하세요:");
	                userAnswer = scan.nextLine();

	                // 사용자 답변이 정답을 포함하거나 정확히 일치하는 경우 모르면 e enter의 약자 
	                if (userAnswer.contains(answer) || userAnswer.equals(answer) ||userAnswer.equals("e")) {
	                    break;
	                }
	            }
	            userAnswers3.put(problemId, userAnswer);

	            // 문제와 답안을 파일에 쓰기
	            fwProblems.write("문제 ID: " + problemId + "\n");
	            fwProblems.write("문제: " + problem + "\n\n");

	            fwAnswers.write("문제 ID: " + problemId + "\n");
	            fwAnswers.write("정답: " + answer + "\n");
	            fwAnswers.write("사용자 답변: " + userAnswer + "\n\n");
	        }

	        fwProblems.close();
	        fwAnswers.close();

	        System.out.println("문제를 다 풀었습니다.");
	        System.out.println("문제, 답안, 해설 파일에 쓰기가 완료되었습니다.");
	        System.out.println("문제 파일명: " + fileNameProblems);
	        System.out.println("답안 파일명: " + fileNameAnswers);

	    } catch (IOException e) {
	        System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
	    }
	}
   
   public void 일일복습4m1(Scanner scan) {
	    String fileNameProblems = "일일복습2 문제" + System.currentTimeMillis() + ".txt";
	    String fileNameAnswers = "일일복습2 답안" + System.currentTimeMillis() + ".txt";
	    String fileNameIncorrectAnswers = "일일복습2 오답" + System.currentTimeMillis() + ".txt";

	    try {
	        FileWriter fwProblems = new FileWriter(fileNameProblems);
	        FileWriter fwAnswers = new FileWriter(fileNameAnswers);
	        FileWriter fwIncorrectAnswers = new FileWriter(fileNameIncorrectAnswers);

	        Set<String> selectedProblemIds = new HashSet<>(); // 이미 선택된 문제 ID를 추적하는 Set

	        int numProblemsToSelect = Math.min(100, problems3.size()); // 문제가 저장된 수만큼 랜덤하게 저장
	        int numProblemsSelected = 0;

	        while (numProblemsSelected < numProblemsToSelect) {
	            // 모든 문제 ID를 리스트에 저장
	            List<String> allProblemIds = new ArrayList<>(problems3.keySet());
	            Collections.shuffle(allProblemIds);

	            for (String problemId : allProblemIds) {
	                if (!selectedProblemIds.contains(problemId)) { // 이미 선택된 문제가 아닌 경우에만 선택
	                    String problem = problems3.get(problemId);
	                    String answer = problemAnswers3.get(problemId);

	                    System.out.println("문제 Id : " + problemId);
	                    System.out.println("문제 : " + problem);

	                    // 사용자 답변 받기
	                    String userAnswer = "";
	                    while (true) {
	                        System.out.println("답을 입력하세요:");
	                        userAnswer = scan.nextLine();

	                        // 사용자 답변이 정답을 포함하거나 정확히 일치하는 경우 모르면 e enter의 약자
	                        if (userAnswer.contains(answer) || userAnswer.equals(answer) || userAnswer.equals("e")) {
	                            break;
	                        }
	                    }

	                    // 사용자 답이 정답과 다른 경우
	                    if (!userAnswer.equals(answer)) {
	                        fwIncorrectAnswers.write("문제 ID: " + problemId + "\n");
	                        fwIncorrectAnswers.write("문제: " + problem + "\n");
	                        fwIncorrectAnswers.write("정답: " + answer + "\n");
	                        fwIncorrectAnswers.write("사용자 답변: " + userAnswer + "\n\n");
	                    }

	                    userAnswers3.put(problemId, userAnswer);

	                    // 문제와 답안을 파일에 쓰기
	                    fwProblems.write("문제 ID: " + problemId + "\n");
	                    fwProblems.write("문제: " + problem + "\n\n");

	                    fwAnswers.write("문제 ID: " + problemId + "\n");
	                    fwAnswers.write("정답: " + answer + "\n");
	                    fwAnswers.write("사용자 답변: " + userAnswer + "\n\n");

	                    selectedProblemIds.add(problemId); // 선택한 문제 ID를 Set에 추가
	                    numProblemsSelected++; // 선택한 문제 수 증가

	                    if (numProblemsSelected >= numProblemsToSelect) {
	                        break; // 목표 문제 수를 달성하면 루프 종료
	                    }
	                }
	            }
	        }

	        fwProblems.close();
	        fwAnswers.close();
	        fwIncorrectAnswers.close();

	        System.out.println("문제를 다 풀었습니다.");
	        System.out.println("문제, 답안, 오답 파일에 쓰기가 완료되었습니다.");
	        System.out.println("문제 파일명: " + fileNameProblems);
	        System.out.println("답안 파일명: " + fileNameAnswers);
	        System.out.println("오답 파일명: " + fileNameIncorrectAnswers);

	    } catch (IOException e) {
	        System.out.println("파일 쓰기 중 오류가 발생했습니다: " + e.getMessage());
	    }
	}


   
   

   

   
   public void signIn(Scanner scan) {
      boolean loginSuccess = false;

      while(!loginSuccess) {
          System.out.println("[로그인] 아이디 입력 >");
          String id = scan.nextLine();

          System.out.println("[로그인] 비밀번호 입력 >");
          String password = scan.nextLine();

          if(users.containsKey(id)) {
              String[] userInfo = users.get(id).split(",");
              if(userInfo[0].equals(password)) {
                  loggedInId = id;
                  String userType = userInfo[1];
                  System.out.println("┌───────────────────┐\r\n"
                                + "      로그인 성공!\r\n"
                                + "└───────────────────┘\r\n"
                                + ""); 
                  loginSuccess = true;
              }
              else {
                  System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄\r\n"
                          + "████▌▄▌▄▐▐▌█████\r\n"
                          + "████▌▄▌▄▐▐▌▀████\r\n"
                          + "████████████████");
              }
          }
          else {
              System.out.println("해당 Id가 존재하지 않습니다.");
          }
      }
   }
}
