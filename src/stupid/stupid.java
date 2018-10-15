package stupid;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class x {
	
    public static void main(String[] arg){       
		int CC=hohoho(arg);System.exit(CC);    
	}
	
    public static int hohoho(String args[]) {
        try{if(args.length != 2) return -1;
		String value1,value2 = new String(Files.readAllBytes(Paths.get(args[1]))); 
            value1 = new String(Files.readAllBytes(Paths.get(args[0])));
            int length = value1.length();
            if(length<4)  return -2;
			int count=0; 
			float ab=0;
            for(int i=0;i<length-3;i++){       
				for(int j=0;j<value2.length()-4;j+=1){
					int vOv = 0;
						for(int CC=0;CC<4;CC++){
							if(value1.charAt(i+CC) == value2.charAt(j+CC))              
								vOv ++;
					}      	
					if (vOv == 4){
						System.out.println("DEBUG:".concat(String.valueOf(i) + "," + String.valueOf(j)));
						count++; ab+=1;
					}else 
						++count;       
					}
				}
						System.out.println(String.valueOf(Math.round(ab)).concat("/")+ String.valueOf(count));   
						return 1;
		} catch(IOException ex){
			System.out.println("DEBUG:Error");
			return -3 ;
			}
		}
	}
