// Java program to illustrate renaming and
// moving a file permanently to a new loaction
import java.io.*;
import java.nio.file.Files;
import java.nio.file.*;

public class MoveFiles
{
  public static void main(String[] args) throws IOException {
    //String temp_file_name = "1821";
    for (int i=2872; i < 4030; i++){
      Path temp = Files.move
          (Paths.get(
              "D:\\Pics_Video\\Marriage\\19.11.2015 Saya Zenith Indirapuram   SundarKaand Path and Dinner at Raj  all_video\\Sagan &  Wedding Hariduar\\204_"+i+"_01\\204_"+i+"_01.MP4"),
              Paths.get(
                  "D:\\Pics_Video\\Marriage\\19.11.2015 Saya Zenith Indirapuram   SundarKaand Path and Dinner at Raj  all_video\\Sagan &  Wedding Hariduar\\204_"+i+"_01.MP4"));
      //temp_file_name=temp_file_name+i;
    }


//    if(temp != null)
//    {
//      System.out.println("File renamed and moved successfully");
//    }
//    else
//    {
//      System.out.println("Failed to move the file");
//    }
//
  }
}

