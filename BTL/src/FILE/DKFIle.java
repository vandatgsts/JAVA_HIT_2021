package FILE;

import xeco.info.xeMay;

import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class DKFIle {

        private FileWriter fileWriter;
        private BufferedWriter bufferedWriter;
        private PrintWriter printWriter;
        private Scanner scanner;

        public Scanner getScanner(){
            return this.scanner;
        }

        public void OpenFileToWrite(String fileName){
            try {
                fileWriter = new FileWriter(fileName, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                printWriter = new PrintWriter(bufferedWriter);
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        public void CloseFileAfterWrite(){
            try {
                printWriter.close();
                bufferedWriter.close();
                fileWriter.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        public void OpenFileToRead(String fileName){
            try {
                scanner = new Scanner(Paths.get(fileName));
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        public void CloseFileAfterRead(){
            scanner.close();
        }

        //xeMay
        public void WritexeMayToFile(String fileName, xeMay acc){
            OpenFileToWrite(fileName);
            printWriter.println(
                    acc.toFile()
            );
            CloseFileAfterWrite();
        }

//       public xeMay CreatexeMayFromData(String data){
//            String[] datas = data.split("\\|");
//            xeMay acc = new xeMay(datas[0], datas[1], datas[2], datas[3], datas[4], datas[5], datas[6],datas[7], datas[8], datas[9], datas[10], datas[11]);
//            return acc;
//       }
//       public List<xeMay> ReadxeMayFromFile(String fileName){
//          OpenFileToRead(fileName);
//          List<xeMay> list = new ArrayList<>();
//           while(scanner.hasNext()){
//              String data = scanner.nextLine();
//              xeMay acc = CreatexeMayFromData(data);
//               list.add(acc);
//         }
//          CloseFileAfterRead();
//           return list;
//      }

        public void UpdatexeMayFile(List<xeMay> list, String fileName){
            File file = new File(fileName);
            if(file.exists()){
                file.delete();
            }
            OpenFileToWrite(fileName);
            for(xeMay acc : list){
                printWriter.println(acc.toFile());
            }
            CloseFileAfterWrite();
        }
    }

